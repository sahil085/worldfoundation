<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Live Seminar</title>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>--%>
    <script src="/resources/jquery.1.10.2.min.js"></script>
    <style>
        #head{
            text-align: center;
        }
        #askqtnform{
            text-align: center;
        }
    </style>
</head>
<body bgcolor="yellow">
<div id="head">
    <marquee><h1>Hare Krishna Hare Krishna Krishna krishna Hare Hare Hare Ram Hare Ram Ram Ram Hare Hare</h1></marquee>
</div>
<br><br>
<div id="askqtnform" >
    <h3 >ASK ANY RELEVENT QUESTION WITHOUT HESITATION</h3>
    <h4> NOTE : Do not ask same question again</h4>
    Question : <br>
    <textarea id="qtn" cols="60" rows="10">

    </textarea>
    <br>
<input type="button" id="ask" value="Ask">
</div>
<script>
    $('#ask').click(function () {
        $.ajax({
            url:"askqtn?qtn="+$('#qtn').val(),
            method:"Post",
            success :function (response) {
            alert(response);
            $('#qtn').val("");
            }
        })
    });
</script>
</body>
</html>
