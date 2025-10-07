package br.fatec.pg;

public class ValidadorUsuario{
    public static void validarUsuario(String email, int idade) throws EmailInvalidoException, IdadeInvalidaException{
        if(!email.contains("@")){
            throw new EmailInvalidoException("E-mail inválido: " + email);
        }

        if(idade < 0 || idade > 150){
            throw new IdadeInvalidaException("\nIdade inválida: " + idade);
        }

        System.out.println("\nUsuário válido \nEmail: " + email + "\nIdade: " + idade);
    }
}
