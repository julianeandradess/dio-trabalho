public class ExemploForArrays {
    // x é usado como o nome do indice, 0 é o valor do inicio da posição.
    // em arrays o indice começa em 0.
    // lenght é tamanho.
    // alunos [ x ], quer dizer que quero que mostre na posição determinada a partir
    // do 0.
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
