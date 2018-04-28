<%@page import="br.ufjf.dcc192.Buddy"%>
<%@page import="br.ufjf.dcc192.ListaBuddys"%>
<%@page import="br.ufjf.dcc192.Estrangeiro"%>
<%@page import="br.ufjf.dcc192.ListaEstrangeiros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sugestões de Hospedagem</title>
    </head>
    <body>
        <h1>Sugestões de Hospedagem</h1>
        <%
            for (int i = 0; i < ListaEstrangeiros.getInstance().size(); i++) {
                Estrangeiro estrangeiro = ListaEstrangeiros.getInstance().get(i);
                for (int j = 0; j < ListaBuddys.getInstance().size(); j++) {
                        Buddy buddy = ListaBuddys.getInstance().get(j);
                        if(buddy.getDisponibilidade() >= estrangeiro.getNecessidade() && buddy.getSituacao() && estrangeiro.getSituacao()){
                    
        %> 
        <ul>
            <li>
                <%=buddy.getNome()%> pode hospedar <%=estrangeiro.getNome()%> que é <%=estrangeiro.getNacionalidade()%>. 
                Contato do buddy: <%=buddy.getEmail()%>. Contato do intercambista: <%=estrangeiro.getEmail()%>.
            </li>
        </ul>    
        <%}}}%>
    </body>
</html>
