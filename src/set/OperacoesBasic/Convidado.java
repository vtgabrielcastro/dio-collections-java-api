package set.OperacoesBasic;

public class Convidado {
	private String nome;
	private int codigo;
	public Convidado(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", codigo=" + codigo + "]";
	}
	
	
}
