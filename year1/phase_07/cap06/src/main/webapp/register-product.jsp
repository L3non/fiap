<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Cadastro de produtos</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="./resources/css/bootstrap.css">
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">
  <div class="mt-5 ms-5 me-5">
    <div class="card mb-3">
      <div class="card-header">
        CADASTRO DE PRODUTO
      </div>

      <c:if test="${not empty message}">
        <div class="alert alert-success ms-2 me-2 mt-2">${message}</div>
      </c:if>

      <c:if test="${not empty error}">
        <div class="alert alert-danger ms-2 me-2 mt-2">${error}</div>
      </c:if>

      <div class="card-body">
        <form action="products?action=register" method="post">
          <div class="form-group">
            <label for="id-name">Nome</label>
            <input type="text" name="name" id="id-name" class="form-control">
          </div>
          <div class="form-group">
            <label for="id-price">Valor</label>
            <input type="text" name="price" id="id-price" class="form-control">
          </div>
          <div class="form-group">
            <label for="id-amount">Quantidade</label>
            <input type="text" name="amount" id="id-amount" class="form-control">
          </div>
          <div class="form-group">
            <label for="id-fabrication">Data de Fabricação</label>
            <input type="date" name="fabrication" id="id-fabrication" class="form-control">
          </div>

          <div class="form-group">
            <label for="id-category">Categoria</label>
            <select name="category" id="id-category" class="form-control">
              <option value="0">Selecione</option>
              <c:forEach items="${categories}" var="c">
                <option value="${c.code }" >${c.name }</option>
              </c:forEach>
            </select>
          </div>

          <input type="submit" value="Salvar" class="btn btn-primary mt-3">
        </form>
      </div>
    </div>
  </div>
</div>
<%@include file="footer.jsp" %>
<script src="./resources/js/bootstrap.bundle.js"></script>
</body>
</html>