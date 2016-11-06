<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>personaform.jsp</title>
</head>
<body>
<form:form action="saludo" modelAttribute="persona" role="form" method="POST">
<label for="nombre">Nombre:</label>
<input id="nombre" type="text" path="nombre" placeholder="Ingrese nombre"/>
<label for="apellido">Apellido:</label>
<input id="apellido" type="text" path="apellido" placeholder="Ingrese apellido" />
<label for="mail">Email:</label>
<input id="mail" type="text" path="mail" placeholder="Ingrese e-mail" />
<label for="edad">Edad:</label>
<input id="edad" type="text" path="edad" placeholder="Ingrese edad" />
<button type="submit">Enviar</button>
</form:form>
</body>
</html>