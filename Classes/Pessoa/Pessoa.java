import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    String nome;
    String cpf;
    double altura;
    double peso;
    Pessoa mae;
    Pessoa pai;
    LocalDate nascimento;       

    int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(nascimento, dataAtual);
        return periodo.getYears();
    }

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Emanuel";
        pessoa.cpf = "123.456.789-90";
        pessoa.altura = 1.7;
        pessoa.peso = 60;
        pessoa.nascimento = LocalDate.of(2006, 7, 18);
        System.out.println("Idade: " + pessoa.getIdade());
    }
}