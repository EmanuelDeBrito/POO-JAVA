import javax.swing.JOptionPane;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso em KG"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura em metros"));

        float IMC = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, "Ola " + nome + " seu IMC é de: " + IMC);

        if(IMC < 18.5){
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        }else if(IMC >= 18.5 && IMC <= 24.9){
            JOptionPane.showMessageDialog(null, "Peso normal");
        }else if(IMC >= 25 && IMC <= 29.9){
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        }else if(IMC >= 30 && IMC <= 34.9){
            JOptionPane.showMessageDialog(null, "Obesidade de Grau I");
        }else if(IMC >= 35 && IMC <= 39.9){
            JOptionPane.showMessageDialog(null, "Obesidade de Grau II");
        }else{
            JOptionPane.showMessageDialog(null, "Obesidade de Grau III");
        }
    }
}
