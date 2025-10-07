package br.fatec.pg;

public class EmailInvalidoException extends Exception{
    public EmailInvalidoException(String mensagemErro){
        super(mensagemErro);
    }
}
