package com.SistemaDeLojas.main;

import com.SistemaDeLojas.classes.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Telefone telefone = new Telefone("9999933993");
        Endereco endereco = new Endereco("rua tal","900","Bessa", "Bangu","São Paulo","Brasil");
        LocalDate dataNascimento = LocalDate.of(2022, 9,11);
        LocalDate dataAdmissao = LocalDate.of(2023, 4,11);
        Profissao profissao = new Profissao("Desenvolvedor");


        Funcionario funcionarioA = new Funcionario("Carlos",dataNascimento ,endereco,telefone, Cargo.SECRETARIO,1234,1500.87,dataAdmissao);

        funcionarioA.cadastrar();
        funcionarioA.promover(Cargo.GERENTE);
        funcionarioA.reajustarSalario(26.3);


        Cliente clienteA = new Cliente("Luiz",dataNascimento,endereco,telefone,Cargo.ClIENTE,1L,profissao);
        clienteA.cadastrar();

    }
}
