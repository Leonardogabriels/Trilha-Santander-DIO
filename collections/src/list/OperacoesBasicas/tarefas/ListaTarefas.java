package list.OperacoesBasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> tarefas;

	public ListaTarefas (){
		this.tarefas = new ArrayList<>();
	}


	public void adicionarTarefa(String descricao) {
		tarefas.add(new Tarefa(descricao));
		System.out.println("tarefa adicionada");
	}

	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa obj : tarefas) {
			if (obj.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(obj);
			}
		}
		tarefas.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas(){
		return tarefas.size();
	}
	public void obterDescricoesTarefas(){
		for (Tarefa obj : tarefas){
			 System.out.println(" Tarefa: " + obj.getDescricao());
		}
	}
}
