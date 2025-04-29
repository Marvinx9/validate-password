import org.example.ValidSenha;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidSenhaTeste {
    @Test
    public void deveDarErroDeSenhaTamanho() {
        //Arrange
        int expected = 11112;

        //Act
        int actual = ValidSenha.validar("S3nh@");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaLetraMaiuscula() {
        //Arrange
        int expected = 11121;

        //Act
        int actual = ValidSenha.validar("senhasenletra1@maiuscula");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaLetraMinuscula() {
        //Arrange
        int expected = 11211;

        //Act
        int actual = ValidSenha.validar("TEST@7XSXSS");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaNumero() {
        //Arrange
        int expected = 12111;

        //Act
        int actual = ValidSenha.validar("TEST@ssXSXSS");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaCaractereEspecial() {
        //Arrange
        int expected = 21111;

        //Act
        int actual = ValidSenha.validar("TEST7ssXSS");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void deveDarErroDeSenhaComEspaco() {
        //Arrange
        int expected = 12122;

        //Act
        int actual = ValidSenha.validar("a @  ");

        //Assert
        assertEquals(expected, actual);
    }
}