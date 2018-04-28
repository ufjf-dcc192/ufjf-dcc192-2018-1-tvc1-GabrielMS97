<%@page import="br.ufjf.dcc192.ListaBuddys"%>
<%@page import="java.util.List"%>
<%@page import="br.ufjf.dcc192.Buddy"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de buddys</title>
    </head>
    <body>
        <h1>Listagem de buddys</h1>
        <table border="2">
            <tr>
                <th>Nome</th>
                <th>Ocupação</th>
                <th>Disponibilidade</th>
                <th>E-mail</th>
                <th>Excluir</th>
            </tr>
            <%
                for (int i = 0; i < ListaBuddys.getInstance().size(); i++) {
                    Buddy buddy = ListaBuddys.getInstance().get(i);
            %> 
            <tr>
                <td><%=buddy.getNome()%></td>
                <td><%=buddy.getOcupacao()%></td>
                <td><%=buddy.getDisponibilidade()%></td>
                <td><%=buddy.getEmail()%></td>
                <td><a href="excluirBuddy.html?linha=<%=i%>">Excluir</a></td>
            </tr>
            <%}%>
            <tr>
                <td colspan="5"><a href="novoBuddy.html">Cadastrar Buddy</a></td>
            </tr>
        </table>
        <a href="index.html">Voltar ao início</a>
    </body>
</html>
