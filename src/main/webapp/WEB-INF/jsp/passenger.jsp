<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/15/2019
  Time: 2:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add new passenger</h1>
<form method = "post" action ="${pageContext.request.contextPath}/registration">
    <lable>FirstName:
        <input type = "text" name = "firstName"><br/>
    </lable>

    <label>LastName:
        <input type = "text" name = "lastName"><br/>
    </label>
    <button type = "submit">Submit</button>
</form>
        <a href="${pageContext.request.contextPath}/">To home</a>

</body>
</html>
