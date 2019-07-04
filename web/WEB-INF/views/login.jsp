<%--
  Created by IntelliJ IDEA.
  User: Oksana
  Date: 26.06.2019
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p><font color="red"> ${errorMessage}</font></p>
    <form action="login" method="post">
       <p> Name: <input name="name" type="text" /> </p>
        <p> Password: <input name="password" type="password"/></p>
        <input type="submit"/>
    </form>
</body>
</html>
