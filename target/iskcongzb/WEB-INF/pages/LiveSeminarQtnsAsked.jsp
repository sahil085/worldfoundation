<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 8/19/2017
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
radhe radhe
<br>
<c:forEach var="list" items="${qtns}">
    QTN : ${list.id}&nbsp;&nbsp;&nbsp;
    ${list.qtn}
    <br>
</c:forEach>
</body>
</html>
