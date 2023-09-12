// Conversion de temperaturas celcius y farenheit usando while

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
        char resp;

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Temperatura Inicial: ");
            int temperaturaInicial = obj.nextInt();

            System.out.print("Temperatura Final: ");
            int temperaturaFinal = obj.nextInt();

            if (temperaturaFinal < temperaturaInicial) {
                System.out.println("La temperatura final no puede ser menor que la temperatura inicial.");
            } else {
                System.out.println("------------------------------------");
                System.out.println("Centígrados Farenheit");
                System.out.println("------------------------------------");

                int celsius = temperaturaInicial;
                while (celsius <= temperaturaFinal) {
                    int fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + " " + fahrenheit);
                    celsius++;
                }
            }

            System.out.print("Deseas continuar (S/N)? ");
            resp = obj.next().charAt(0);

        } while (resp != 'N' && resp != 'n');
        System.out.print("Adios gracias por utilizar este conversor");


    }
}