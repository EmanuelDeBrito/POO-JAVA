public abstract class Conta {
    protected double saldo;

    public double consultarSaldo(){
        return this.saldo;
    }

    public void depositarValor(double valorDepositado){
        this.saldo += valorDepositado;
    }

    public boolean sacarValor(double valorSacado){
        if(valorSacado <= this.saldo){
            this.saldo -= valorSacado;
            return true;
        }

        return false;
    }

    public abstract String imprimirExtrato();
}