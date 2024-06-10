package Set.Ordenacao.CadastroProdutos;

public class MainCadastro {
	public static void main(String[] args) {

		CadastroProdutos cadastroProdutos = new CadastroProdutos();

		cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
		cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
		cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
		cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

		System.out.println(cadastroProdutos.exibirProdutosPorNome());

		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}

}
