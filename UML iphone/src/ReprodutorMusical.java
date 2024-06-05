public class ReprodutorMusical extends Iphone {
	private String musicaAtual;
	private String[] playlist;

	public ReprodutorMusical(String modelo, String sistemaOperacional, String[] playlist) {
		super(modelo, sistemaOperacional);
		this.playlist = playlist;
	}

	public void tocar() {
		System.out.println("Tocando música: " + musicaAtual);
	}

	public void pausar() {
		System.out.println("Música pausada.");
	}

	public void selecionarMusica(String musica) {
		this.musicaAtual = musica;
		System.out.println("Música selecionada: " + musica);
	}

	public String getMusicaAtual() {
		return musicaAtual;
	}

	public void setMusicaAtual(String musicaAtual) {
		this.musicaAtual = musicaAtual;
	}

	public String[] getPlaylist() {
		return playlist;
	}

	public void setPlaylist(String[] playlist) {
		this.playlist = playlist;
	}
}
