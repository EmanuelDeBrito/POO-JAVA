package br.fatec.pg;

import java.util.ArrayList;

public class Pergunta {

    // Atributos da classe
    private String enunciadoPergunta;
    private ArrayList<String> alternativas;
    private int respostaCorreta;

    // Método construtor
    public Pergunta(String enunciadoPergunta, ArrayList<String> alternativas, int respostaCorreta){
        this.enunciadoPergunta = enunciadoPergunta;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    // Getters
    public String getEnunciadoPergunta(){
        return this.enunciadoPergunta;
    }

    public ArrayList<String> getAlternativas(){
        return this.alternativas;
    }

    public int getRespostaCorreta(){
        return this.respostaCorreta;
    }

    // Setters
    public void setEnunciadoPergunta(String novoEnunciadoPergunta){
        this.enunciadoPergunta = novoEnunciadoPergunta;
    }
    
    public void setAlternativas(ArrayList<String> novasAlternativas){
        this.alternativas = novasAlternativas;
    }

    public void setRespotaCorreta(int novaRespostaCorreta){
        this.respostaCorreta = novaRespostaCorreta;
    }

    // Método que verifica se a resposta enviada pelo usário está correta
    public boolean isCorreto(int resposta){
        if(getRespostaCorreta() == resposta){
            return true;
        }

        return false;
    }
}
