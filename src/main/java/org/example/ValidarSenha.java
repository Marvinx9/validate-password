package org.example;

public class ValidarSenha {
    public enum ErroSenha {
        TAMANHO_INSUFICIENTE(1),
        SEM_MAIUSCULA(1 << 1),
        SEM_MINUSCULA(1 << 2),
        SEM_NUMERO(1 << 3),
        SEM_ESPECIAL(1 << 4);

        private final int bit;

        ErroSenha(int bit) {
            this.bit = bit;
        }

        public int getBit() {
            return bit;
        }
    }

    public static int validar(String senha) {
        int erros = 0;
        String senhaSemEspaco = senha.trim();

        if(senhaSemEspaco.length() < 8) {
            erros |= ErroSenha.TAMANHO_INSUFICIENTE.getBit();
        }

        if(!senhaSemEspaco.matches(".*[A-Z].*")) {
            erros |= ErroSenha.SEM_MAIUSCULA.getBit();
        }

        if(!senhaSemEspaco.matches(".*[a-z].*")) {
            erros |= ErroSenha.SEM_MINUSCULA.getBit();
        }

        if(!senhaSemEspaco.matches(".*[0-9].*")) {
            erros |= ErroSenha.SEM_NUMERO.getBit();
        }

        if (!senhaSemEspaco.matches(".*[!@#$%&].*")) {
            erros |= ErroSenha.SEM_ESPECIAL.getBit();
        }

        System.out.println(erros);
        return erros;
    }
}