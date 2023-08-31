// Convertir grados farenheit a grados celcius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        float fahrenheit, celcius, multi, resta,div;
        Scanner obj=new Scanner(System.in);
        fahrenheit = resta = multi = 0;
        System.out.print("Dame la temperuatura en fahreinheit: "); fahrenheit=obj.nextFloat();

        resta= (fahrenheit - 32);
        div = (5.0f/9.0f);
        multi = resta*div;
        // celcius = multi;
        
        System.out.printf("La temperatura a celcius es de %,2f\n", multi);

        


    }
    
}