package br.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.fiap.contato.Contato;

public class ContatoDAO {
	
	private Connection connection;
	private String sql;
	private PreparedStatement ps;
	
	public void inserir(Contato contato){
		sql = "insert into java_agenda values(?,?,?,?)";
		
		try {
			connection = null;
			ps = connection.prepareStatement(sql);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getEndereco());
			ps.setString(4, contato.getNascimento());
			ps.execute();
			
		} catch (SQLException e) {
			//JOptionPane.showMessageDialog(null, "DEU RUIM MANAO");
		}
	}
	
}
