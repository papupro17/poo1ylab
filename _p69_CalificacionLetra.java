// regresa una letra de acuerdo

import java.util.Scanner;

public class _p69_CalificacionLetra {

    public static char califLetra(float prom) {
        char letra=' ';
        if(prom>=90 && prom<=100) letra='A';
        else if(prom>=80 && prom <=90) letra='B';
        else if(prom>=70 && prom <=80) letra='C';
        else if(prom>=60 && prom <=70) letra='D';
        else if(prom>=0 && prom<=60) letra='F';
        return letra;
    }


    public static void main(String[] args) {
        float prom=0;
        char letra;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        do {
            System.out.print("Dame tu promedio?: "); prom = obj.nextFloat();

        } while(prom<0 || prom>100);

        letra = califLetra(prom);

        System.out.printf("Tu calificación de %.2f equivale a %c", prom, letra);

        
    }
    
}