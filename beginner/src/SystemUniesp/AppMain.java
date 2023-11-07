package SystemUniesp;

public class AppMain {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        Cliente cliente01 = new Cliente();
        Funcionario funcionario01 = new Funcionario();

        Endereco enderecoGenerico = new Endereco();
        pessoa01.cadastrarEndereco(null, null, null, null, null, null);

        // cliente01.cadastrar("nome obj", "01/01/2021", "Endereco Obj", "83996594212")


    }
}
