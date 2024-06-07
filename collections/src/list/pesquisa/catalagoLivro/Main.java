package list.pesquisa.catalagoLivro;

public class Main {
	public static void main(String[] args) {

		CatalogoLivros catalago= new CatalogoLivros();

		catalago.adicionarLivro("quem pensa enriquece","Napoleon hill",2006);
		catalago.adicionarLivro("mais esperto que o diabo","Napoleon hill",2010);
		catalago.adicionarLivro("O poder do Habito","Charles Duhigg",2014);
		catalago.adicionarLivro("como fazer amigos e influenciar pessoas","Dale Carnegie",2010);
		catalago.adicionarLivro("O poder do Habito","Charles Duhigg",2006);

		System.out.println(catalago.pesquisarPorAutor("Napoleon hill"));
		System.out.println(catalago.pesquisarPorTitulo("o poder do habito"));
		System.out.println(catalago.pesquisarPorIntervaloAnos(2009,2014));

	}
}
