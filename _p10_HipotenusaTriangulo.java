// Calcular la hipotenusa de un triangulo

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        // System.out.print("\033[H\033[2J"); System.out.flush();
        float lad1, lad2, hipotenusa, suma, multi, multi2; 
        Scanner obj=new Scanner(System.in);

        System.out.print("Dame la longitud del lado 1 "); lad1=obj.nextFloat();

        System.out.print("Dame la segunda longitud del lado 2 "); lad2=obj.nextFloat();

        multi = lad1*lad1;
        multi2 = lad2*lad2;
        suma = multi+multi2;
        hipotenusa = (float) (Math.sqrt(suma));
        
        System.out.printf("\nLa hipotenusa es de: %.2f\n", hipotenusa);

    }
    
}
