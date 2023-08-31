// Calcula la fuerza, masa o aceleración de acuerdo a la segunda ley de Newton

import java.util.Scanner;

public class _p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m, a;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.println("Calcula la segunda ley de newton");
        System.out.print("[F] Fuerza            f = m*a ");
        System.out.print("[M] Masa              m = f/a ");
        System.out.print("[A] Aceleración       a = f/m ");
        System.out.print("Elige: ");

        op = Character.toUpperCase(obj.next().charAt(0));
        f = m = a = 0;
        if (op == 'F') {
            System.out.println("Calculando la Fuerza...");
            System.out.print("Masa: ");
            m = obj.nextFloat();
            System.out.print("Aceleración: ");
            a = obj.nextFloat();
            f = m * a;
            System.out.printf("La Fuerza es %.2f", f);

        } else if (op == 'M') {
            System.out.println("Calculando la Masa...");
            System.out.print("Fuerza: ");
            f = obj.nextFloat();
            System.out.print("Aceleración: ");
            a = obj.nextFloat();
            m = f / a;
            System.out.printf("La Masa es %.2f", m);
        } else if (op == 'A') {
            System.out.println("Calculando la Aceleración...");
            System.out.print("Fuerza: ");
            f = obj.nextFloat();
            System.out.print("Masa: ");
            m = obj.nextFloat();
            a = f / m;
            System.out.printf("La Masa es %.2f", a);

        } else
            System.out.println("Opción incorrecta...");
        System.out.println("\nProceso terminado, muchas gracias por usar el programa ;)");

    }

}
