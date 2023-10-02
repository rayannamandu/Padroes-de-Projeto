package av1.questao2;

public class Main {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos(1, "Produto A", 10.0, 50);
        Produtos produto2 = new Produtos(2, "Produto B", 20.0, 30);

        produto1.addEstoque(20);
        produto1.vender(15);
        produto2.vender(40);

        System.out.println("Valor total em estoque do Produto A: R$" + produto1.getValorTotal());
        System.out.println("Valor total em estoque do Produto B: R$" + produto2.getValorTotal());
    }
}