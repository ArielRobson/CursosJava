package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizaNome {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);

		Connection conexao = FabricaConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		//SELECT nome FROM pessoas WHERE codigo = ?
		
		System.out.print("informe o nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe o ID que deseja atualizar: ");
		int id = sc.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setInt(2, id);
		stmt.execute();
	
		
		System.out.println("Alterado com sucesso");
		
		
		
		conexao.close();
		stmt.close();
		sc.close();
	}
}
