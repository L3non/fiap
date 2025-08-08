<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Cadastro - Finevo</title>
  <link rel="stylesheet" href="resources/css/bootstrap.min.css">
</head>
<body class="bg-light">
<div class="container mt-5">
  <h2>Cadastro</h2>
  <form action="register" method="post">
    <div class="mb-3">
      <label>Email:</label>
      <input type="email" name="email" class="form-control" required />
    </div>
    <div class="mb-3">
      <label>Senha:</label>
      <input type="password" name="password" class="form-control" required />
    </div>
    <button class="btn btn-success">Cadastrar</button>
    <a href="login.jsp" class="btn btn-link">Voltar</a>
  </form>
  <c:if test="${not empty success}">
    <div class="alert alert-success mt-3">${success}</div>
  </c:if>
  <c:if test="${not empty error}">
    <div class="alert alert-danger mt-3">${error}</div>
  </c:if>
</div>
<script src="resources/js/bootstrap.bundle.min.js"></script>
</body>
</html>
