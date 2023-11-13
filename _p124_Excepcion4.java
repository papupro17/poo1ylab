import java.util.InputMismatchException;
import java.util.Scanner;

public class _p124_Excepcion4 {
    public static void main(String[] args) {
        
        try {
            Scanner obj = new Scanner(System.in);
            System.out.print("Dame el numerador: "); int a = obj.nextInt();
            System.out.print("Dame el denominador: "); int b = obj.nextInt();
            int c = a / b;
            System.out.println("El resultado es " + c);

        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Ambos valores debe ser numericos y el denominador no puede ser 0");
            System.out.println("Mensaje del sistema " + e);
        } finally {
            System.out.println("Hemos terminado ! Si no fallaste, felicidades, y si fallaste pues ya ni modo jajajaja");
        }
    }
}