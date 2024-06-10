package Set.OperacoesBasicas.conjuntoConvidado;

import java.util.Objects;

public class Convidado {

	private String nome;
	private int codigoConvite;


	public Convidado() {
	}

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getcodigoConvite() {
		return codigoConvite;
	}

	public void setcodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Convidado convidado)) return false;
		return codigoConvite == convidado.codigoConvite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public String toString() {
		return "Convidado: " + nome + " , Codigo do Convite: " + codigoConvite;
	}
}
