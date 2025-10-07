package br.fatec.pg;

import java.io.IOException;

public class AbortRecuperacao implements EstrategiaRecuperacao {
    public void recuperar(IOException exception){
        System.out.println("\nAbortando...\nErro: " + exception.getMessage());
    }
}
