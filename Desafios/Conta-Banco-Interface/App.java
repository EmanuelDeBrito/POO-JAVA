public class App {
    public static void main(String[] args) {
        ContaCorrente primeiraConta = new ContaCorrente();
        primeiraConta.depositarValor(1000);
        System.out.println(primeiraConta.imprimirExtrato());

        if(primeiraConta.sacarValor(800) == false){
            System.out.println("Você não possui saldo suficiente para o saque");
        }

        System.out.println("Saldo atual da sua conta: R$ " + primeiraConta.consultarSaldo());
    }
}