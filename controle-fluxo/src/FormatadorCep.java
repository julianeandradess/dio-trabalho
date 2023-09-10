public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }
    // O fato de eu tentar usar o formatarCep, ela exige que use a try/catch.
    // quando for tentar formatar um cep, ele vai verificar se o cep é diferente de
    // 8, ele irá lançar a exceção.

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
