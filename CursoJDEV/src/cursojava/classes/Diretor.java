package cursojava.classes;

public class Diretor extends Pessoa{

	private String registroEduca��o;
	private int tempoDirecao;
	private String titula��o;
	
	
	
	public String getRegistroEduca��o() {
		return registroEduca��o;
	}
	public void setRegistroEduca��o(String registroEduca��o) {
		this.registroEduca��o = registroEduca��o;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitula��o() {
		return titula��o;
	}
	public void setTitula��o(String titula��o) {
		this.titula��o = titula��o;
	}
	@Override
	public String toString() {
		return "Diretor [registroEduca��o=" + registroEduca��o + ", tempoDirecao=" + tempoDirecao + ", titula��o="
				+ titula��o + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	@Override
	public double Salario() {
		return 2500.0;
	}
	
	
	
}
