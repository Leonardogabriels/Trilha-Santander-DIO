package list.Ordenacao.ordenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas  {

	private List<Pessoas> listPessoas;

	public OrdenacaoPessoas() {
		this.listPessoas = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura){
		listPessoas.add(new Pessoas(nome,idade,altura));
	}

	public List<Pessoas> ordenarPorIdade() {
		List<Pessoas> pessoasPorIdade = new ArrayList<>(listPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}

	public List<Pessoas> ordenarPorAltura(){
		List<Pessoas> pessoasPorAltura = new ArrayList<>(listPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
}
