package com.example.fp;

public class convidados {

    private String nome;
    private boolean check;


    public convidados(String nome, boolean status){
        this.nome= nome;
        this.check = status;
    }

    public String getNome() {
        return nome;
    }
    public boolean getStatus() {
        return check;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setStatus(String nome) {
        this.nome = nome;
    }
}