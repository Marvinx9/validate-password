package org.example;

public class ValidSenha {
    public static int validar(String senha) {
        int erros = 11111;
        String senhaSemEspaco = senha.trim();

        if(senhaSemEspaco.length() < 8) {
            erros +=1;
        }

        if(!senhaSemEspaco.matches(".*[A-Z].*")) {
            erros +=11;
        }

        if(!senhaSemEspaco.matches(".*[a-z].*")) {
            erros +=111;
        }

        if(!senhaSemEspaco.matches(".*[0-9].*")) {
            erros +=1111;
        }

        if (!senhaSemEspaco.matches(".*[!@#$%&].*")) {
            erros +=11111;
        }

        System.out.println(erros);
        return erros;
    }
}