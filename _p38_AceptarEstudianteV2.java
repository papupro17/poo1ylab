// AceptarEstudiante pero la version DOOOS

import java.util.Scanner;

public class _p38_AceptarEstudianteV2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush(); 
        Scanner obj = new Scanner(System.in);

        String nombre = "";
        int edad;
        float c1=0,c2=0,c3=0, prom=0;
        char sexo;
        
        System.out.print("Sistema de Admisión - Bienvenido a la Universidad Kitty Kat SA ");
        System.out.println("Deme su nombre:");
        nombre = obj.nextLine();
        System.out.println("Un gusto " + nombre);
        System.out.println("Deme su edad: ");
        edad = obj.nextInt();
        obj.nextLine();

        if (edad<21) {
            System.out.print("Lo sentimos, solo admitimos personas mayores de 21 años");
        } else {
            System.out.println("Deme su Sexo (h/m): "); sexo = obj.nextLine().charAt(0);
            if (sexo == 'h') {
                System.out.print("Solo aceptamos mujeres, lo siento");

            } else {
                System.out.printf("Calificaciones: "); 
                c1 = obj.nextFloat();
                c2 = obj.nextFloat();
                c3 = obj.nextFloat();
                prom = (c1+c2+c3)/3;
                if (prom > 8 && prom > 9.5) {
                System.out.printf("Bienvenida, eres admitida");
                
                } else {
                    System.out.printf("Lo siento, solo admitimos promedios entre 8 y 9.5, ADIOS");
                }
            }
            
        }    
    }
}    