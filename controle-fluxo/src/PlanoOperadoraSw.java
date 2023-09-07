public class PlanoOperadoraSw {
    public static void main(String[] args) {
        // Como não tem o break, ele acaba incluindo todas as alternativas anteriores e
        // posteriores, não importa a ordem.
        String plano = "M";

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
