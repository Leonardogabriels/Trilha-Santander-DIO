package entities;


public class Cliente {

	private String nome;
	private Long documento;

	public Cliente(String nome, Long documento) {
		this.nome = nome;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}
}