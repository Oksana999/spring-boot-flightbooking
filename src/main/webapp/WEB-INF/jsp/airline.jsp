<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/15/2019
  Time: 2:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Airline</title>
</head>
<body>
<h1>Add new airline</h1>
<form method = "post" action ="${pageContext.request.contextPath}/createAirline">
    <lable>Name:
        <input type = "text" name = "name">
        <input type="submit" name = "submit">
    </lable>
</form>
<a href="${pageContext.request.contextPath}/">To home</a>

</body>
</html>
