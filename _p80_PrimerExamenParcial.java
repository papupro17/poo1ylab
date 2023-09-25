// crear un programa que me pregunte sobre edades nombres y generos y tipo de ocupacion y que al final me calcule algunos datos como total de personas y dinero recaudado 
import java.util.Scanner;

public class _p80_PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlumnos = 0;
        int totalDocentes = 0;
        int totalTrabajadores = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int totalParticipantes = 0;
        int totalDineroAlumnos = 0;
        int totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;
        int totalDineroGeneral = 0;
        int totalEdad = 0;

        boolean continuar = true;

        do {
            System.out.println("Ingrese nombre del participante o si no escriba fin si quiere terminar el proceso:");
            String nombre = scanner.nextLine();

            if (nombre.equals("fin")) {
                continuar = false;
                break;
            }

            System.out.println("Ingrese edad:");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Ingrese sexo (Hombre/Mujer):");
            String sexo = scanner.nextLine();

            System.out.println("Ingrese tipo de participante (Alumno/Docente/Trabajador):");
            String tipoParticipante = scanner.nextLine();

            int costoDeLaInscripcion = 0;

            switch (tipoParticipante.toLowerCase()) {
                case "alumno":
                    costoDeLaInscripcion = 50;
                    totalAlumnos++;
                    totalDineroAlumnos += costoDeLaInscripcion;
                    break;
                case "docente":
                    costoDeLaInscripcion = 80;
                    totalDocentes++;
                    totalDineroDocentes += costoDeLaInscripcion;
                    break;
                case "trabajador":
                    costoDeLaInscripcion = 60;
                    totalTrabajadores++;
                    totalDineroTrabajadores += costoDeLaInscripcion;
                    break;
                default:
                    System.out.println("Tipo de participante no válido.");
                    break;
            }

            if (edad >= 18) {
                totalParticipantes++;
                totalEdad += edad;

                if (sexo.equalsIgnoreCase("Hombre")) {
                    totalHombres++;
                } else {
                    totalMujeres++;
                }

                totalDineroGeneral += costoDeLaInscripcion;
            } else {
                System.out.println("Perdon pero los menores de edad no pueden inscribirse.");
            }

        } while (continuar);

        if (totalParticipantes > 0) {
            double promedioEdad = (double) totalEdad / totalParticipantes;

            System.out.println("Total de Alumnos: " + totalAlumnos);
            System.out.println("Total de Docentes: " + totalDocentes);
            System.out.println("Total de Trabajadores: " + totalTrabajadores);
            System.out.println("Total de Hombres en general: " + totalHombres);
            System.out.println("Total de Mujeres en general: " + totalMujeres);
            System.out.println("Total de todos los participantes: " + totalParticipantes);
            System.out.println("Promedio de edad de todos los participantes: " + promedioEdad);

            System.out.println("Total dinero recaudado de los Alumnos: " + totalDineroAlumnos);
            System.out.println("Total dinero recaudado de  los Docentes: " + totalDineroDocentes);
            System.out.println("Total dinero recaudado de  los Trabajadores: " + totalDineroTrabajadores);
            System.out.println("Total dinero en general: " + totalDineroGeneral);

            if (totalDineroGeneral < 100) {
                System.out.println("El evento termina con ganancias bajas");
            } else if (totalDineroGeneral < 200) {
                System.out.println("El evento termina con ganancias moderadas");
            } else {
                System.out.println("El evento termina con unas buenas ganancias");
            }
        } else {
            System.out.println("No hubo ningun participante inscrito gracias por usar :D.");
        }
    }
}