package OO;

public class Gerente extends Funcionario{
    private String area;

    public Gerente(String nome, double salario, String area){
        super(nome, salario);
        this.area = area;
    }

    // Reescrevendo o método de uma forma diferente para a classe filha (polimorfismo)
    @Override
    public double calcularBonificacaoDoFuncionario(){
        return this.salario * 0.20;
    }
}
