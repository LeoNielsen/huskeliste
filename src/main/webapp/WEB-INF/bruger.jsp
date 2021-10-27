<%--
  Created by IntelliJ IDEA.
  User: leoni
  Date: 26-10-2021
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bruger side</title>
</head>
<body>

du er nu logget ind som ${sessionScope.navn}

<h2>her kan du tilføje emne til din huskeliste</h2>

<form action="VisOversigtServlet" method="get">

    <input type="submit" value="gå til oversigt"><br>

</form>

<form action="TilføjEmneServlet" method="post">

    <label for="emne">emne: </label><br>
    <input type="text" id="emne" name="emne"><br>
    <input type="submit" value="tilføj emne">

</form>


<c:forEach items="${sessionScope.emneList}" var="emne">

    <div onclick="style.display='none'">
        <button type="button" >Delete</button>
    ${emne}
    </div>
    <br>

</c:forEach>

</body>
</html>
