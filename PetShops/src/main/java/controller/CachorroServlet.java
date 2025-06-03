package controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import model.Cachorro;

public class CachorroServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException{
		
		String nome = request.getParameter("nomeCachorro");
		String idadestr = request.getParameter("idadeCachorro");
		String pesostr = request.getParameter("pesoCachorro");
		
		if(nome != null && idadestr != null && pesostr != null) {
			int idade = Integer.parseInt(idadestr);
			int peso = Integer.parseInt(pesostr);
			
			Cachorro cachorro = new Cachorro(nome, idade, peso);
			
			// aqui vai enviar o objeto(cachorro) para o JSP
			request.setAttribute("cachorro", cachorro);
						
			// Ir para o resultado.jsp
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/resultadoCachorro.jsp");
			dispatcher.forward(request, response);
			
		}else {
			response.getWriter().println("Dados Inv");
		}
		
	}

}
