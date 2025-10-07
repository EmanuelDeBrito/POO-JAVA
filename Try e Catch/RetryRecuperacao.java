package br.fatec.pg;

import java.io.IOException;

public class RetryRecuperacao implements EstrategiaRecuperacao {
    @Override
    public void recuperar(IOException exception){
        System.out.println("\nTentando 1x...\nTentando 2x...\nTentanto 3x...\nErro: " + exception.getMessage());
    }   
}
