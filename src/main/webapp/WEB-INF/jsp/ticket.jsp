<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/19/2019
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/createTicket">
    <lable>place:
    </lable>
    <select name="place">
        <option value="1-A">1-A</option>
        <option value="1-B">1-B</option>
        <option value="2-A">2-A</option>
        <option value="2-B">2-B</option>
        <option value="3-A">3-A</option>
        <option value="3-B">3-B</option>
    </select>

    <select name = "passengerId">
        <c:forEach items="${passengers}" var = "passenger">
            <option value = "${passenger.id}">
                    ${passenger.firstName} ${passenger.lastName}
            </option>
        </c:forEach>
    </select>

    <select name = "flightId">
        <c:forEach items="${flights}" var = "flight">
            <option value = "${flight.id}">
                    ${flight.cityDeparture } - ${flight.cityArrival}
            </option>
        </c:forEach>
    </select>
    <input type="submit" name = "submit">
</form>
        <a href="${pageContext.request.contextPath}/">To home</a>

</body>
</html>
