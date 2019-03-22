<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/18/2019
  Time: 2:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new Flight</title>
</head>
<body>

        <h1>Flight from ${flight.cityDeparture } to ${flight.cityArrival }</h1>
        <h1>Data: ${flight.date.toLocalDate()} ${flight.date.toLocalTime()}</h1>
        <h1>Airline: ${flight.airline.name }</h1>

        <a href="${pageContext.request.contextPath}/">To home</a>

</body>
</html>
