<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Allen
  Date: 2016/4/16
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
<h1>Welcomw to Spittr</h1>
<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>
