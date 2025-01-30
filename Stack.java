public class Stack<T> implements IStack<T>{
    private Node<T> top;
    private int size;
    

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    /**
     * Este metodo verifica si la stack esta vacia
     *
     * @return retorna true si la stack esta vacia, false si no esta vacia
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Etse metedo elimina y devuelve el ultimo elemento ingresado a la stack
     *
     * @return el elemento eliminado de la pila
     * @throws IllegalStateException si la pila esta vacaa
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Brother, el stack esta vacio");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    @Override
    public T operation(char operator, T value1, T value2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'operation'");
    }

    @Override
    public void push(T value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }
       
}
