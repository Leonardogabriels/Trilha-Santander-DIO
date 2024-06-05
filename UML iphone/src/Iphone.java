public class Iphone extends DispositivoEletronico {
	private String modelo;
	private String sistemaOperacional;

	public Iphone(String modelo, String sistemaOperacional) {
		this.modelo = modelo;
		this.sistemaOperacional = sistemaOperacional;
	}

	public void abrirAplicativo(String nomeAplicativo) {
		System.out.println("Abrindo aplicativo " + nomeAplicativo);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
}
