// Calcular la paga de un trabajador

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre del Trabajador: ");
        nombre = obj.nextLine();
        System.out.print("Horas trabajadas: ");
        horas = obj.nextInt();
        System.out.print("Paga por hora: ");
        paga = obj.nextDouble();
        tasa = 0.03;

        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        System.out.println("\nResumen de pago\n");
        System.out.println(String.format("El trabajador %s trabajó %d horas, a una paga de %.2f pesos la hora, con una tasa de impuestos de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta = %.2f", pagabruta));
        System.out.println(String.format("Impuestos = %.2f", impuesto));
        System.out.println(String.format("Paga Neta = %.2f", paganeta));
    }
}