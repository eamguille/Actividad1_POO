import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaAlumnos {
    // Crear un HashMap para almacenar los estudiantes
    private static Map<String, String> estudiantes = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar menú
            System.out.println("Menú:");
            System.out.println("1. Ingresar alumno");
            System.out.println("2. Buscar alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    ingresarAlumno(scanner);
                    break;
                case 2:
                    buscarAlumno(scanner);
                    break;
                case 3:
                    eliminarAlumno(scanner);
                    break;
                case 4:
                    mostrarTodosLosAlumnos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
    
    private static void ingresarAlumno(Scanner scanner) {
        System.out.print("Ingrese el carnet del alumno: ");
        String carnet = scanner.nextLine();
        System.out.print("Ingrese el nombre completo del alumno: ");
        String nombre = scanner.nextLine();
        
        estudiantes.put(carnet, nombre);
        System.out.println("Alumno ingresado exitosamente.");
    }
    
    private static void buscarAlumno(Scanner scanner) {
        System.out.print("Ingrese el carnet del alumno a buscar: ");
        String carnet = scanner.nextLine();
        
        if (estudiantes.containsKey(carnet)) {
            System.out.println("Alumno encontrado: " + estudiantes.get(carnet));
        } else {
            System.out.println("Alumno no encontrado, no se puede mostrar.");
        }
    }
    
    private static void eliminarAlumno(Scanner scanner) {
        System.out.print("Ingrese el carnet del alumno a eliminar: ");
        String carnet = scanner.nextLine();
        
        if (estudiantes.remove(carnet) != null) {
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado, no se puede eliminar.");
        }
    }
    
    private static void mostrarTodosLosAlumnos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
        } else {
            System.out.println("Listado de todos los alumnos:");
            for (Map.Entry<String, String> entry : estudiantes.entrySet()) {
                System.out.println("Carnet: " + entry.getKey() + ", Nombre: " + entry.getValue());
            }
        }
    }
}
