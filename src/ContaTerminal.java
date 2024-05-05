import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        scanner.nextLine(); //consumir

        System.out.print("informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("informe o valor de deposito ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numeroConta, saldo);
    }
}
