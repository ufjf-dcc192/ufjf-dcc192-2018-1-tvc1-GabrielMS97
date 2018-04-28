/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet", "/buddy.html", "/estrangeiro.html", "/excluirBuddy.html",
    "/excluirEstrangeiro.html", "/novoEstrangeiro.html", "/novoBuddy.html", "/sugestao.html"})
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("buddy".equals(request.getParameter("buddy"))) {
            String nome = request.getParameter("nome");
            String ocupacao = request.getParameter("ocupacao");
            String email = request.getParameter("email");
            int disp = Integer.parseInt(request.getParameter("disponibilidade"));
            Buddy buddy = new Buddy(nome, ocupacao, disp, email);
            ListaBuddys.getInstance().add(buddy);
            response.sendRedirect("buddy.html");
        } else if ("estrangeiro".equals(request.getParameter("estrangeiro"))){
            String nome = request.getParameter("nome");
            String nac = request.getParameter("nacionalidade");
            String email = request.getParameter("email");
            int necess = Integer.parseInt(request.getParameter("necessidade"));
            Estrangeiro est = new Estrangeiro(nome, nac, necess, email);
            ListaEstrangeiros.getInstance().add(est);
            response.sendRedirect("estrangeiro.html");
        }
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/buddy.html".equals(request.getServletPath())) {
            listarBuddy(request, response);
        } else if ("/estrangeiro.html".equals(request.getServletPath())) {
            listarEstrangeiro(request, response);
        } else if ("/excluirEstrangeiro.html".equals(request.getServletPath())) {
            excluirEstrangeiro(request, response);
        } else if ("/excluirBuddy.html".equals(request.getServletPath())) {
            excluirBuddy(request, response);
        } else if ("/novoEstrangeiro.html".equals(request.getServletPath())) {
            novoEstrangeiro(request, response);
        } else if ("/novoBuddy.html".equals(request.getServletPath())) {
            novoBuddy(request, response);
        } else if ("/sugestao.html".equals(request.getServletPath())) {
            sugerir(request, response);
        }
    }

    private void listarBuddy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Buddy> buddy = ListaBuddys.getInstance();;
        request.setAttribute("buddy", buddy);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/buddy.jsp");
        despachante.forward(request, response);
    }

    private void listarEstrangeiro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Estrangeiro> estrangeiro = ListaEstrangeiros.getInstance();
        request.setAttribute("estrangeiro", estrangeiro);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/estrangeiro.jsp");
        despachante.forward(request, response);
    }
    
    private void excluirEstrangeiro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int linha = Integer.parseInt(request.getParameter("linha"));
        ListaEstrangeiros.getInstance().remove(linha);
        response.sendRedirect("estrangeiro.html");
    }
    
    private void excluirBuddy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int linha = Integer.parseInt(request.getParameter("linha"));
        ListaBuddys.getInstance().remove(linha);
        response.sendRedirect("buddy.html");
    }
    
    private void novoEstrangeiro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Estrangeiro> estrangeiro = ListaEstrangeiros.getInstance();
        request.setAttribute("estrangeiro", estrangeiro);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadEstrangeiro.jsp");
        despachante.forward(request, response);
    }
    
    private void novoBuddy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Buddy> buddy = ListaBuddys.getInstance();
        request.setAttribute("buddy", buddy);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cadBuddy.jsp");
        despachante.forward(request, response);
    }
    
    private void sugerir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Buddy> buddy = ListaBuddys.getInstance();
        List<Estrangeiro> est = ListaEstrangeiros.getInstance();
        request.setAttribute("buddy", buddy);
        request.setAttribute("estrangeiro", est);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/sugestao.jsp");
        despachante.forward(request, response);
    }

}
