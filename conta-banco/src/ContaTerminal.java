import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o número da sua agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, agora digite o número da sua conta:");
        String conta = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Seu saldo: ");
        String saldo = scanner.next();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar sua conta em nosso banco, sua agência é: " + agencia
                        + ", conta: " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
