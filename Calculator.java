/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Este programa está hecho para simular el funcionamiento de una licuadora.
 *  Fecha de creación: 18/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {
    private Stack<Double> stack;

    /**
     * Constructor de la clase Calculator
     */
    public Calculator() {
        stack = new Stack<>();
    }

    /**
     * Este método evalúa una operación en notación postfix
     *
     * @param operation la operación en notación postfix como una lista de cadenas
     * @return el resultado de la operación
     */
    public double evaluatePostFix(ArrayList<String> operation) {
        for (String str : operation) {
            if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("%")) {
                double value2 = stack.pop();
                double value1 = stack.pop();
                stack.push(stack.operation(str.charAt(0), value1, value2));
            } else {
                // Convertir el valor a Double antes de pasarlo a la pila
                stack.push(Double.parseDouble(str));
            }
        }
        return stack.pop();
    }

    /**
     * Este método lee un archivo y evalúa las operaciones postfix en cada línea.
     *
     * @param file la ruta del archivo que contiene las operaciones postfix
     */
    public void calculate(String file) {
        ArrayList<ArrayList<String>> documentLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Separar palabras por espacios
                ArrayList<String> prefixOperation = new ArrayList<>(Arrays.asList(line.split(" ")));
                documentLines.add(prefixOperation);
            }
        } catch (IOException e) {
            System.out.println("Error en lectura del documento: " + e.getMessage());
        }

        for (ArrayList<String> line : documentLines) {
            try {
                double result = evaluatePostFix(line);
                System.out.println("\nOperación: " + line);
                System.out.println("Resultado: " + result);
            } catch (Exception e) {
                System.out.println("Error al evaluar la línea: " + line + " - " + e.getMessage());
            }
        }
    }
}