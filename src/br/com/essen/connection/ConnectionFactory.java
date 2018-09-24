package br.com.essen.connection;

import java.sql.Connection;

//Importar classes

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// Atributos
	private final String url = "jdbc:mysql://localhost:3306/FtrL";
	private final String user = "root";
	private final String password = "";

	// Método para obter a conexão
	public Connection obterConexao() {

		// Variável contendo a conexão
		Connection conexao = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception erro) {
			System.out.println("Falha ao selecionar a classe "+erro.getMessage());
		}
		

		// Tentar realizar a conexão
		try {
			conexao = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		// Retornar a conexão
		return conexao;
	}
}
