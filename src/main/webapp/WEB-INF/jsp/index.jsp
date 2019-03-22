<%--
  Created by IntelliJ IDEA.
  User: Oksana Ross
  Date: 3/15/2019
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passenger Registration</title>
</head>
<br>
<style type="text/css">
      .my_content_container a {
            border: 1px solid #777777;
            border-bottom-style: wave;

            color: blue;
            text-decoration-color: darkturquoise;
            display: block;
            height: 1.5em;
            padding: 0 1em;
            width: 7em;
            text-decoration: none;
      }

</style>

<div class="my_content_container">
      <a href="${pageContext.request.contextPath}/redirectToPassenger">Create Passenger</a>
</div>
<br>

<div class="my_content_container">
<a href="${pageContext.request.contextPath}/redirectToAirline">Create Airline</a>
</div>
<br>

      <div class="my_content_container">
<a href="${pageContext.request.contextPath}/redirectToTicket">Create Ticket</a>
      </div>
<br>
            <div class="my_content_container">
<a href="${pageContext.request.contextPath}/redirectToFlight">Create Flight</a>
            </div>

<%--<form action="/redirectToPassenger" method="get">--%>
      <%--<input type="submit" value="Create Passenger"--%>
             <%--name="Submit" id="frm1_submit" />--%>
<%--</form>--%>




      <%--<button>--%>
      <%--<a href="${pageContext.request.contextPath}/redirectToPassenger"><input type= button>Create Passenger </a>--%>
<%--</button>--%>
      <%--</form>--%>

<%--<a href="${pageContext.request.contextPath}/redirectToPassenger">Create Passenger</a>--%>
      <%--<input type="button" value="" name="Create Passenger" /><br></br>--%>

</body>
</html>
