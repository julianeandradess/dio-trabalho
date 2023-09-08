public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;

            System.out.println(numero);

        }
        // Por mais que a nossa condição tivesse determinando que é de 1 a 5, quando
        // chegou ao 3 parou.
        System.out.println("Próxima questão: ");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);

        }
        // Nesse caso, a condição por mais que peça continue, ela pulará o número que
        // pediu para "continuar"
        // retomará para o comando normalmente.

    }
}
