import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		// Encontra o segundo maior número na lista
		Optional<Integer> segundoMaior = numeros.stream()
				.distinct()  // Remove duplicatas, se necessário
				.sorted(Comparator.reverseOrder())  // Ordena em ordem decrescente
				.skip(1)  // Pula o maior número
				.findFirst();  // Encontra o segundo maior

		// Verificar se o segundo maior está presente e imprimir
		if (segundoMaior.isPresent()) {
			System.out.println("O segundo maior número é " + segundoMaior.get());
		} else {
			System.out.println("Não há um segundo maior número na lista.");
		}
	}
}
