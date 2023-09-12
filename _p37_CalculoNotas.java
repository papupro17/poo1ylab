// Se desea calcular el promedio de 5 calificaciones

import java.util.Scanner;

public class _p37_CalculoNotas {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner obj = new Scanner(System.in);
        float cal1, cal2, cal3, cal4, cal5, prom=0;

        System.out.println("Dame 5 calificaciones\n");
        System.out.println("Calificación 1: "); cal1 = obj.nextFloat();
        System.out.println("Calificación 2: "); cal2 = obj.nextFloat();
        System.out.println("Calificación 3: "); cal3 = obj.nextFloat();
        System.out.println("Calificación 4: "); cal4 = obj.nextFloat();
        System.out.println("Calificación 5: "); cal5 = obj.nextFloat();

        prom= (cal1+cal2+cal3+cal4+cal5)/5;

        System.out.printf("Tu promedio es de %.2f\n", prom);

        if (prom >0 && prom <= 6) {
            System.out.print("Quedas reprobado");
        } else if (prom > 6 && prom <=7 ) {
            System.out.print("Pasas de panzazo");
        } else if (prom > 7 && prom <= 8) {
            System.out.print("Muy bien, pero puedes mejorar, ¿ok?");
        } else if (prom >8 && prom <= 9) {
            System.out.print("Excelente, sigue así!");
        } else if (prom > 9 && prom <= 10) {
            System.out.print("Perfecto, tu esfuerzo ha valido la pena");
        } else {
                System.out.print("");

            }
            System.out.print("\nGracias por usar este programa adiooos");



        
    }
    
}