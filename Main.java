
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Calculator calculator = new Calculator();
       boolean calcOn = true;

       while (calcOn) {
           System.out.println("\n-------Calculadora Postfix-------");
           System.out.println("1. Leer archivo de texto");
           System.out.println("2. Salir");
           System.out.print("Elige una opción: ");
            
           String opciones = scanner.nextLine();
           switch (opciones) {

                   case "1":
                   calculator.calculate("datos.txt"); 
                   break;

               case "3":
                   System.out.println("Saliendo...");
                   calcOn = false;
                   break;

               default:
                   System.out.println("Elige una opción válida.");
           }
           System.out.println(); 
       }
       scanner.close();
   }
}