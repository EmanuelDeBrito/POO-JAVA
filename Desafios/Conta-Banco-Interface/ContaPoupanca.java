public class ContaPoupanca extends Conta{
    public String imprimirExtrato(){
        String mensagemExtrato = "Extrato da sua conta \n -------------------- \n Saldo: R$ " + this.consultarSaldo() + "\n --------------------";

        return mensagemExtrato;
    }
}