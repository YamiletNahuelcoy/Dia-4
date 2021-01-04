<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="Estilos.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.min.js"></script>
	<script src="script.js"></script>
</head>
<body>
 <header id="seccion">
        <h2> LOGIN</h2>
        <div class="content-menu">
        <input type="checkbox" id="check">
        <label class="icon-menu" for="check"><img src="iconos/icono-menu.png" alt="" class="icon-menu"
                for="check"></label>

        
        </div>
    </header>

    <form class="cmxform" id="loginForm" method="post" action="ValidarSesion">
        <fieldset class="cel- agrupar-t agrupar-e">
            <table class="cel- tablausr-t tablausr-e">
                <tr>
                    <td>Nombre de Usuario</td>
                    <td><input type="text" name="txtnombre" placeholder="nombre"  /></td>
                </tr>
                <tr>
                    <td>Contrase�a</td>
                    <td> <input type="password" name="txtpass" placeholder="clave" /></td>
                </tr>
                <tr>
                    <td><input type="submit"  value="Iniciar Sesi�n" /></td>
                </tr>

            </table>
        </fieldset>
    </form>
    <footer id="pie">
        <blockquote><a href="index.html">Volver a la p�gina de Inicio</a></blockquote>
        Derechos Reservados G3 &copy; 2020
      </footer>
</body>
</html>