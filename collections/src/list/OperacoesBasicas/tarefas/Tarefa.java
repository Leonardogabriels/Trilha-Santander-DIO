package list.OperacoesBasicas.tarefas;

import java.util.Objects;

public class Tarefa {

	private String descricao;

	public Tarefa() {
	}
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Tarefa tarefa)) return false;
		return Objects.equals(getDescricao(), tarefa.getDescricao());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDescricao());
	}

	@Override
	public String toString() {
		return "Tarefa" +
				"descricao='" + descricao ;
	}
}
