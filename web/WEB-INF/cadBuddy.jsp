<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Buddy</title>
    </head>
    <body>
        <h1>Novo Buddy</h1>
        <form method="post">
            <label>Nome: <input name="nome"/></label><br/>
            <label>Ocupação: <input name="ocupacao"/></label><br/>
            <label>Semanas disponíveis: <input name="disponibilidade"/></label><br/>
            <label>E-mail de contato: <input name="email"/></label><br/>
            <input type="hidden" value="buddy" name="buddy"/>
            <input type="submit"/>
        </form>
    </body>
</html>
