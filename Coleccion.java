
package practicas;

import java.util.Collection;
import java.util.ArrayList;

public class Coleccion {
    public static void main(String[] args) {
        // Aqui declaramos la coleccion
        Collection<Object> coleccion = new ArrayList<>();
        
        // Asignamos valores a la coleccion
        coleccion.add("Guillermo");
        coleccion.add("Alex");
        coleccion.add("Jefferson");
        coleccion.add("Monica");
        coleccion.add("Rossman");
        coleccion.add(true);
        coleccion.add(12);
        
        // Imprimimos la coleccion
        System.out.println("Coleccion: " + coleccion + "\n");
        
        for (Object obj : coleccion) {
            System.out.println(obj);
        }
        
        System.out.println("\n");
        
        // Eliminamos un valor de la coleccion
        coleccion.remove("Guillermo");
        coleccion.remove(true);
        
        // Imprimimos nuevamente la coleccion pero habiendo eliminado un valor
        System.out.println("Coleccion con un valor menos: " + coleccion);

    }
}
