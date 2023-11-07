package SystemUniesp;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private List<Telefone> telsContato;

    public void cadastrarEndereco(String rua, String numero, String cep, String cidade, String estado, String pais) {
        this.endereco.setCep(cep);
        this.endereco.setRua(rua);
        this.endereco.setCidade(cidade);
        this.endereco.setEstado(estado);
        this.endereco.setPais(pais);
    }

    public int obterIdade(){
        int idade = 0;
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        //Subtrair ano atual do ano de nascimento
        return idade = periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(List<Telefone> telsContato) {
        this.telsContato = telsContato;
    }
}
