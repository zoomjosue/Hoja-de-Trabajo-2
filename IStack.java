/**
 *  @author José Manuel Sanchez Hernández - 24092, Josué Antonio Isaac García Barrera - 24918 y Jose Alberto Abril Suchite 24585
 *  @version 1.0
 *  Descripción: Este programa está hecho para simular el funcionamiento de una licuadora.
 *  Fecha de creación: 18/01/2025
 *  Fecha de última modificación: 23/01/2025
 */

public interface IStack<T> {
    public void push(T value);
    public T pop();
    public T operation(char operator, T value1, T value2);
}