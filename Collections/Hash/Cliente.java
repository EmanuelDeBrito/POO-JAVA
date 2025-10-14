package br.fatec.pg;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;

    public Cliente(String cpf, String nome, String email){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    @Override public String toString(){
        return "\nCPF: " + this.cpf + "\nNome: " + this.nome + "\nEmail: " + this.email;
    }
}
