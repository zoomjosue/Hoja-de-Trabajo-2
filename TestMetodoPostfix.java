import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para el metodo en la clase Postfix
 */
class PostFixTest {
    private PostFix postFix;

    /**
     * Configura una nueva instancia de Postfix antes de cada prueba
     */
    @BeforeEach
    void setUp() {
        postFix = new PostFix();
    }

    /**
     * Prueba las expresiones del texto en notacion postfix
     */
    @Test
    void testEvaluatePostFix() {
        assertEquals(9, postFix.evaluatePostFix("4 5 +"), "4 + 5 debería ser 9");
        assertEquals(20, postFix.evaluatePostFix("4 5 *"), "4 * 5 debería ser 20");
        assertEquals(2, postFix.evaluatePostFix("8 4 /"), "8 / 4 debería ser 2");
        assertEquals(3, postFix.evaluatePostFix("10 7 -"), "10 - 7 debería ser 3");
    }
}
