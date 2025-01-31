/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Este programa está hecho para simular el funcionamiento de una licuadora.
 *  Fecha de creación: 18/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Clase de prueba para la clase Calculator.
 */
class CalculatorTest {
    private Calculator calculator;

    /**
     * Configura un nuevo objeto Calculator antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    /**
     * Prueba la operación de suma en notación postfix.
     */
    @Test
    void testAddition() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("3", "5", "+"));
        assertEquals(8.0, calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba la operación de resta en notación postfix.
     */
    @Test
    void testSubtraction() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("10", "4", "-"));
        assertEquals(6.0, calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba la operación de multiplicación en notación postfix.
     */
    @Test
    void testMultiplication() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("6", "7", "*"));
        assertEquals(42.0, calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba la operación de división en notación postfix.
     */
    @Test
    void testDivision() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("20", "4", "/"));
        assertEquals(5.0, calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba la operación de módulo en notación postfix.
     */
    @Test
    void testModulo() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("10", "3", "%"));
        assertEquals(1.0, calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba una expresión más compleja en notación postfix.
     */
    @Test
    void testComplexExpression() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("5", "1", "2", "+", "4", "*", "+", "3", "-"));
        assertEquals(14.0, calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba una expresión inválida que debería lanzar una excepción.
     */
    @Test
    void testInvalidExpression() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("3", "+"));
        assertThrows(Exception.class, () -> calculator.evaluatePostFix(operation));
    }

    /**
     * Prueba la división por cero, que debería lanzar una ArithmeticException.
     */
    @Test
    void testDivisionByZero() {
        ArrayList<String> operation = new ArrayList<>(Arrays.asList("5", "0", "/"));
        assertThrows(ArithmeticException.class, () -> calculator.evaluatePostFix(operation));
    }
}