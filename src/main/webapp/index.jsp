<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>online huskesedler</title>
</head>
<body>
<h1>velkommen til online huskesedler</h1>

${requestScope.msg}
<br>

her kan du oprette dit som bruger

<form action="hello-servlet" method="get">
    <label for="name">navn:</label><br>
    <input type="text" id="name" name="name" value="John"><br>

    <label for="pass1">password:</label><br>
    <input type="text" id="pass1" name="pass1"><br>

    <label for="pass2">gentag password:</label><br>
    <input type="text" id="pass2" name="pass2"><br>

    <br>

    <input type="submit" value="opret">

    <br><br>

</form>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>