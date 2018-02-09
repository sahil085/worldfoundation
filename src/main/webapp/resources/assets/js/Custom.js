$(document).ready(function(){
$("#searchcourse").autocomplete({
    minLength: 1,
    delay: 500,
    //define callback to format results
    source: function (request, response) {
        $.getJSON("/fetchCourseName?${_csrf.parameterName}=${_csrf.token}", request, function(result) {
            response($.map(result, function(item) {
                return {
                    // following property gets displayed in drop down
                    label: item,
                    // following property gets entered in the textbox
                    value: item,
                    // following property is added for our own use
                    tag_url: "http://" + window.location.host + "/PreacherPanelCoursePage?cname="+item
                }
            }));
        });
    },

//            define select handler
    select : function(event, ui) {
        if (ui.item) {
            window.location.href=ui.item.tag_url;
//                    $("#selected_tags span").append('<a href=" + ui.item.tag_url + " target="_blank">'+ ui.item.label +'</a>');
//                    //$("#tagQuery").value = $("#tagQuery").defaultValue
//                    var defValue = $("#tagQuery").prop('defaultValue');
//                    $("#tagQuery").val(defValue);
//                    $("#tagQuery").blur();
//                    return false;
        }
    }
})

});