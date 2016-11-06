<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div>
    <div>
	<h1>Login</h1><br>
		<form:form action="/proyecto-base-spring/usuarioLoginMensaje">
			<input type="text" name="usuario" placeholder="Usuario">
			<input type="password" name="password" placeholder="Password">
			<input type="submit" name="login" class="login loginmodal-submit" value="Login">
		</form:form>
    </div>
	<div class="login-help">
		<a href="#">Registrarse</a> - <a href="#">¿Olvidaste tu contraseña?</a>
	</div>
</div>
</body>
</html>