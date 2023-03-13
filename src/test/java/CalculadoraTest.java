package test.java;

import main.java.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void verificarMetodoVerdadeiro() {
        int numero1, numero2;
        numero1 = 2;
        numero2 = 9;
        Assertions.assertTrue(numero2 > 10, "O Numero precisa ser maior do que 10" );
    }

    @Test
    public void verificarMetodoFalso() {
        int numero1, numero2;
        numero1 = 2;
        numero2 = 9;
        Assertions.assertFalse(numero1 < 0, "O Numero precisa ser menor do que 0" );
    }
    @Test
    public void verificarMetodoIgualdade() {
        int numero1, numero2;
        numero1 = 2;
        numero2 = 9;
        Calculadora calculadora = new Calculadora(numero1, numero2);
        int resultado = calculadora.soma(numero1, numero2);
        Assertions.assertEquals(11, resultado);
    }

    @Test
    public void verificarMetodoDiferenca() {
        int numero1, numero2;
        numero1 = 2;
        numero2 = 9;
        Assertions.assertNotEquals(numero1, numero2, "Os numeros não devem ser iguais");
    }

    @Test
    public void verificarMetodoNulo() {
        String numero10 = null;
        Assertions.assertNull(numero10, "O valor em questão tem que ser nulo");
    }

    @Test
    public void verificarMetodoNaoNulo() {
        String numero10 = null;
        Assertions.assertNull(numero10, "O valor em questão não pode ser nulo");
    }

}
