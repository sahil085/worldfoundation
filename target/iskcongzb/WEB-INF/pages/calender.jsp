<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 8/10/2017
  Time: 3:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.1/jquery.form.min.js"></script>

</head>
<body>
<h2>insert festival name and date</h2>
<form action="/insertintocalender" id="insertdateincalendar">
    date : <input type="text" name="date">
    festival name : <input type="text" name="festival">
    <input type="submit" value="insert">
</form>
<script>
    $('#insertdateincalendar').ajaxForm({

        success: function (msg) {
            alert(msg);
        },
        error: function (msg) {
            alert(msg);
        }
    });
</script>
</body>
</html>
