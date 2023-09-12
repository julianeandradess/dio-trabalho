package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidatos(1900.0);
        analisarCandidatos(2200.0);
        analisarCandidatos(2000.0);
    }

    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");

        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");

        else {
            System.out.println("AGUARDANDO OS RESULTADOS DOS OUTROS CANDIDATOS.");
        }

    }
}
