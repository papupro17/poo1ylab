// Muestra el tipo de angulo según los grados

import java.util.Scanner;

public class _p26_TipoAngulo {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Muestra el tipo de angulo segun los grados\n");
        System.out.print("Dame un angulo entre 0 y 360 grados");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo >= 0 && angulo <= 360) {
            System.out.print("El angulo que introdujiste es de: ");
            if (angulo < 90)
                System.out.println("Agudo ");
            if (angulo == 90)
                System.out.println("Recto ");
            if (angulo > 90 && angulo < 180)
                System.out.println("Obtuso ");
            if (angulo == 180)
                System.out.println("Llano ");
            if (angulo > 180 && angulo < 360)
                System.out.println("Convaco ");
            if (angulo == 360)
                System.out.println("Completo ");

        } else
            System.out.println("\nAngulo fuera de rango");

        System.out.println("\nProceso terminado");

    }

}