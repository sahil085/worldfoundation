<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Iskcongzbheader.jsp"></jsp:include>
<script>
    function getnumberofstudents(idd) {
        $.ajax({
            url: "/getcountofstudents?lid="+idd,
            method: "get",
            success: function (response) {
                $('#'+idd).text(response);
                console.log(response);
            },
            failure: function (response) {
                alert(response);
            }
        });
    }
</script>
<div class="container">
    <div class="col-sm-12">
    <div class="row">

        <div class="pull-left" style="color: red;">
               <h2>Search Course </h2><br>
                <input type="text" width="100%" id="searchcourseoncoursepage" class="pull-left" style="width: 100%"  placeholder="Search" >
            </div>
    </div>
        <div class="row">
            <hr>
            <div class=" single-property-header pull-left" style="color: red;">
               <h2> <span>Course Details :</span></h2>

            </div>
        </div>
        <div class="row">
            <div class="table-responsive table-bordered">
                <%--<h1 class="property-price pull-left"> Recent HarinaamSankirtan Nearby You</h1>--%>
                <%--<span class="property-tittle pull-right">Total Number Of kirtans<br>30</span>--%>
                <table border="1px" class="table" >
                    <thead>
                    <tr>
                        <b>
                            <th>Course Name</th>
                            <th>Vedic Level</th>
                            <th>Description</th>
                            <th>Creation Date</th>
                            <th>Creation Time</th>

                        </b>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="i" items="${courselist}">
                        <tr>
                            <td>${i.courseName}</td>
                            <td>${i.courseCategory}</td>
                            <td>${i.courseDescription}</td>
                            <td>${i.dateOfCreation}</td>
                            <td>${i.timeOfCreation}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<jsp:include page="IskcongzbFooter.jsp"></jsp:include>