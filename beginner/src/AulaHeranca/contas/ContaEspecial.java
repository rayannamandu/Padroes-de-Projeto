package AulaHeranca.contas;

public class ContaEspecial extends Conta{
    double limite;
    double saldo = getSaldo();

    public ContaEspecial(int numero, double saldo) {
        super(numero, saldo);
    }

    boolean saque(double valor) {
        if(getSaldo() > valor) {
            setSaldo(getSaldo() - (valor * 0.90));
            return true;
        } else {
        //lógica diferente do que tem em conta
            return false;
        }
    }

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
}
