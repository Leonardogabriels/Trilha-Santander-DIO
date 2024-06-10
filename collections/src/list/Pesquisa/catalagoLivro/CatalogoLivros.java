package list.Pesquisa.catalagoLivro;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> listaLivro;

	public CatalogoLivros() {
		this.listaLivro = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao){

		listaLivro.add(new Livro(titulo,autor,anoPublicacao));
		System.out.println("Livro adicionado ao  Catálogo");
	}

	public List<Livro> pesquisarPorAutor(String autor) {

		List<Livro> livrosPorAutor= new ArrayList<>();
		if (!listaLivro.isEmpty()) {
			for (Livro obj : listaLivro) {
				if (obj.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(obj);
				}
			}
		}
		if (livrosPorAutor.isEmpty()){
			System.out.println("Não temos Livros com esse Autor");
		}
		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!listaLivro.isEmpty()) {
			for (Livro obj : listaLivro) {
				if (obj.getAnoPublicacao() >= anoInicial && obj.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(obj);
				}
			}
		}
		if (livrosPorIntervaloAnos.isEmpty()){
			System.out.println("Não temos Livros entre essas datas");
		}
		return livrosPorIntervaloAnos;
	}

	public Livro pesquisarPorTitulo(String titulo) {

		Livro livroPorTitulo = null;
		if (livroPorTitulo == null && !listaLivro.isEmpty()) {
			for (Livro obj : listaLivro) {
				if (obj.getTitulo().equalsIgnoreCase(titulo)) {
					return livroPorTitulo = obj;
				}
			}
		}
		System.out.println("Titulo não encontrado");
		return null;
	}

}
