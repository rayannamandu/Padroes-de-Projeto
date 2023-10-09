package AulaHeranca.contas;

public class ContaInvestimento extends Conta {
    double taxa;
    int prazo;

    boolean saque(double valor) {
        if(this.saldo > valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
        //Diferente de conta
        return false;
        }
    }

    boolean deposito(double valor) {
        //diferente de conta
        return false;
    }

    boolean aplicaRendimento(){
        //diferente de conta
        return false;
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {
        super(numero, saldo);
        this.taxa = taxa;
        this.prazo = prazo;
    }
}

