// Calcular volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        float volumen, pi, multiR, radio, multi2, multi3, altura;
        Scanner obj=new Scanner(System.in);
        pi = (float) 3.1416;
        
        System.out.print("Dame el radio "); radio=obj.nextFloat();
        System.out.print("Bien, ahora dame su altura "); altura=obj.nextFloat();

        multiR = radio*radio;
        multi2 = multiR * altura;
        multi3 = pi * multi2;

        System.out.printf("El volumen es de : %.2f\n", multi3);
        








        
    }
    
}