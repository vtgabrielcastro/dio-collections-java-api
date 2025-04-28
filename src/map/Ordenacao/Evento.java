package map.Ordenacao;

public class Evento {
	private String nome;
	private String atracao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAtracao() {
		return atracao;
	}
	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	public Evento(String nome, String atracao) {
		super();
		this.nome = nome;
		this.atracao = atracao;
	}
	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
	}
	
	
}
