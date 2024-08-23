import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaAlumnos {
    private static final Map<String, String> alumnos = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    ingresarAlumno();
                    break;
                case 2:
                    buscarAlumno();
                    break;
                case 3:
                    eliminarAlumno();
                    break;
                case 4:
                    mostrarTodosAlumnos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void ingresarAlumno() {
        System.out.print("Ingrese el carnet del alumno: ");
        String carnet = scanner.nextLine();
        System.out.print("Ingrese el nombre completo del alumno: ");
        String nombre = scanner.nextLine();
        alumnos.put(carnet, nombre);
        System.out.println("Alumno ingresado exitosamente.");
    }

    private static void buscarAlumno() {
        System.out.print("Ingrese el carnet del alumno a buscar: ");
        String carnet = scanner.nextLine();
        String nombre = alumnos.get(carnet);
        if (nombre != null) {
            System.out.println("Alumno encontrado: " + nombre);
        } else {
            System.out.println("Alumno no encontrado, no se puede mostrar.");
        }
    }

    private static void eliminarAlumno() {
        System.out.print("Ingrese el carnet del alumno a eliminar: ");
        String carnet = scanner.nextLine();
        if (alumnos.remove(carnet) != null) {
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado, no se puede eliminar.");
        }
    }

    private static void mostrarTodosAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("Listado de todos los alumnos:");
            for (Map.Entry<String, String> entry : alumnos.entrySet()) {
                System.out.println("Carnet: " + entry.getKey() + ", Nombre: " + entry.getValue());
            }
        }
    }
}
