package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("CP0100010122", "Ford", 2023, 125345.22);
        Vehiculo vehiculo2 = new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33);
        Vehiculo vehiculo3 = new Vehiculo("CA104014544", "Dina", 2008, 234567.15);
        Vehiculo vehiculo4 = new Vehiculo("CA774814599", "Hongyan", 2023, 934577.98);

        Compacto compacto1 = new Compacto(vehiculo1, 4, 2);
        Compacto compacto2 = new Compacto(vehiculo2, 6, 4);
        Camioneta camioneta1 = new Camioneta(vehiculo3, 450.0, 4);
        Camioneta camioneta2 = new Camioneta(vehiculo4, 1200.0, 6);

        double totalPrecio = vehiculo1.getPrecio() + vehiculo2.getPrecio() + vehiculo3.getPrecio() + vehiculo4.getPrecio();

        System.out.println("Datos de los Vehiculos de la flota");
        System.out.println(compacto1);
        System.out.println(compacto2);
        System.out.println(camioneta1);
        System.out.println(camioneta2);
        
        System.out.println("Calculando el total de precio de todos los vehículos ...");
        System.out.println(vehiculo1.getPrecio());
        System.out.println(vehiculo2.getPrecio());
        System.out.println(vehiculo3.getPrecio());
        System.out.println(vehiculo4.getPrecio());
        System.out.println("La suma de precios es: " + totalPrecio);
    }
}