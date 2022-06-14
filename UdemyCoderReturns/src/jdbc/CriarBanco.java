package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost?useSSL=true";
		final String usuario = "root";
		final String senha = "31059303";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		//dica de usar o IF NOT EXISTS para não criar caso já exista.
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
}
