// Funciones de pul a cm, y de m a pies

import java.util.Scanner;

public class _p77_MedidasLongitud {

    public static void Pulgadas() {
        float pul,res;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame tus pulgadas "); pul = obj.nextFloat();
        res = (float) (pul * 2.54);
        System.out.printf("Tus pulgadas %f son en total %f centimetros ",pul,res);

    }

    public static void Metros() { 
        float m, res;
        Scanner obj = new Scanner(System.in);
        System.out.print("Dame tus Metros "); m = obj.nextFloat();
        res = (float) (m*3.281);
        System.out.printf("Tus metros %f son en total %f pies ", m,res);
    }

    public static void main(String[] args) {
        float pul,m,res;
        char opc;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("[P]ulgadas a cm o [M]etros a pies? "); 
        System.out.print("\nElige tu opción ");
        opc = Character.toUpperCase(obj.next().charAt(0));

        if ( opc == 'P') {
            Pulgadas();
        }
        else if (opc == 'M') {
            Metros();
        } else
        System.out.print("Opción invalida");
        
        
        System.out.print("\nGracias por utilizar el programa amigo");
        

    }
    
}
 