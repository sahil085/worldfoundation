<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 8/13/2017
  Time: 5:48 AM
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
${msg}
<c:forEach var="list" items="${kirtanlist}">
    <div id="${list.id}">
    Client Emailid : ${list.emailOfUser}<br>
    place :  ${list.place}<br>
    Date  :  ${list.date}<br>
    Time  :  ${list.time}<br>
        <button name="${list.id}##${list.emailOfUser}" id="${list.id}"></button>
    </div>
</c:forEach>
<script>
    $(':button').click(function () {
        $.ajax({
            url:"sendacknowledgement?id="+$(this.name),
            method:"Post",
            success :function (response) {
                if(response=="send successfully")
                {
                    $(this.id).remove();
                    alert("send successfully");
                }
                else
                {
                    alert(this.name);
                   alert("error occured")
                }
            }
        })
    });
</script>
</body>
</html>
