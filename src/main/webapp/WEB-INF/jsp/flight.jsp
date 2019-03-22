<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/15/2019
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Add new flight</h1>
        <form method="post" action="${pageContext.request.contextPath}/createFlight">
            <lable>cityDeparture:
                <input type="text" name="cityDeparture"><br/>
            </lable>
            <lable>cityArrival:
                <input type="text" name="cityArrival"><br/>
            </lable>
            <lable>date:
                <input type="date" name="date">
                <input type="time" name="time">
            </lable>


                <select name = "airlineSelector">
                    <c:forEach items="${airlines}" var = "airline">
                       <option value = "${airline.id}">
                           ${airline.name}
                       </option>
                    </c:forEach>
                </select>
            <input type="submit" name = "submit">
            </form>
    <a href="${pageContext.request.contextPath}/">To home</a>

</body>
</html>
