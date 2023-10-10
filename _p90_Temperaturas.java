// Elaborar un programa llamado temperaturas

public class _p90_Temperaturas {
    public static void main(String[] args) {
        float[] temps = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("\nEl primero numero de la lista es" +  temps[0]);
        System.out.print("\nEl Tercer numero de la lista es" +  temps[2]);

        for (int i=0; i < temps.length; i++) {
            
            System.out.println("\nEl numero " + i + " del arreglo es");
            System.out.println(temps[i] + " ");
        }   System.out.print("\nAhora todos los numeros mayores a 10 serán 0");
        for (int i=0; i < temps.length; i++) {
            if (temps[i] > 10);
                temps[i] = 0;
                
        } for (int i=0; i < temps.length; i++) {
            System.out.println(temps[i]);
        }
    } 
    
}