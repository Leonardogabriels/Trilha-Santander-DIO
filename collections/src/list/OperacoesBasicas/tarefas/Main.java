package list.OperacoesBasicas.tarefas;

import list.OperacoesBasicas.tarefas.ListaTarefas;

public class Main {

	public static void main(String[] args) {

		ListaTarefas tarefas = new ListaTarefas();

		tarefas.adicionarTarefa("arrumar casa");
		tarefas.adicionarTarefa("Lavar a louça");
		tarefas.adicionarTarefa("Trabalhar ");
		tarefas.adicionarTarefa("ficar atoa");
		tarefas.adicionarTarefa("ficar atoa");
		tarefas.adicionarTarefa("ir para a faculdade");

		tarefas.removerTarefa("ficar atoa");
		System.out.println("Tarefas totais " + tarefas.obterNumeroTotalTarefas());
		tarefas.obterDescricoesTarefas();

	}

}
