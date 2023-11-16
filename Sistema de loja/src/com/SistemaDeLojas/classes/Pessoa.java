package com.SistemaDeLojas.classes;

import java.time.LocalDate;
import java.util.List;

public abstract class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Telefone telefone;
    private Cargo cargo;

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, Cargo cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cargo = cargo;
    }

    public void cadastrar(){}


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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
