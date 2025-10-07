package br.fatec.pg;

public class Usuario {
    private String email;
    private int idade;

    public Usuario(String email, int idade){
        this.email = email;
        this.idade = idade;
    }

    public String getEmail(){
        return this.email;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
}
