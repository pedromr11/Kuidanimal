<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

	<title>Kuidanimal</title>
   <%@ page isELIgnored="false"%>
<html>
<head>
	 <link rel="stylesheet" href="css/index.css">
	 <link rel="stylesheet" href="css/formularios.css">
</head>
<body>
<header>
</header>


<%@include file="../index.html" %>
<h2>Insertar anuncios</h2>
	<div class="container">
		<div class="form">
			<form action="http://localhost:8080/kuidanimal/insertaranuncio" method="post" id="formulario">
				<label for="id_anuncio">Id Anuncio</label> 
				<input type="text" id="id"	name="id"> 
				<label for="animal">Animal</label> 
				<input type="text" id="animal" name="animal"><br> 
				
				<label for="provincia">Provincia</label> 
				<select name="provincia" form="formulario" >		
					<c:forEach items="${listaProvincias}" var="provincia">			
						<option value="${provincia.id_provincia}"> ${provincia.nombre} </option>
					</c:forEach>
				</select>
				<br>
				<label for="telefono">Teléfono</label> 
				<input type="text" id="telefono" name="telefono"><br>
				
				<label for="correo_electronico">Correo Electrónico</label> 
				<input type="text" id="correo_electronico" name="correo_electronico"><br>
				
				<label for="precio">Precio en euros</label> 
				<input type="text" id="precio" name="precio"><br>  
				
				<input type="submit" value="Enviar">
			</form>
		</div>
		
		<c:if test="${resultado == 1}">
			<b>Anuncio insertado correctamente</b>
		</c:if>

	</div>



</body>
</html>