package list.Ordenacao.ordenacaoDePessoas;

public class Main {

	public static void main(String[] args) {

		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

		ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
		ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
		ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
		ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

		System.out.println(ordenacaoPessoas.ordenarPorIdade());

		System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}
}

