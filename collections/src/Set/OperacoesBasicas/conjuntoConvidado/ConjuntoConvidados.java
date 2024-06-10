package Set.OperacoesBasicas.conjuntoConvidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite){

		convidados.add(new Convidado(nome,codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {

		if (!convidados.isEmpty()){
			for (Convidado obj : convidados){
				if (obj.getcodigoConvite() == codigoConvite){
					convidados.remove(obj);
					break;
				}
			}
			System.out.println("Convidado não localizado");
		} else {
			System.out.println("Lista de convidados Vazia");
		}
	}

	public int contarConvidados(){

		return  convidados.size();
	}

	public void exibirConvidados(){

		System.out.println(convidados);;
	}
}
