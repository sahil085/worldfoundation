<%@ page import="java.net.URL" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Live Seminar</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


    <style>
        #head{
            text-align: center;
        }
        #giveans
        {
            width: 450px;
            height: 300px;
            margin-left: 35px;
            text-align: center;
            position: absolute;
        }

        .qtns
        {

            margin-left:280px;
            height:60%; width:50%;
            overflow-y: auto;
            float: left;
            position: relative;
        }

        table{width:100%;}
        td{padding:5px; background:white;margin-left: 10px;}
    </style>
    <script>
        var url = '/qtnasked'

        $(document).ready(function() {

            $.ajaxSetup({ cache: false });

            setInterval(function() {$(".qtns").load(url); }, 5000);

        });
    </script>
</head>
<body bgcolor="yellow">
<div id="head">
    <marquee><h1>Hare Krishna Hare Krishna Krishna krishna Hare Hare Hare Ram Hare Ram Ram Ram Hare Hare</h1></marquee>
</div>

<br>
<h2 style="text-align: center;"> Questions </h2>

<div class="qtns">
</div>
<script>
//    $('#res').click(function () {
//        $.ajax({
//            url:"respond?ans="+$('#ans').val(),
//            method:"Post",
//            success :function (response) {
//                alert(response);
//                $('#ans').val("");
//            }
//        })
//    });
    <%--function autoRefresh_div()--%>
    <%--{--%>
        <%--$(".qtns").load('<%=%>');// a function which will load data from other file after x seconds--%>
    <%--}--%>

    <%--setInterval('autoRefresh_div()', 5000);--%>


</script>
</body>
</html>
