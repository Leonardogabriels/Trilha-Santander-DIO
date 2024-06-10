package Set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefasSet;

	public ListaTarefas() {
		this.tarefasSet = new HashSet<>();
	}

	public void adicionarTarefa(String descricao){
		tarefasSet.add(new Tarefa(descricao));
	}

	public void removerTarefa(String descricao){
		if (!tarefasSet.isEmpty()){
			for (Tarefa obj : tarefasSet){
				if (obj.getDescrição().equalsIgnoreCase(descricao)){
					tarefasSet.remove(obj);
					break;
				}
			}
		} else {
			System.out.println("Lista de tarefas vazia");
		}
	}

	public Set<Tarefa> exibirTarefas(){
		if (!tarefasSet.isEmpty()) {
			return tarefasSet;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	public int contarTarefas() {
		return tarefasSet.size();
	}

	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();

		if (!tarefasSet.isEmpty()){
			for (Tarefa obj : tarefasSet){
				if (obj.isConcluida()){
					tarefasConcluidas.add(obj);
				}
			}
			return tarefasConcluidas;
		}
		System.out.println("Nenhuma tarefa concluida");
		return null;
	}

	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();

		if (!tarefasSet.isEmpty()){
			for (Tarefa obj : tarefasSet){
				if (!obj.isConcluida()){
					tarefasPendentes.add(obj);
				}
			}
			return tarefasPendentes;
		}
		System.out.println("Nenhuma tarefa pendente");
		return null;
	}

	public void marcarTarefaConcluida(String descricao){
		if (!tarefasSet.isEmpty()) {
			for (Tarefa obj : tarefasSet) {
				if (obj.getDescrição().equalsIgnoreCase(descricao)) {
					obj.setConcluida(true);
				}
			}
		} else 	{
			System.out.println("Lista Vazia");
		}
	}

	public void marcarTarefaPendente(String descricao){
		if (!tarefasSet.isEmpty()) {
			for (Tarefa obj : tarefasSet) {
				if (obj.getDescrição().equalsIgnoreCase(descricao)) {
					obj.setConcluida(false);
				}
			}
		} else 	{
			System.out.println("Lista Vazia");
		}
	}
	public void limparListaTarefas() {
		if(tarefasSet.isEmpty()) {
			System.out.println("A lista já está vazia!");
		} else {
			tarefasSet.clear();
		}
	}



}
