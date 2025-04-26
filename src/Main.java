import list.OperacoesBasic.CarrinhoDeCompras;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		//listaTarefa.removerTarefa("Tarefa 2");
		//System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		*/
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Camisa", 20, 1);
		carrinho.adicionarItem("Short", 20, 2);
		carrinho.adicionarItem("boné", 5, 4);
		
		System.out.println("Itens: ");
		carrinho.exibirItens();
		
		System.out.println("Valor total: " + carrinho.calcularValorTotal());
		
		System.out.println("Removendo: " );
		carrinho.removerItem("Camisa");
		System.out.println("Itens: ");
		carrinho.exibirItens();
		
		System.out.println("Valor total: " + carrinho.calcularValorTotal());
		
		
	}

}
