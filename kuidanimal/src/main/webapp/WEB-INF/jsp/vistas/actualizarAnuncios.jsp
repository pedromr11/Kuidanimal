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
	<h2>Modificación de anuncios</h2>
	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/kuidanimal/formularioactualizaranuncio" method="post">
				<label for="id_anuncio">Id Anuncio</label> 
				<input type="text" id="id_anuncio"	name="id_anuncio"> 
				<label for="animal">Animal</label> 
				<input type="text" id="animal" name="animal">
				<br> 
				<input type="submit" value="Enviar">
			</form>
		</div>		
	
		<c:forEach items="${lista}" var="alumno">
			<div class="form">
				<form action="http://localhost:8080/kuidanimal/actualizaranuncio" method="post">
					<input class="hidden" type="text" name="idOld" id="idOld" value="${anuncio.id_anuncio}">
					<label for="id_anuncio">Id Anuncio</label> 
					<input type="text" id="id_anuncio"	name="id_anuncio" value="${anuncio.id_anuncio}"> 
					<label for="animal">Animal</label> 
					<input type="text" id="animal" name="animal" value="${anuncio.animal}"><br> 
					
					<label for="provincia">Provincia</label> 
					<select name="provincia" id="provincia" >		
						<c:forEach items="${listaProvincias}" var="municipio">			
							<option value="${provincia.id_provincia}" > ${provincia.nombre} </option>
						</c:forEach>
						<option value="${anuncio.id_provincia}" selected>${anuncio.provincia}</option>
					</select>
					
					<label for="telefono">Teléfono</label> 
					<input type="text" id="telefono" name="telefono" value="${anuncio.telefono}"><br>
					
					<label for="correo_electronico">Correo Electrónico</label> 
					<input type="text" id="correo_electronico" name="correo_electronico" value="${anuncio.correo_electronico}"><br> 
					
					<label for="precio">Precio en euros</label> 
					<input type="text" id="precio" name="precio" value="${anuncio.precio}"><br> 
					
					<input type="submit" value="Modificar">
				</form>
			</div>
		</c:forEach>
		
		<c:if test="${resultado == 1 }">
			<h3>Anuncio actualizado correctamente</h3>
		</c:if>
	</div>


</body>
</html>