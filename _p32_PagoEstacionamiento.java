// Administra el pago de impuesto por estacionamiento de acuerdo a la zona

import java.util.Scanner;

public class _p32_PagoEstacionamiento {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);
        float pago = 0, tasa = 0, impuesto = 0, total = 0;
        int op;

        System.out.println("Administra el pago de impuesto por estacionamiento de acuerdo a la zona\n");
        System.out.println("1 - Estacionamiento Tacuba                     - 3% \n");
        System.out.println("2 - Estacionamiento Portales                   - 5% \n");
        System.out.println("3 - Estacionamiento Conquistadores             - 10% \n");
        System.out.println("4 - Estacionamiento Pajaros Caídos             - 15% \n");
        System.out.println("Elige una opción: \n");
        op = obj.nextInt();
        System.out.println("Pago efectuado: \n");
        pago = obj.nextFloat();

        switch (op) {
            case 1:
                tasa = 0.03f;
                break;
            case 2:
                tasa = 0.05f;
                break;
            case 3:
                tasa = 0.10f;
                break;
            case 4:
                tasa = 0.15f;
                break;

        }
        impuesto = pago * tasa;
        total = pago + impuesto;

        System.out.printf("El pago total por estacionamiento incluido el impuesto es de %.2f", total);

    }
}