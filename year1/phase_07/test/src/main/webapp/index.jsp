<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Index</title>
</head>
<body>
    <%
        Integer hitsCount = (Integer)application.getAttribute("hitCounter");
        if( hitsCount ==null || hitsCount == 0 ){
            /* First visit */
            out.println("Welcome to my website!");
            hitsCount = 1;
        }else{
            /* return visit */
            out.println("Welcome to my website!");
            hitsCount += 1;
        }
        application.setAttribute("hitCounter", hitsCount);

    %>
    <p>Total number of visits: <%= hitsCount%></p>
</body>
</html>