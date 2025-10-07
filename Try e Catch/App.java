package br.fatec.pg;

public class App {
    public static void main(String[] args) {
        Usuario danilo = new Usuario("danilo@gmail.com", 60);

        try{
            ValidadorUsuario.validarUsuario(danilo.getEmail(), danilo.getIdade());
        }catch(EmailInvalidoException exception){
            System.out.println(exception.getMessage());
        }catch(IdadeInvalidaException exception){
            System.out.println(exception.getMessage());
        }
    }
}
