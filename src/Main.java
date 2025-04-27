
import java.util.Scanner;

import map.OperacoesBasicas.*;

public class Main {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		/*
		 *						 List
		 
		
		ListaTarefa listaTarefa = new ListaTarefa();
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
		
		--------------------------------------------------------------------
		
		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.adicionarLivro("Livro 1", "Autor 1", 2021);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 2024);
		
		System.out.println(catalogo.pesquisarPorAutor("Autor 4"));
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2020, 2021));
		System.out.println(catalogo.pesquisarPorTitulo("Livro 3"));
		---------------------------------------------------
		OrdenacaoPessoa ord = new OrdenacaoPessoa();
		ord.adicionarPessoa("Victor", 20, 1.68);
		ord.adicionarPessoa("Clara", 12, 1.50);
		ord.adicionarPessoa("Larissa", 23, 1.60);
		ord.adicionarPessoa("Leticia", 21, 1.65);
		ord.adicionarPessoa("Cris", 20, 1.80);
		ord.adicionarPessoa("Paulo", 21, 1.72);
		
		System.out.println(ord.ordenarPorAltura());
		
		--------------------------------------------------------
		                    Set
		
		ConjuntoConvidados convidado = new ConjuntoConvidados();
		convidado.adicionarConvidado("Gabriel", 1232);
		convidado.adicionarConvidado("Victor", 1234);
		convidado.adicionarConvidado("Victor", 1234);
		convidado.exibirConvidados();
		
		System.out.println("há " + convidado.contarConvidados() + " convidados");
		convidado.exibirConvidados();
		
		
		----------------------------------
		ConjuntoPalavrasUnicas p = new ConjuntoPalavrasUnicas();
		
		p.adicionarPalavra("Luffy");
		p.adicionarPalavra("Zoro");
		p.adicionarPalavra("Nami");
		p.adicionarPalavra("Usopp");
		p.adicionarPalavra("Sanji");
		----------------------------------------------------
		
		AgendaContatos ac = new AgendaContatos();
		ac.adicionarContato("SecondTime", 013343554);
		ac.adicionarContato("Lucas", 813343723);
		ac.adicionarContato("Lucas Gabriel", 813256654);
		ac.adicionarContato("Rodrigo", 911234554);
		ac.adicionarContato("Enygma", 843345624);
		ac.adicionarContato("Teste", 123456);
		ac.adicionarContato("Teste 2", 123454);
		
		ac.atualizarNumeroContato("Teste 2", 000000);
	
		
		ac.exibirContato();
		System.out.println("-----------------------");
		System.out.println("Pesquisar nome: ");
		String nomePesq = leia.nextLine();
		System.out.println(ac.pesquisarPorNome(nomePesq));
		
		-------------------------------------------------------
		
		CadastroProdutos c = new CadastroProdutos();
		c.adicionarProduto(1233, "Produto 1", 45d, 5);
		c.adicionarProduto(1223, "Produto 9", 12d, 10);
		c.adicionarProduto(3212, "Produto", 5d, 2);
		c.adicionarProduto(1452, "Produto 4", 10d, 1);
		c.adicionarProduto(1232, "Produto 5", 20d, 3);
		c.adicionarProduto(1230, "Produto 6", 34d, 1);
		
		System.out.println(c.exibirPorPreco());
		*/
		
		AgendaContatos agenda = new AgendaContatos();
		agenda.adicionarContato("Gabriel", 12345);
		agenda.adicionarContato("Victor Gabriel", 54321);
		agenda.adicionarContato("Gabriel", 12345);
		agenda.adicionarContato("Gabriel", 12345);
		agenda.adicionarContato("Gabriel", 99999);
		
		agenda.exibirContatos();
		System.out.println(agenda.pesquisarPorNome("Victor Gabriel"));
		agenda.removerContato("Gabriel");
		agenda.exibirContatos();
		
	}

}
