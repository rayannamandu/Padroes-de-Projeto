package AulaHeranca.contas;

public class Conta {
    protected int numero;
    protected double saldo;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}
