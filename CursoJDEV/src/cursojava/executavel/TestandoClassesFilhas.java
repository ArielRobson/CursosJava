package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Robson");
		aluno.setNomeEscola("Aprende Java");
		aluno.setNomeMae("Tereza");
		aluno.setNomePai("Antonio");
		aluno.setDataNascimento("13/01/1999");
		aluno.setDataMatricula("09/01/2010");
		aluno.setNumeroCpf("58963225589");
		aluno.setRegistroGeral("65326564");
		aluno.setIdade(22);
		
		
		System.out.println(aluno);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("5486351864648");
		diretor.setIdade(50);
		diretor.setNome("Rachel");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		secretario.setNome("José");
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgPessoaMaior()); 
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario aluno é = " + aluno.Salario());
		System.out.println("Salario diretor é = " + diretor.Salario());
		System.out.println("Salario secretario é = " + secretario.Salario());
		
		
		teste(secretario);
		teste(aluno);
		teste(diretor);
		
		
		
		
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é de mais = " + pessoa.getNome() + 
				" - " + pessoa.Salario());
	}
}
