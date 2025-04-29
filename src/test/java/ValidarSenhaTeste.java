import org.example.ValidadorDeSenha;
import org.example.ValidarSenha;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidarSenhaTeste {
    @Test
    public void deveDarErroDeSenhaTamanho() {
        //Arrange
        int expected = 1;

        //Act
        int actual = ValidarSenha.validar("S3nh@");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaLetraMaiuscula() {
        //Arrange
        int expected = 2;

        //Act
        int actual = ValidarSenha.validar("senhasenletra1@maiuscula");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaLetraMinuscula() {
        //Arrange
        int expected = 4;

        //Act
        int actual = ValidarSenha.validar("TEST@7XSXSS");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaNumero() {
        //Arrange
        int expected = 8;

        //Act
        int actual = ValidarSenha.validar("TEST@ssXSXSS");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaCaractereEspecial() {
        //Arrange
        int expected = 16;

        //Act
        int actual = ValidarSenha.validar("TEST7ssXSS");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaComEspaco() {
        //Arrange
        int expected = 1;

        //Act
        int actual = ValidarSenha.validar("aA  1@  ");

        //Assert
        assertEquals(expected, actual);
    }
}