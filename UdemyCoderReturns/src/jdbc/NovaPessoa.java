package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		                                  //aqui poderia ter mais parametros
		//usar o preparedStatement para ter segurança contra o SQL injection
		//usar o ? no lugar do parametro e usar o stmt.setString ou int para os valores
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		
		sc.close();
	}
}
