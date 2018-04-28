<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Estrangeiro</title>
    </head>
    <body>
        <h1>Novo Estrangeiro</h1>
        <form method="post">
            <label>Nome: <input name="nome"/></label><br/>
            <label>Nacionalidade: <input name="nacionalidade"/></label><br/>
            <label>Semanas necessárias: <input name="necessidade"/></label><br/>
            <label>E-mail de contato: <input name="email"/></label><br/>
            <input type="hidden" value="estrangeiro" name="estrangeiro"/>
            <input type="submit"/>
        </form>
    </body>
</html>
