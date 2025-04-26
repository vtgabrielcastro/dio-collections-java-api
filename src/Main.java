
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		//listaTarefa.removerTarefa("Tarefa 2");
		//System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.obterDescricoesTarefas();
	}

}
