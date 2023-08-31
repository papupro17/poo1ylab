// Calcular el 3er angulo de un triángulo 

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        float angulo, angulo2, angulo3, suma, resta;
        angulo3 = 180;
        Scanner obj=new Scanner(System.in);

        System.out.println("Dame el angulo ");  angulo=obj.nextFloat();
        System.out.println("Dame el angulo 2 "); angulo2=obj.nextFloat();

        suma = angulo+angulo2;
        resta = angulo3-suma;
        System.out.printf("El tercer angulo del triangulo es de %.2f\n", resta);



        
    }
    
}
