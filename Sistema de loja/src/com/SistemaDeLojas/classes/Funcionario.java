package com.SistemaDeLojas.classes;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Funcionario extends Pessoa{


    private Integer matricula;
    private Double salario;
    private LocalDate dataAdmissao;

    public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, Cargo cargo, Integer matricula, Double salario, LocalDate dataAdmissao) {
        super(nome, dataNascimento, endereco, telefone, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public void cadastrar() {
        System.out.println("Funcionario cadastrado");

        System.out.println(

                getMatricula() + "\n" +
                getNome() + "\n" +
                getDataNascimento() + "\n" +
                getCargo() + "\n" +
                getSalario()  + "\n" +
                getEndereco().getNomeDaRua() + "\n" +
                getEndereco().getNumeroDaCasa()  + "\n" +
                getEndereco().getBairro() + "\n" +
                getEndereco().getCidade() + "\n" +
                getEndereco().getSstado() + "\n" +
                getEndereco().getPais() + "\n" +
                getTelefone().getNumeroTelefone() + "\n" +
                getDataAdmissao() + "\n"

        );
    }

    public void promover(Cargo cargo){
        setCargo(cargo);
        System.out.println("Parabéns você foi promovido");
        System.out.println("Novo Cargo: " + getCargo() + "\n" );

    }

    public void reajustarSalario(Double percentual){
        Double acrescimo = (percentual/100)*getSalario();
        Double novoSalario = acrescimo + getSalario();
        setSalario(novoSalario);

        System.out.println("Parabéns você teve um aumento");
        System.out.printf("Seu novo salário é: R$ %.2f%n" ,getSalario());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
