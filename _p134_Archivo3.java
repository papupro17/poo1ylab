import java.io.*;

public class _p134_Archivo3 {
    public static void main(String[] args) {
        File arch = new File("nombres.txt");

        if(!arch.exists()) {
            System.out.println("El archivo no existe!");
        } else {
            try {
                BufferedReader fnombres = new BufferedReader(new FileReader(arch));
                String Linea;
                System.out.println("Los nombres almacenados en el archivo " + arch.getName() + " son:");
                while ( (Linea = fnombres.readLine()) != null) {
                    System.out.println(Linea);


                }
                fnombres.close();

            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo " + e);

            }

        }
        System.out.println("Longitud del archivo 0" + arch.length() + " bytes");
        }
}