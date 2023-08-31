// Calcula la asuma y el promedio de tres calificaiones, calcula la mayor y la menor de ellas

import java.util.Scanner;

public class _p06_PromedioCalificaciones {
    public static void main(String[] args) {
        float cal1, cal2, cal3, suma, prom, min, max;
        Scanner obj=new Scanner(System.in);

        cal1=cal2=cal3=0;

        System.out.println("Calificacion 1 ? "); cal1=obj.nextFloat();
        System.out.println("Calificacion 2 ? "); cal2=obj.nextFloat();
        System.out.println("Calificacion 3 ? "); cal3=obj.nextFloat();

        suma=cal1+cal2+cal3;
        prom=suma/3;
        min= Math.min(Math.min(cal1,cal2), cal3);
        max= Math.max(Math.max(cal1,cal2), cal3);

        System.out.printf("\nLas calificaciones fueron: %.2f,%.2f,%.2f\n",cal1,cal2,cal3);
        System.out.printf("Suma        : %.2f\n", suma);
        System.out.printf("Promedio    : %.2f\n", prom);
        System.out.printf("Menor       : %.2f\n", min);
        System.out.printf("Mayor       : %.2f\n", max);
    }
    
}
