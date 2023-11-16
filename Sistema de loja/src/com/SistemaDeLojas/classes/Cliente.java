package com.SistemaDeLojas.classes;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Cliente extends Pessoa{

    private Long codigo;
    private Profissao profissao;

    public Cliente(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, Cargo cargo, Long codigo, Profissao profissao) {
        super(nome, dataNascimento, endereco, telefone, cargo);
        this.codigo = codigo;
        this.profissao = profissao;
    }

    @Override
    public void cadastrar() {
        System.out.println("cliente cadastrado");

        System.out.println(

                getCodigo() + "\n" +
                getNome() + "\n" +
                getDataNascimento() + "\n" +
                getProfissao().getNomeProfissao() + "\n" +
                getCargo() + "\n" +
                getEndereco().getNomeDaRua() + "\n" +
                getEndereco().getNumeroDaCasa() + "\n" +
                getEndereco().getBairro() + "\n" +
                getEndereco().getCidade() + "\n" +
                getEndereco().getSstado() + "\n" +
                getEndereco().getPais() + "\n" +
                getTelefone().getNumeroTelefone() + "\n"

        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(codigo, cliente.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
