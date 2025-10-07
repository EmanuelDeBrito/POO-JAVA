package br.fatec.pg;

public class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(String mensagemErro){
        super(mensagemErro);
    }
}
