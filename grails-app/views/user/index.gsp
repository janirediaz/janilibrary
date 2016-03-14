<%@ page contentType="text/html;charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/html">
<head>

    <g:javascript src="validaciones.js" />
    <title>Formulario de Registro</title>
</head>

<body>
${flash.error}
<h3>Formulario de Registro</h3>

<form name="form" id="registro" method="get" action="http://localhost:8080/user/saveUser"  onsubmit="return validacion()">
    <div class="form-group">
        <label class="control-label" for="nombre"></label>
    Usuario:<br><input  type="text" class="form-control" name="username" id="nombre" placeholder="Escribe tu nombre completo"></br>
    </div>
    <div class="form-group">
        <label class="control-label" for="password"></label>
    Password:<br><input type="password" class="form-control" name="password" id="password" placeholder= "Escribe aquí tu password"></br>
    </div>
    <div class="form-group">
        <label class="control-label" for="passRepeated"></label>
    Repeated password:<br><input type="password" class="form-control" name="passRepeated" id="passRepeated" placeholder="Repite el password"></br>
    </div>
    <div class="form-group">
        <label class="control-label" for="email"></label>
    email:<br><input type="email" class="form-control" name="email" id="email" placeholder="ejemplo@um.es"></br>
    </div>
    <div id="submit">
        <br><input class="boton" type="submit" value="Registrarme"></br>
    </div>

</form>




<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
      integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">


</body>
</html>