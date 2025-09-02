package com.example;
 
import javax.swing.JOptionPane;
 
public class Main {
    public static void main(String[] args) {
        double saldo = 1000;  
        int opcao = 0;
        String mesagemOpcoes = "Escolha entre as opções a seguir: \n 1 - Consultar Saldo \n 2 - Depositar Valor \n 3 - Transferir Valor \n 4 - Sair";
 
        while (opcao != 4) {
            JOptionPane.showMessageDialog(null, mesagemOpcoes, "Opções", JOptionPane.QUESTION_MESSAGE);
 
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada"));
 
            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Seu saldo atual é: R$ " + saldo);
                    break;
                case 2:
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que será depositado: "));
                    saldo += valorDeposito;
                    JOptionPane.showMessageDialog(null, "Valor de R$ " + valorDeposito + " depositado com sucesso");
                    break;
                case 3:
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado: "));
                    if(valorSaque <= saldo){
                        JOptionPane.showMessageDialog(null, "Valor de R$ " + valorSaque + " sacado com sucesso");
                        saldo -= valorSaque;
                    }else{
                        JOptionPane.showMessageDialog(null, "Você não pode sacar, o saldo é insuficente");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo da sua conta");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }
}