<%@page import="br.ufjf.dcc192.Estrangeiro"%>
<%@page import="br.ufjf.dcc192.ListaEstrangeiros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listagem de Estrangeiros</title>
    </head>
    <body>
        <h1>Listagem de Estrangeiros</h1>
        <table border="2">
            <tr>
                <th>Nome</th>
                <th>País</th>
                <th>Necessidade</th>
                <th>E-mail</th>
                <th>Excluir</th>
            </tr>
            <%
                for (int i = 0; i < ListaEstrangeiros.getInstance().size(); i++) {
                    Estrangeiro estrangeiro = ListaEstrangeiros.getInstance().get(i);
            %> 
            <tr>
                <td><%=estrangeiro.getNome()%></td>
                <td><%=estrangeiro.getNacionalidade()%></td>
                <td><%=estrangeiro.getNecessidade()%></td>
                <td><%=estrangeiro.getEmail()%></td>
                <td><a href="excluirEstrangeiro.html?linha=<%=i%>">Excluir</a></td>
            </tr>
            <%}%>
            <tr>
                <td colspan="5"><a href="novoEstrangeiro.html">Cadastrar Estrangeiro</a></td>
            </tr>
        </table>
        <a href="index.html">Voltar ao início</a>
    </body>
</html>
