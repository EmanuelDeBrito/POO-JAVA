package OO;

public class Gerente extends Funcionario{
    private String area;

    public Gerente(String nome, double salario, String area){
        // Chamando construtor da classe mãe
        super(nome, salario);
        this.area = area;
    }
}
