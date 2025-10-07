package br.fatec.pg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessadorArquivo {
    private EstrategiaRecuperacao estrategiaRecuperacao;

    public void setEstrategia(EstrategiaRecuperacao novaEstrategiaRecuperacao){
        this.estrategiaRecuperacao = novaEstrategiaRecuperacao;
    }

    public void processarArquivo(String nomeDoArquivo){
        try(BufferedReader br = new BufferedReader(new FileReader(nomeDoArquivo))){
            System.out.println("Arquivo encontrado com sucesso!");
        }catch(IOException exception){
            this.estrategiaRecuperacao.recuperar(exception);
        }
    }
}
