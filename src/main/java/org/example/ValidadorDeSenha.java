package org.example;

import java.util.Arrays;

public class ValidadorDeSenha {
    public static String[] validar(String senha) {
        String[] erros = new String[5];
        String senhaSemEspaco = senha.trim();
        int indice = -1;

        if(senhaSemEspaco.length() < 8) {
            indice++;
            erros[indice] = "senha deve ser maior que 8 dígitos!";
        }

        if(!senhaSemEspaco.matches(".*[A-Z].*")) {
            indice++;
            erros[indice] = "senha deve possuir ao menos 1 letra maiúscula!";
        }

        if(!senhaSemEspaco.matches(".*[a-z].*")) {
            indice++;
            erros[indice] = "senha deve possuir ao menos 1 letra minúscula!";
        }

        if(!senhaSemEspaco.matches(".*[0-9].*")) {
            indice++;
            erros[indice] = "senha deve possuir ao menos 1 número!";
        }

        if (!senhaSemEspaco.matches(".*[!@#$%&].*")) {
            indice++;
            erros[indice] = "senha deve possuir ao menos 1 caractere especial!";
        }

        return Arrays.copyOfRange(erros, 0, indice + 1);
    }
}