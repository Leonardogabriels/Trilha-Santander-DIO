import java.util.HashMap;
import java.util.Map;

public class Telefone extends Iphone {
	private int numeroTelefone;
	private Map<String, Integer> agenda;

	public Telefone(String modelo, String sistemaOperacional, int numeroTelefone) {
		super(modelo, sistemaOperacional);
		this.numeroTelefone = numeroTelefone;
		this.agenda = new HashMap<>();
	}

	public void ligar(int numero) {
		System.out.println("Ligando para: " + numero);
	}

	public void desligarChamada() {
		System.out.println("Chamada desligada.");
	}

	public void atender() {
		System.out.println("Chamada atendida.");
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public Map<String, Integer> getAgenda() {
		return agenda;
	}

	public void adicionarContato(String nome, int numero) {
		agenda.put(nome, numero);
	}
}
