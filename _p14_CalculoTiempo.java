//Calcular horas en dias, minutos y segundos

import java.util.Scanner; 

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        int dia, minutos, segundos, horas;
        Scanner obj=new Scanner(System.in);

        System.out.print("Dame una cantidad de horas: "); horas=obj.nextInt();

        dia = (int) (horas/24.0f);
        minutos = horas*60;
        segundos = horas*3600;

        System.out.printf("Tus horas en días son de: %d\n", dia);
        System.out.printf("Tus horas en minutos: %d\n", minutos);
        System.out.printf("Tus horas en segundos %d\n", segundos);





    }
    
}