package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.excecao.ExcecaoProcessarNota;
import cursojava.interfaces.PermitirAcesso;


public class PrimeiraClasseJava {

	public static void main(String[] args){
		
		try {
		
		//lerArquivo();
			
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if(new FuncaoAutenticacao(permitirAcesso).autenticar()) {
		
		
		List<Aluno> alunos = new ArrayList<>();
		
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		for(int qtd = 1; qtd <= 1; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " +qtd+ "?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		/*
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe");
		String nomePai = JOptionPane.showInputDialog("Nome do pai");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a serie");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola");*/

		
		//Referencia   //Instancia
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		/*
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);*/

		for(int pos = 1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			//essa linha estava com erro apos alteração da classe disciplina
			//para trabalhar com array
			//disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while(continuarRemover == 0) {
				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");	
			}
		}
		
		alunos.add(aluno1);
		}
		
		/*for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("Maria")) {
				alunos.remove(aluno);
				break;
			}else {
				System.out.println(aluno);
				System.out.println("Media do aluno: " + aluno.getMediaNota());
				System.out.println("Resultado do aluno: " + aluno.getAlunoAprovado2());
				System.out.println("-----------------------------------------------------------------------");
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são");
			
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}*/
		
		/*for (int pos = 0; pos < alunos.size(); pos++){
			
			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("maria")) {
				
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(95);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			for(int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
				
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println(" Materia = " + disc.getDisciplina() + " Nota = "
						+ disc.getNota());
				System.out.println("------------------------------------------------");
				
			}
		}*/
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		System.out.println("------------ Lista dos Aprovados -------------------");
		for(Aluno aluno: maps.get(StatusAluno.APROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + ", Resultado = " +aluno.getAlunoAprovado2() + 
					", com media de = " + aluno.getMediaNota());
		}
		System.out.println("------------ Lista dos Recuperação -------------------");
		for(Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome = " + aluno.getNome() + ", Resultado = " +aluno.getAlunoAprovado2() + 
					", com media de = " + aluno.getMediaNota());
		}
		System.out.println("------------ Lista dos Reprovados -------------------");
		for(Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome = " + aluno.getNome() + ", Resultado = " +aluno.getAlunoAprovado2() + 
					", com media de = " + aluno.getMediaNota());
		}
		
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
		}catch(NumberFormatException e){
			e.printStackTrace();/*Imprimi erro no console Java*/
			
			StringBuilder saida = new StringBuilder();

			System.out.println(" Mensagem: " + e.getMessage());
			
			for(int pos = 0; pos < e.getStackTrace().length; pos++) {
				
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n Metodo de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n class : " + e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Opa um null pointer exception " + e.getClass());
			
		}/*catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro excecao customizada" + e.getClass().getName());
		}*/finally {/*Sempre é executado ocorrendo erros ou não.*/
			JOptionPane.showMessageDialog(null, "Aprendendo Java");
		}
		
	}
//		public static void lerArquivo() throws FileNotFoundException{
//			
//				File fil = new File("c://Arquivo.txt");
//				Scanner scanner = new Scanner(fil);
//		}
}
