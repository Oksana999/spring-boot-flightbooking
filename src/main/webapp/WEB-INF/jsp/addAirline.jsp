<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/15/2019
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Airline</title>
</head>
<body>
    <%--<h1>Airline: ${airline.name }</h1>--%>
    <h1>Airline ${airline.name}</h1>
    <h2>Airline successfully created !</h2>

    <a href="${pageContext.request.contextPath}/">To home</a>

    <%--<h2>List of airlines: ${airlines.listIterator()}</h2>--%>

</body>
</html>
