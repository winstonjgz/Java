<%-- 
    Document   : index
    Created on : 27 jun. 2022, 21:13:19
    Author     : winstonjgz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="SvPersona" method="POST">
            <p><label>Dni: </label><input type="text" name="dni"></p>
            <p><label>Nombre:  </label><input type="text" name="nombre"></p><!-- comment -->
            <p><label>Apellido: </label><input type="text" name="apellido"></p><!-- comment -->
            <p><label>Telefono: </label><input type="text" name="telefono"></p>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista Personas</h1>
        <p>Si desea ver todas las personas pulse el boton</p>
        
        <form action="SvPersona" method="GET">
            <button type="submit" > Mostrar Personas </button>
        </form>
        
        <h1>Eliminar Personas</h1>
        <p>Ingrese el DNI de la persona a eliminar</p>
        <!--<form action=" " method=" ">
            <p><label>Dni: </label><input type="text" name="dni_elim"></p>
            <button type="submit" >Eliminar</button>
            
        </form>-->
    </body>
</html>
