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
    <form action="LoginServlet" method="post">
        <p>Вход в систему</p>
       <p> Имя: <input name="name" type="text" /> </p>
        <p> Пароль: <input name="password" type="password"/></p>
        <input class="button-main-page" type="submit" value="Войти"/>
    </form>
    <div>
    <form action="RegisterServlet" method="GET">
        <input class="button-main-page" type="submit" value="Регистрация"/>
    </form>
    </div>
</body>
</html>
