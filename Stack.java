public class Stack<T extends Number> implements IStack<T>{
    private Node<T> top;
    private int size;
    

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    /**
     * Este método verifica si la stack esta vacía
     *
     * @return retorna true si la stack esta vacía, false si no esta vacía
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Este método elimina y devuelve el último elemento ingresado a la stack
     *
     * @return el elemento eliminado de la pila
     * @throws IllegalStateException si la pila esta vacía
     */
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
        double a = value1.doubleValue();
        double b = value2.doubleValue();
        double resultado;

        switch (operator) {
            case '+': resultado = a + b; break;
            case '-': resultado = a - b; break;
            case '*': resultado = a * b; break;
            case '/': 
                if (b == 0) throw new ArithmeticException("División por cero.");
                resultado = a / b;
                break;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operator);
        }

        return (T) (Number) resultado; // Cast para devolver el resultado correcto
    }

    
    /**
     * Este método agrega un nuevo valor en la parte superior de la stack
     * @param value el valor a agregar en la stack
     */
    @Override
    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }
}