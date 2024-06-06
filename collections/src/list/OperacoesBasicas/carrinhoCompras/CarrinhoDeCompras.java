package list.OperacoesBasicas.carrinhoCompras;

import list.OperacoesBasicas.tarefas.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itens;

	private CarrinhoDeCompras(){
		this.itens = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade){
		itens.add(new Item(nome,preco,quantidade));
	}

	public void removerItem(String nome) {

		List<Item> itensParaRemover = new ArrayList<>();
		for (Item obj : itens) {
			if (obj.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(obj);
			}
		}
		itens.removeAll(itensParaRemover);
	}

	public void exibirItens() {
		for (Item obj : itens){
			System.out.println(" Itens: " + obj);
		}
	}
}
