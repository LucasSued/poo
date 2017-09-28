package br.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import br.fiap.contato.Contato;
import br.fiap.dao.ContatoDAO;

@WebServlet("/adicionarContato")
public class AdicionarContato extends HttpServlet{
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
			String nome= request.getParameter("nome");	
			String endereco= request.getParameter("endereco");	
			String email= request.getParameter("email");
			String dataNascimento= request.getParameter("dataNascimento");
			new ContatoDAO().inserir(new Contato(nome, email, endereco, dataNascimento));
	}

}
