import java.util.Map;
import java.util.HashMap;

public class Mapa {
    public static void main(String[] args) {
        // Declaramos un Map haciendo de un HashMap para ser implementado despues
        Map<String, Integer> mapa = new HashMap<>();
        
        // Asignamos valores al mapa
        mapa.put("Guillermo", 18);
        mapa.put("Alex", 24);
        mapa.put("Jefferson", 19);
        mapa.put("Rossman", 20);

        // Imprimimos el mapa
        System.out.println("Mapa: " + mapa);
        
        // Eliminamos un valor del mapa basado en la clave
        mapa.remove("Guillermo");
        
        // Imprimimos nuevamente el mapa habiendo eliminado el primer elemento basado en la clave
        System.out.println("Mapa modificado: " + mapa);
    }
}
