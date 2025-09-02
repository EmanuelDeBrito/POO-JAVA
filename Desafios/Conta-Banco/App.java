package br.gov.sp.fatec.pg.oo;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int OPCAO_SAIDA = 4;
        int opcao;
        String mesagemOpcoes = "Escolha entre as opções a seguir: \n 1 - Consultar Saldo \n 2 - Depositar Valor \n 3 - Transferir Valor \n 4 - Sair";
        ContaBanco minhaConta = new ContaBanco();

        do{
            JOptionPane.showMessageDialog(null, mesagemOpcoes, "Opções", JOptionPane.QUESTION_MESSAGE);
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada"));

            switch (opcao) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + minhaConta.consultarSaldo(), "Saldo Atual", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
                    minhaConta.depositarValor(valorDeposito);
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + minhaConta.consultarSaldo(), "Saldo atualizado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    double valorSacado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que será sacado: "));
                    if(minhaConta.sacarValor(valorSacado)){
                        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + minhaConta.consultarSaldo(), "Saldo atualizado", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Saldo Insuficiente", "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo da sua conta", "Saindo da conta", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Opção inválida", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }while(opcao != OPCAO_SAIDA);
    }
}
