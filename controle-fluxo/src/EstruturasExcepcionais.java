import java.util.Locale;
import java.util.Scanner;
//fazendo tratamento de exceções, caso o usuário digite errado ou ponha algo não correspondente.
//try {}
//  bloco de código conforme esperado

//catch(Exception e) {}// precisamos saber qual exceção
// bloco de código que captura as exceções que podem acontecer
// em caso de um fluxo não previsto

public class EstruturasExcepcionais {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");

            // pode ser usado tbm o System.err.print.
        }
    }
}
