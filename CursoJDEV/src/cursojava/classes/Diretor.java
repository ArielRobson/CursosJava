package cursojava.classes;

public class Diretor extends Pessoa{

	private String registroEducação;
	private int tempoDirecao;
	private String titulação;
	
	
	
	public String getRegistroEducação() {
		return registroEducação;
	}
	public void setRegistroEducação(String registroEducação) {
		this.registroEducação = registroEducação;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulação() {
		return titulação;
	}
	public void setTitulação(String titulação) {
		this.titulação = titulação;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducação=" + registroEducação + ", tempoDirecao=" + tempoDirecao + ", titulação="
				+ titulação + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	@Override
	public double Salario() {
		return 2500.0;
	}
	
	
	
}
