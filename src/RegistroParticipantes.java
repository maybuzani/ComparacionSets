import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RegistroParticipantes {
    public static void main(String[] args) {

        Set<String> estudiantes = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            System.out.println(" \n Menu de regsitro ");
            System.out.println("1. Registrar estudiante ");
            System.out.println("2. Buscar estudiante ");
            System.out.println("3. Eliminar estudiante ");
            System.out.println("4. Mostrar estudiantes ");
            System.out.println("5. Mostrar numero de estudiantes ");
            System.out.println("6. Salir ");
            System.out.print("Elija una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del estudiante: ");
                    String idRegistrar = scanner.nextLine();
                    if (estudiantes.add(idRegistrar)) {
                        System.out.println("Estudiante registrado");
                    } else {
                        System.out.println("El estudiante ya existe en el registro ");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el ID a buscar: ");
                    String idBuscar = scanner.nextLine();
                    if (estudiantes.contains(idBuscar)) {
                        System.out.println("El estudiante esta registrado");
                    } else {
                        System.out.println("El estudiante no fue encontrado ");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el ID a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    if (estudiantes.remove(idEliminar)) {
                        System.out.println("Estudiante eliminado correctamente ");
                    } else {
                        System.out.println("El estudiante no existe ");
                    }
                    break;
                case 4:
                    System.out.println("Lista de estudiantes: \n");
                    for (String est : estudiantes) {
                        System.out.println(est);
                    }
                    break;
                case 5:
                    System.out.println("Total de estudiantes: " + estudiantes.size());
                    break;
                case 6:
                    System.out.println("Saliendo del sistema ");
                    break;
                default:
                    System.out.println("Opcion no valida ");
            }
        } scanner.close();
    }
}