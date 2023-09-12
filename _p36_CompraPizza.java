// Un usuario puede elegir un tamaño de pizza con distintos precios

import java.util.Scanner;

public class _p36_CompraPizza {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        float pago = 0, total = 0, descuento = 0, PrecioOriginal=0;
        int op;

        System.out.println("1 - Pizza chica   - $5\n");
        System.out.println("2 - Pizza mediana - $10\n");
        System.out.println("3 - Pizza Grande  - $20\n");

        System.out.print("¿Cual desea comprar: \n"); op = obj.nextInt();


        switch (op) {
            case 1 : PrecioOriginal=5; break;
            case 2 : PrecioOriginal=10; break;
            case 3 : PrecioOriginal=20; break;
            default : System.out.print("Opción no valida");
                    return;


        }

        System.out.print("Dame el dinero "); pago = obj.nextFloat();
        
        if (op == 3 && PrecioOriginal > 20) {
            descuento = (PrecioOriginal * 0.15f);
            total = PrecioOriginal - descuento;
        } else {
            total = PrecioOriginal;
        }

        if (pago < total) {
            System.out.println("Tamaño de la compra: Pizza " + op);
            System.out.println("Precio original de la pizza: $" + PrecioOriginal);
            System.out.println("Total de compra: $" + total);
            System.out.println("No tuviste descuento.");
            System.out.println("Gracias por confiar en nosotros");
        } else {
            System.out.println("Tamaño de la compra: Pizza " + op);
            System.out.println("Precio original de la pizza: $" + PrecioOriginal);
            System.out.println("Total de compra: $" + total);
            System.out.println("Descuento: $" + descuento);
            System.out.println("Total de compra con descuento: $" + total);
            System.out.println("Gracias por confiar en nosotros");

        }
        


        

    }
}
