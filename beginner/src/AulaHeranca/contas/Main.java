package AulaHeranca.contas;

public class Main {

    public static void main(String[] args) {
        ContaEspecial cEspecial = new ContaEspecial(1, 10000, 1000000);
        cEspecial.saque(100);

        System.out.println(cEspecial.saldo);

    }
}
