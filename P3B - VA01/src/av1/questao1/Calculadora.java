package av1.questao1;

public class Calculadora {
//Mudei os atributos a e b para serem privados, tornando-os encapsulados.
    private int valorA;
    private int valorB;

    public Calculadora(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }
//Atualizei os nomes dos métodos para seguir o padrão de nomenclatura Java, utilizando letras minúsculas e palavras separadas por camelCase.
    public int somar(){
        return valorA + valorB;
    }

    public int subtrair(){
        return valorA - valorB;
    }

    public int multiplicar(){
        return valorA * valorB;
    }

    public int dividir() throws ArithmeticException {
        if(valorB == 0) {
            //Lancei uma excessão no método "dividir" se "b" for igual a zero
            //Atualizei a mensagem de erro na exceção lançada para ser mais descritiva, indicando que a divisão por zero não é permitida.
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
            return valorA / valorB;
        }
        //Mantive a consistência na formatação do código para facilitar a leitura e a manutenção.
}

