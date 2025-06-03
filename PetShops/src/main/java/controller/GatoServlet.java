package controller;
import model.Gato;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class GatoServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
		
		String nome = request.getParameter("nomeGato");
		String idadestr = request.getParameter("idadeGato");
		String pesostr = request.getParameter("pesoGato");
		
		
		if(nome != null && idadestr != null && pesostr != null) {
			int idade = Integer.parseInt(idadestr);
			int peso = Integer.parseInt(pesostr);
			
			Gato gato = new Gato(nome, idade, peso);
			
			request.setAttribute("gato", gato);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/resultadoGato.jsp");
			dispatcher.forward(request, response);
		}else {
			response.getWriter().println("Dados invalidos");
		}
	}
}
