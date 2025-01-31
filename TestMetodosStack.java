import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de pruebas unitarias para los metodos empleados en la calse stack
 */

class TestMetodosStack{
    private Stack<Integer> stack;

    /**
     * Configura una nueva stack antes de cada prueba
     */
    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    /**
     * Verifica que una nueva stack estE vacia
     */
    @Test
    void testDeNuevaStackVacia() {
        assertTrue(stack.isEmpty(), "La pila debería estar vacía al inicio");
    }

    /**
     * Prueba la funcionalidad de push para agregar elementos a la stack
     */
    @Test
    void testPush() {
        stack.push(10);
        assertFalse(stack.isEmpty(), "La pila no debería estar vacía después de insertar un elemento");
    }

    /**
     * Prueba la funcionalidad de pop para eliminar elementos de la stack
     */
    @Test
    void testPop() {
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.pop(), "El último elemento ingresado debe ser el primero en salir");
        assertEquals(5, stack.pop(), "El siguiente elemento en salir debe ser 5");
        assertTrue(stack.isEmpty(), "La pila debería estar vacía después de eliminar todos los elementos");
    }

    /**
     * Prueba la operacion de suma en la stack
     */
    @Test
    void testOperacionSuma() {
        assertEquals(8, stack.operation('+', 3, 5), "3 + 5 debería ser 8");
    }

    /**
     * Prueba la operacion de resta en la stack
     */
    @Test
    void testOperacionResta() {
        assertEquals(2, stack.operation('-', 3, 5), "5 - 3 debería ser 2");
    }

    /**
     * Prueba la operacion de multiplicacion en la stack
     */
    @Test
    void testOperacionMultiplicacion() {
        assertEquals(15, stack.operation('*', 3, 5), "3 * 5 debería ser 15");
    }

    /**
     * Prueba la operacion de division en la stack
     */
    @Test
    void testOperacionDivision() {
        assertEquals(2, stack.operation('/', 5, 10), "10 / 5 debería ser 2");
    }

    /**
     * Prueba la operacion de mmdulo en la stack
     */
    @Test
    void testOperacionModulo() {
        assertEquals(1, stack.operation('%', 3, 10), "10 % 3 debería ser 1");
    }

    /**
     * Prueba el manejo de division por cero en la stack
     */
    @Test
    void testOperacionDeDivisionCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> stack.operation('/', 0, 10));
        assertEquals("División por cero.", exception.getMessage());
    }

    /**
     * Prueba el manejo de un operador invalido en la stack
     */
    @Test
    void testOperadorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> stack.operation('x', 3, 5));
        assertEquals("Operador no válido: x", exception.getMessage());
    } 
}
