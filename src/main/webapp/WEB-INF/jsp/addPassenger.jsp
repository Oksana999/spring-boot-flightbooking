<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/15/2019
  Time: 2:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new passenger</title>
</head>
<body>
        <h1>Passenger: ${passenger.firstName } ${passenger.lastName }</h1>
        <%--/<h1>Passengers last name: ${passenger.lastName }</h1>--%>
        <h2>Passenger successfully created !</h2>

        <a href="${pageContext.request.contextPath}/">To home</a>
</body>
</html>
