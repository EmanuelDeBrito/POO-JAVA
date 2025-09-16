package OO;

// Implementando interface
public class Gerente extends Funcionario implements Autenticavel{
    private String area;

    public Gerente(String nome, double salario, String area){
        super(nome, salario);
        this.area = area;
    }

    @Override
    public double calcularBonificacaoDoFuncionario(){
        return this.salario * 0.20;
    }

    // Método presente na interface
    public boolean autenticar(String senha){
        return "1234".equals(senha);
    }
}
