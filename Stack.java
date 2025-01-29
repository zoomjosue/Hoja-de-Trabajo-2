public class Stack<T> implements IStack<T>{
    private Node<T> top;
    private int size;
    

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
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
