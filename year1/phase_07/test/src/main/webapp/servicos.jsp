<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Serviços</title>
</head>
<body>
  <h2>Bem vindo usuário [<%=session.getAttribute("attrUsuario")%>]
    a página de Serviços do Sistema!</h2>

  <p><a href="index.jsp">INÍCIO</a></p>
  <p><a href="login.jsp">LOGIN</a></p>
</body>
</html>
