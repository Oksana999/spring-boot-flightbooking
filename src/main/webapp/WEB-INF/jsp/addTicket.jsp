<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/19/2019
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket</title>
</head>
<body>
        <h1>Passenger: ${ticket.passenger.firstName} ${ticket.passenger.lastName}
        successfully booked flight ${ticket.flight.cityDeparture}- ${ticket.flight.cityArrival}
            with place ${ticket.place}
        </h1>
        <a href="${pageContext.request.contextPath}/">To home</a>


</body>
</html>
