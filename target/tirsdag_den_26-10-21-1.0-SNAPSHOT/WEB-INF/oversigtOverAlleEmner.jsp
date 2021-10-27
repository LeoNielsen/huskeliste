<%--
  Created by IntelliJ IDEA.
  User: leoni
  Date: 26-10-2021
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt</title>
</head>
<body>
<h1>alle emner der er tilføjet af bruger</h1>

<c:forEach items="${applicationScope.allebrugersemner}" var="emne">

    ${emne}
    <br>

</c:forEach>
</body>
</html>
