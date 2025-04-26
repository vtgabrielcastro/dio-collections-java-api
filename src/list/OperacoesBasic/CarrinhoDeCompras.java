package list.OperacoesBasic;
import java.util.ArrayList;
import java.util.List;


public class CarrinhoDeCompras {
	private List<Item> itemList;
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item t : itemList) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}
		itemList.removeAll(itensParaRemover);
	}
	public void exibirItens() {
		System.out.println(itemList);
	}
	public double calcularValorTotal() {
		
		double resultado = 0;
		if(!itemList.isEmpty()) {
			for(Item t : itemList) {
				resultado += t.getPrecoTotal();
			}
			return resultado;
		}else{
			throw new RuntimeException("A lista está vazia");
		}
		
	}
}
