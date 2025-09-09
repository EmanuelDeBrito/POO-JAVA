package br.fatec.pg;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        ArrayList<String> alternativas1 = new ArrayList<String>();
        ArrayList<String> alternativas2 = new ArrayList<String>();
        ArrayList<String> alternativas3 = new ArrayList<String>();

        alternativas1.add("1 - private");
        alternativas1.add("2 - public");

        alternativas2.add("1 - class");
        alternativas2.add("2 - classe");

        alternativas3.add("1 - this");
        alternativas3.add("2 - self");

        Pergunta pergunta1 = new Pergunta("Qual a palavra reservada que deixa um atributo privado?", alternativas1, 1);
        Pergunta pergunta2 = new Pergunta("Qual a palavra reservada para a criação de uma classe?", alternativas2, 1);
        Pergunta pergunta3 = new Pergunta("Qual a palavra reservada que refere-se ao próprio objeto?", alternativas3, 1);

        perguntas.add(pergunta1);
        perguntas.add(pergunta2);
        perguntas.add(pergunta3);

        Quiz quiz = new Quiz("Emanuel", perguntas);

        quiz.iniciarQuiz();
    }
}
