package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "O nome é obrigatorio!")
    private String nome;
    private String idade;
    private String cpf;
    private String salario;
    private String mesesTrabalhadosNoAno;

    public Funcionario(Long id, String nome, String idade, String cpf, String salario, String mesesTrabalhadosNoAno) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.mesesTrabalhadosNoAno = mesesTrabalhadosNoAno;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getMesesTrabalhadosNoAno() {
        return mesesTrabalhadosNoAno;
    }

    public void setMesesTrabalhadosNoAno(String mesesTrabalhadosNoAno) {
        this.mesesTrabalhadosNoAno = mesesTrabalhadosNoAno;
    }
}