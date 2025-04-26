import list.Pesquisa.CatalogoLivros;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		//listaTarefa.removerTarefa("Tarefa 2");
		//System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
		
		-------------------------------------------------------
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
		*/
		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.adicionarLivro("Livro 1", "Autor 1", 2021);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 2024);
		
		System.out.println(catalogo.pesquisarPorAutor("Autor 4"));
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2021));
		System.out.println(catalogo.pesquisarPorTitulo("Livro 3"));
	}

}
