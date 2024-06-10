package list.Pesquisa.somarNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}

	public void adicionarNumero(int numero){
		numeros.add(numero);
	}

		public int calcularSoma(){

		int soma = 0;
		if (!numeros.isEmpty()){
			for (int n : numeros){
				soma += n;
			}
		}
		return soma;
	}

	public Integer encontrarMaiorNumero(){
		Integer maiorNumero = null;

		if (!numeros.isEmpty()){
			for (int n : numeros){
				if (n > maiorNumero){
					maiorNumero = n;
				}
			}
		}
		return maiorNumero;
	}
	public Integer encontrarMenorNumero(){
		Integer menorNumero = null;

		if (!numeros.isEmpty()){
			for (int n : numeros){
				if (n < menorNumero){
					menorNumero = n;
				}
			}
		}
		return menorNumero;
	}

	public List<Integer> exibirNumeros(){
		return numeros;
	}

	@Override
	public String toString() {
		return "numero" + numeros + "\n";
	}
}
