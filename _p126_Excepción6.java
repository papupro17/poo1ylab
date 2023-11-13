import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class _p126_Excepción6 {
    public static void main(String[] args) {
        try {

            File nombres = new File("nombres.txt");
            Scanner arch = new Scanner(nombres);
            while (arch.hasNextLine())
                System.out.println(arch.nextLine());
            } catch (FileNotFoundException e) {
                System.out.println("El archivo que intentas leer no existe, vete a a almorzar mugre viejo menso no le sabes a la programación o qué jajaj");
            }

        
    }
    
}