package AulaHeranca.contas;

public class Conta {
    int numero;
    double saldo;

    boolean saque(double valor) {
        if(this.saldo > valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    boolean deposito(double valor) {
        return false;
    }

    double getSaldo() {
        return saldo;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}
