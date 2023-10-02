package av1.questao2;

public class Produtos {
    private int id;
    private String nome;
    private double preco;
    private int qtdEmEstoque;

    public Produtos(int id, String nome, double preco, int qtdEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public void addEstoque(int quantidade) {
        if (quantidade >= 0) {
            qtdEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade deve ser maior ou igual a zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade >= 0 && quantidade <= qtdEmEstoque) {
            qtdEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " foram vendidas.");
        } else if (quantidade < 0) {
            System.out.println("A quantidade deve ser maior ou igual a zero.");
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
        }
    }

    public double getValorTotal() {
        return preco * qtdEmEstoque;
    }
}
