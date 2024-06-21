import java.util.Arrays;
import java.util.List;

public class Desafio3 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1,5,-9,4,3,6,-4,1,5);

		List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0 ).toList();

		numerosNegativos.forEach(n -> System.out.println("número negativo: " + n));
	}
}
