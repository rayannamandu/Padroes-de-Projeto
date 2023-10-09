package AulaHeranca.contas;

public class ContaEspecial extends Conta{
    double limite;

    public ContaEspecial(int numero, double saldo) {
        super(numero, saldo);
    }

    boolean saque(double valor) {
        //lógica diferente do que tem em conta
        return false;
    }


}
