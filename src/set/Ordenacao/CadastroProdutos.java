package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	public Set<Produto> produtoSet;

	public CadastroProdutos() {
		produtoSet = new HashSet<>();
	}

	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}

	public Set<Produto> exibirProdutosPorNome() {
		// o HashSet não deixa organizado, por isso deve-se utilizar TreeSet
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}

	public Set<Produto> exibirPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
}
