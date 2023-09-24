// Funcion de un angulo de 0 a 360 grados con nombres

import java.util.Scanner;

public class _p79_Angulo {

    public static void Angulos(int angulo) {
        if (angulo < 0 || angulo > 360) {
            System.out.println("Tu ángulo está fuera del rango");
        } else if (angulo < 90) {
            System.out.println("Tu ángulo es agudo");
        } else if (angulo == 90) {
            System.out.println("Tu ángulo es recto");
        } else if (angulo > 90 && angulo < 180) {
            System.out.println("Tu ángulo es obtuso");
        } else if (angulo == 180) {
            System.out.println("Tu ángulo es llano");
        } else if (angulo > 180 && angulo < 360) {
            System.out.println("Tu ángulo es cóncavo");
        }
    }

    
    
    public static void main(String[] args) {
        int angulo;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un angulo del 0 al 360: "); angulo = obj.nextInt();
        Angulos(angulo);
        
        
        
        
    }
}