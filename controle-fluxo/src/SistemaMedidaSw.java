public class SistemaMedidaSw {
    public static void main(String[] args) {
        String sigla = "M";

        // switch é como se fosse o escolha caso.

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

    }
}
