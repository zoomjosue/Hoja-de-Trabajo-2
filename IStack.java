public interface IStack<T> {
    public void push(T value);
    public T pop();
    public T operation(char operator, T value1, T value2);
}