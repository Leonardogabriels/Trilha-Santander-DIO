import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		Collections.addAll(numeros, 1, 4, 5, 6, 8, 1, 5, 3, 6, 4, 8, 9, 5, 10);

		List<Integer> numerosOrdenados = numeros.stream()
				.sorted().toList();

		System.out.println(numerosOrdenados);


	}
}