<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/6/2017
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/addBooks?${_csrf.parameterName}=${_csrf.token}" enctype="multipart/form-data">
    book name : <input type="text" name="bookName">
    author : <input type="text" name="authorName"><br>
    quantity : <input type="number" name="quantity">
    price : <input type="number" name="price">
    book image : <input type="file" name="file">
    <input type="submit" >

</form>
</body>
</html>
