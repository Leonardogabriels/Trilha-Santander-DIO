package Set.Pesquisa.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatos;


	public AgendaContatos() {

		this.contatos = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero){

		contatos.add(new Contato(nome,numero));
	}

	public void exibirContatos() {

		if (!contatos.isEmpty()){
			System.out.println(contatos);
		}
		else {
			System.out.println("A lista de contatos está vazia");
		}
	}

	public Set<Contato> pesquisarPorNome(String nome){

		Set<Contato> contatosPorNome = new HashSet<>();
		if (!contatos.isEmpty()){
			for (Contato obj : contatos) {
				if (obj.getNome().startsWith(nome)){
					contatosPorNome.add(obj);
				}
			}
		} else {
			System.out.println("Lista Vazia");
			return contatosPorNome;
		}
		return contatosPorNome;
	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if (!contatos.isEmpty()) {
			for (Contato c : contatos) {
				if (c.getNome().equalsIgnoreCase(nome)) {
					c.setNumeroTelefone(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
}
