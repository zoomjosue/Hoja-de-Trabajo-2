import java.util.Scanner;

public class PostFix {
    private Stack<Integer> stack;


    /**
     * Constructor de la clase PostFix
     */
    public PostFix() {
        stack = new Stack<>();
    }


    /**
     * Este método evalúa una operación en notación postfix
     *
     * @param operation la operación en notación postfix
     * @return el resultado de la operación
     */
    public int evaluatePostFix(String operation) {
        Scanner scanner = new Scanner(operation);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                stack.push(scanner.nextInt());
            } else {
                char operator = scanner.next().charAt(0);
                int b = stack.pop();
                int a = stack.pop();
                int result = stack.operation(operator, a, b);
                stack.push(result);
            }
        }
        scanner.close();
        return stack.pop();
    }
}