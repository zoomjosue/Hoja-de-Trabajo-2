/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Este programa está hecho para simular el funcionamiento de una licuadora.
 *  Fecha de creación: 18/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

public class Stack<T extends Number> implements IStack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La stack está vacía");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public T operation(char operator, T value1, T value2) {
        double a = value1.doubleValue(); // Convertir a double
        double b = value2.doubleValue(); // Convertir a double
        double resultado;

        switch (operator) {
            case '+': resultado = b + a; break;
            case '-': resultado = b - a; break;
            case '*': resultado = b * a; break;
            case '%': resultado = b % a; break;
            case '/': 
                if (a == 0) throw new ArithmeticException("División por cero.");
                resultado = b / a;
                break;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operator);
        }

        return (T) (Number) resultado; // Devolver el resultado como Double
    }

    @Override
    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public boolean isEmpty() {
        return top == null;
    }
}