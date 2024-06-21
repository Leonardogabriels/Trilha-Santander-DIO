import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		OptionalDouble media = numeros.stream()
				.filter(x -> x > 5)
				.mapToInt(x -> x)
				.average();

		if (media.isPresent()) {
			System.out.println("A média é de " + media.getAsDouble());
		} else {
			System.out.println("Não há números maiores que 5 na lista.");
		}
	}
}
