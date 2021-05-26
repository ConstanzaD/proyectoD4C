<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	</head>
	<body>
		<div class = "container">
			<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
 
 <h5>Receta</h5>
 
 				${msj}
 
 
 
 <c:forEach var="receta" items="${receta}">
  
<label>Ingrediente:</label> 
 <c:forEach var="ingrediente" items="${listaIngredientesUtilizados}">
  <c:if test="${ingrediente.id == receta.id_ingrediente}">
 ${ingrediente.nombre}/
 </c:if>
 </c:forEach> 
 
  
<label>Cantidad:</label>${receta.cantidad}<br>
 
</c:forEach> 
 
 
 				
			</div>
		</div>
		
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>
