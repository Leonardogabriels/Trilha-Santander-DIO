package Set.Pesquisa.ListaDeTarefas;

import java.util.Objects;

public class Tarefa {

	private String descrição;
	private boolean concluida;

	public Tarefa(String descrição) {
		this.descrição = descrição;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Tarefa tarefa)) return false;
		return Objects.equals(getDescrição(), tarefa.getDescrição());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getDescrição());
	}

	@Override
	public String toString() {
		return "Tarefa: " + descrição  + " , descrição: " + concluida ;
	}
}
