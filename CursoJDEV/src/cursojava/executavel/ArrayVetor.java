package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.1,5.7,9.6,7.8};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Maira Sampaio");
		aluno.setNomeEscola("Aprende Java");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		//------------------------------------------------------------------
		
		Aluno[] arrayAluno = new Aluno[1];
		
		arrayAluno[0] = aluno;
		
		for(int pos = 0; pos < arrayAluno.length; pos++) {
			
			System.out.println("Nome do aluno é: " + arrayAluno[pos].getNome());
			
			for(Disciplina d: arrayAluno[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é : " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("A nota número : " + posnota + " é igual = " + d.getNota()[posnota]);
				}
			}
		}

	}

}
