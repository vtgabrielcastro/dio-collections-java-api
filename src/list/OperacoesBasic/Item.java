package list.OperacoesBasic;

public class Item {
	private String nome;
	private double preco;
	@SuppressWarnings("unused")
	private double precoTotal;
	private int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public double getPrecoTotal() {
		return precoTotal = preco * quantidade;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	@Override
	public String toString() {
		return "\n [nome: " + nome + "| preço: " + preco + "| quantidade:" + quantidade + "]";
	}
	
	
}
