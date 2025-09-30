public class ContaCorrente extends Conta implements Tributavel{
    public double getValorImposto(){
        double valorImpostoContaCorrente = 0.05;
        
        return valorImpostoContaCorrente;
    }

    public String imprimirExtrato(){
        String mensagemExtrato = "Extrato da sua conta \n -------------------- \n Saldo: R$ " + this.consultarSaldo() + "\n Taxa de Saque: " + this.getValorImposto() + "%" + "\n --------------------";

        return mensagemExtrato;
    }

    @Override
    public boolean sacarValor(double valorSacado){
        double impostoSobreValorSacado = valorSacado * getValorImposto();
        double valorSacadoComImposto = valorSacado + impostoSobreValorSacado;

        if(this.saldo >= valorSacadoComImposto){
            this.saldo -= valorSacadoComImposto;
            System.out.println("Saque de R$ " + valorSacado + " efetuado com sucesso!\nImposto sobre o saque: R$ " + impostoSobreValorSacado);
            return true;
        }

        return false;
    }
}