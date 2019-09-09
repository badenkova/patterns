<%--
  Created by IntelliJ IDEA.
  User: Oksana
  Date: 09.09.2019
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<fmt:setBundle basename="text" var="text"/>
<html>
<head>
    <title>Show Error Page</title>
</head>
<body>
<h1>ERROR...</h1>
<table width="100%" border="1">
    <tr valign="top">
        <td><b>Status code:</b></td>
        <td>${error_message}</td>
    </tr>
</table>
</body>
</html>