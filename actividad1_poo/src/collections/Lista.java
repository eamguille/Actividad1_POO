
import java.util.List;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        // Declaramos una lista haciendo uso de ArrayList para ser implementada despues
        List<String> list = new ArrayList<>();

        // Asignamos valores a la lista
        list.add("Guillermo");
        list.add("Alex");
        list.add("Jefferson");
        list.add("Rossman");

        // Imprimimos la lista
        System.out.println("Lista: " + list);

        // Eliminamos un valor de la lista
        list.remove("Guillermo");

        // Eliminamos un valor por posicion
        list.remove(0);

        // Imprimimos la lista luego de eliminar valores
        System.out.println("Lista con valores eliminados: " + list);
    }
}