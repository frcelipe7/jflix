package br.uepa.jflix.models;


import java.time.LocalDate;

public class Usuario extends  Pessoa {
    public Usuario(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }
}
