package br.fatec.pg;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Quiz {

    // Atributos da classe
    private String nomeParticipante;
    private int pontuacao;
    private ArrayList<Pergunta> perguntas;

    // Método construtor
    public Quiz(String nomeParticipante, ArrayList<Pergunta> perguntas){
        this.nomeParticipante = nomeParticipante;
        this.pontuacao = 0;
        this.perguntas = perguntas;
    }

    // Getters
    public String getNomeParticipante(){
        return this.nomeParticipante;
    }

    public int getPontuacao(){
        return this.pontuacao;
    }

    public ArrayList<Pergunta> getPerguntas(){
        return this.perguntas;
    }

    // Setters
    public void setNomeParticipante(String novoNomeParticipante){
        this.nomeParticipante = novoNomeParticipante;
    }

    public void setPontuacao(int novaPontuacao){
        this.pontuacao = novaPontuacao;
    }

    public void setPerguntas(ArrayList<Pergunta> novasPerguntas){
        this.perguntas = novasPerguntas;
    }

    // Método que retorna a qunatidade de questões do Quiz
    public int quantidadeDeQuestoes(){
        return this.perguntas.size();
    }

    // Método que exibe a pontuação
    public void exibirPontuacao(){
        JOptionPane.showMessageDialog(null, this.getNomeParticipante() + " sua pontuação foi de " + this.getPontuacao() + "/" + this.quantidadeDeQuestoes());
    }

    // Método auxiliar que ajuda na criação da estrutura do enunciado da pergunta
    public String gerarPergunta(String enunciadoPergunta, ArrayList<String> alternativas){
        String enunciadoAlternativas = "";

        for(String alternativa : alternativas){
            enunciadoAlternativas += "\n" + alternativa;
        }
        
        String enunciadoTotal = "Pergunta: " + enunciadoPergunta + "\n" + enunciadoAlternativas + "\n";

        return enunciadoTotal;
    }

    // Método que incia o Quiz
    public void iniciarQuiz(){
        for(Pergunta pergunta : this.getPerguntas()){
            int resposta = Integer.parseInt(JOptionPane.showInputDialog(this.gerarPergunta(pergunta.getEnunciadoPergunta(), pergunta.getAlternativas())));

            if(pergunta.isCorreto(resposta)){
                setPontuacao(this.getPontuacao() + 1);
            }
        }
        
        // Ao final do Quiz exibimos a pontuação do usuário
        this.exibirPontuacao();
    }
}