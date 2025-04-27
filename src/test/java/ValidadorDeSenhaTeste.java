package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ValidadorDeSenhaTeste {
    @Test
    public void deveDarErroDeSenhaTamanho() {
        //Arrange
        String[] expected = {"senha deve ser maior que 8 dígitos!"};

        //Act
        String[] actual = ValidadorDeSenha.validar("S3nh@");

        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaLetraMaiuscula() {
        //Arrange
        String[] expected = {"senha deve possuir ao menos 1 letra maiúscula!"};

        //Act
        String[] actual = ValidadorDeSenha.validar("senhasenletra1@maiuscula");

        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaLetraMinuscula() {
        //Arrange
        String[] expected = {"senha deve possuir ao menos 1 letra minúscula!"};

        //Act
        String[] actual = ValidadorDeSenha.validar("TEST@7XSXSS");

        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaNumero() {
        //Arrange
        String[] expected = {"senha deve possuir ao menos 1 número!"};

        //Act
        String[] actual = ValidadorDeSenha.validar("TEST@ssXSXSS");

        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaCaractereEspecial() {
        //Arrange
        String[] expected = {"senha deve possuir ao menos 1 caractere especial!"};

        //Act
        String[] actual = ValidadorDeSenha.validar("TEST7ssXSS");

        //Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaComEspaco() {
        //Arrange
        String[] expected = {"senha deve ser maior que 8 dígitos!"};

        //Act
        String[] actual = ValidadorDeSenha.validar("aA  1@  ");

        //Assert
        assertArrayEquals(expected, actual);
    }
}