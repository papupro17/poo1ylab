// Calcula la paga de un trabajador, las horas extra se pagan al doble

import java.io.Console;
import java.util.Scanner;

public class _p24_PagaTrabajadorV2 {
    public static void main(String[] args) {
        int horas, extr=0;
        float paga, total;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Calcula la paga de un trabajdor,la hora extra se pagan al doble\n");
        System.out.println("Horas trabajadas : "); horas = obj.nextInt();
        System.out.println("Paga x hora: "); paga = obj.nextFloat();

        if(horas>40 ) {
            extr = horas - 40;
            total = 40 * paga + (2 * paga * extr);
        
        } else total = horas * paga;

        System.out.printf("\nHoras extra : %d", extr);
        System.out.printf("\nEl pago total es de %,.2f", total);
    }
}