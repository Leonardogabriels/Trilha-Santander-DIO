import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet extends Iphone {
	private List<String> historico;

	public NavegadorInternet(String modelo, String sistemaOperacional) {
		super(modelo, sistemaOperacional);
		this.historico = new ArrayList<>();
	}

	public void pesquisar(String nome) {
		System.out.println("Pesquisando: " + nome);
		historico.add(nome);
	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	public void novaAba() {
		System.out.println("Nova aba aberta.");
	}

	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}

	public List<String> getHistorico() {
		return historico;
	}
}

