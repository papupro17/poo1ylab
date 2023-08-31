// Convertir de pesos a dolares

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        float dolares, pesos, multi;
        Scanner obj=new Scanner(System.in);
        dolares = (float) 16.81;
        System.out.printf("Dame tu cantidad de pesos: "); pesos=obj.nextFloat();
        pesos = pesos / dolares;
        System.out.printf("Tus pesos son %.2f doláres", pesos);





        
    }
    
}