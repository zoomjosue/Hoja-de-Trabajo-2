import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
                   String PathDeArchivo = "datos.txt";
                   try (BufferedReader read = new BufferedReader(new FileReader(PathDeArchivo))) {
                       String line;
                       System.out.println("Resultados:");
                       while ((line = read.readLine()) != null) {
                           try {
                               int resultado = calculator.evaluatePostFix(line);
                               System.out.println("El resultado de la operación: " + line + " es: " + resultado);
                           } 

                           catch (Exception error) {
                               System.out.println("Hay un error en la línea: " + line + "el error es por: " + error.getMessage());
                           }
                       }
                   } 
                   
                   catch (IOException error) {
                       System.out.println("No fue posible leer el archivo: " + error.getMessage());
                   }
                   break;

               case "2":
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