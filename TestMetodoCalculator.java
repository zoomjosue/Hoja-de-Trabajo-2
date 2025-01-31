import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para el metodo en la clase Postfix
 */
class TestMetodoCalculadora {
    private  Calculator calculator;

    /**
     * Configura una nueva instancia de Postfix antes de cada prueba
     */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Prueba las expresiones del texto en notacion postfix
     */
    @Test
    void testEvaluatePostFix() {
        assertEquals(9, calculator.evaluatePostFix("4 5 +"), "4 + 5 debería ser 9");
        assertEquals(20, calculator.evaluatePostFix("4 5 *"), "4 * 5 debería ser 20");
        assertEquals(2, calculator.evaluatePostFix("8 4 /"), "8 / 4 debería ser 2");
        assertEquals(3, calculator.evaluatePostFix("10 7 -"), "10 - 7 debería ser 3");
    }
}
