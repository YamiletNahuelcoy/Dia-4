<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Estilos.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="script.js"></script>
</head>
<body>
	<header id="seccion">
		<h2>LISTADO DE CAPACITACIONES</h2>
		<div class="content-menu">
			<input type="checkbox" id="check"> <label class="icon-menu"
				for="check"><img src="iconos/icono-menu.png" alt=""
				class="icon-menu" for="check"></label>

			<nav class="menu">
				<ul>
					<li><a href="<%=request.getContextPath()%>/Contacto">Contacto</a></li>
					<li><a href="<%=request.getContextPath()%>login.jsp">Ingreso</a></li>

					<li><a href="<%=request.getContextPath()%>/CrearCapacitacion">Crear
							Capacitaciones</a></li>
					<li><a
						href="<%=request.getContextPath()%>/ListarCapacitaciones">Listar
							Capacitaciones</a></li>
					<li><a href="<%=request.getContextPath()%>/CerrarSesion">Cerrar
							Sesi�n</a></li>
				</ul>
			</nav>
		</div>
	</header>

	<fieldset class="cel- agrupar-t agrupar-e">
		<table class="cel- tablaadm-t tablaadm-e">
			<tr class="negrita">
				<td>Id Capacitaci�n</td>
				<td>Fecha de Capacitaci�n</td>
				<td>Hora de Capacitaci�n</td>
				<td>Nombre del Cliente</td>
			</tr>
			<tr>
				<td>1</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Alamiro Ram�rez</td>
			</tr>
			<tr>
				<td>2</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Esteban Piro Po</td>
			</tr>
			<tr>
				<td>3</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Romulo Remo Romano</td>
			</tr>
			<tr>
				<td>4</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Rosa Espinoza</td>
			</tr>
			<tr>
				<td>5</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Elsa Pato</td>
			</tr>
			<tr>
				<td>6</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Ram�n Roman</td>
			</tr>
			<tr>
				<td>7</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Maike Tyson</td>
			</tr>
			<tr>
				<td>8</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Elba Lazo</td>
			</tr>
			<tr>
				<td>9</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Aquiles Baeza</td>
			</tr>
			<tr>
				<td>10</td>
				<td>23/12/2008</td>
				<td>13:00 horas</td>
				<td>Adri�n Droide</td>
			</tr>
		</table>
	</fieldset>
	<footer id="pie">
		<blockquote>
			<a href="index.html">Volver a la p�gina de Inicio</a>
		</blockquote>
		Derechos Reservados G3 &copy; 2020
	</footer>
</body>
</html>