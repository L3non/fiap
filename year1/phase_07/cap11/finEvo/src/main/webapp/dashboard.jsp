<%@ page session="true" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container mt-4">
    <h1>Bem-vindo, ${user.email}!</h1>
    <p>Este é o painel principal da sua conta Finevo.</p>
</div>
</body>
</html>
