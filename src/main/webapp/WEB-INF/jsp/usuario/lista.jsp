<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <titleUsuários</title>
</head>
<body>
    <h1>Listando...</h1>
    <c:forEach items="${usuarios}" var="u">
        ${u.id} - ${u.nome}
    </c:forEach>
</body>
</html>
