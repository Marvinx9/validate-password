package org.example;

public class ValidSenha {
    public static int validar(String senha) {
        int erros = 11111;
        String senhaSemEspaco = senha.trim();

        if(senhaSemEspaco.length() < 8) {
            erros +=1;
        }

        if(!senhaSemEspaco.matches(".*[A-Z].*")) {
            erros +=10;
        }

        if(!senhaSemEspaco.matches(".*[a-z].*")) {
            erros +=100;
        }

        if(!senhaSemEspaco.matches(".*[0-9].*")) {
            erros +=1000;
        }

        if (!senhaSemEspaco.matches(".*[!@#$%&].*")) {
            erros +=10000;
        }

        System.out.println(erros);
        return erros;
    }
}