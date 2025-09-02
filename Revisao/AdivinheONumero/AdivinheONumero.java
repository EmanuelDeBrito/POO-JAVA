package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int numeroSecreto = (int)(Math.random() * 1000);
        int palpite;

        do{
            palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu palpite"));

            if(palpite < numeroSecreto){
                System.out.println(palpite + " é Menor");
            }else{
                System.out.println(palpite + " é maior");
            }
        }while(palpite != numeroSecreto);

        System.out.println("Você acertou!!! O número era o " + numeroSecreto);
    }
}
