<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>La sesión ha sido creada exitosamente</h4>
<br>
<p>El usuario es:<c:out value="${datonombre}"></c:out></p>
<p>Contraseña:<c:out value="${datoclave}"></c:out></p>
<a href="<%= request.getContextPath()%> /Contacto">Revisar sesión</a>
</body>
</html>