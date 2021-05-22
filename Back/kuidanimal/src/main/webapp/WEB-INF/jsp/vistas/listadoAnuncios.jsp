<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kuidanimal</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/formularios.css">
<link rel="stylesheet" href="css/tablas.css">
</head>
<body>
	<%@include file="../index.html"%>
	
	<h2>Listar anuncios</h2>
	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/kuidanimal/listadoanuncios" method="post">
				<label for="id_anuncio">Id Anuncio</label> 
				<input type="number" id="id_anuncio" name="id_anuncio"> 
				<label for="animal">Animal</label> 
				<input type="text" id="animal" name="animal">
				<br> 
				<input type="submit" value="Enviar">
			</form>

		</div>
		
		<table>
		
		<tr>
			<th>Id</th>
			<th>Animal</th>
			<th>Provincia</th>
			<th>Teléfono</th>
			<th>Correo electrónico</th>
			<th>Precio</th>
		</tr>
		
		<c:forEach items="${lista}" var="anuncio">
			<tr>
				<td> ${anuncio.id_anuncio}</td>
				<td> ${anuncio.animal}</td>
				<td> ${anuncio.provincia}</td>
				<td> ${anuncio.telefono}</td>
				<td> ${anuncio.correo_electronico}</td>
				<td> ${anuncio.precio}</td>
			</tr>
		</c:forEach>

	</table>

	</div>
	


</body>
</html>