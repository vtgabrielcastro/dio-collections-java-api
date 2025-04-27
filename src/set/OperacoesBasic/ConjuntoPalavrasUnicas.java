package set.OperacoesBasic;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	Set<String> palavraSet = new HashSet<>();
	
	public void adicionarPalavra(String palavra) {
		palavraSet.add(palavra);
		
	}	
	public void removerPalavra(String palavra) {
		String palavraRemovida = null;
		for(String p : palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				palavraRemovida = p;
			}
		}
		palavraSet.remove(palavraRemovida);
	}
	
	public void verificarPalavra(String palavra) {
		
		for(String p : palavraSet) {
			if(p.equalsIgnoreCase(palavra)) {
				System.out.printf("Palavra '%s' já existe no conjunto", palavra);
				break;
			}else {
				System.out.printf("Palavra '%s' não existe no conjunto", palavra);
			}
		}
	}
	public void exibirPalavrasUnicas() {
		System.out.println(palavraSet);
	}
	@Override
	public String toString() {
		return "ConjuntoPalavrasUnicas [palavraSet=" + palavraSet + "]";
	}
	
}
