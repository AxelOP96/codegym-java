import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution18_08 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> nuevaLista = new HashMap<>();
        nuevaLista.put("Leguero", "Michel");
        nuevaLista.put("Leguer", "Axel");
        nuevaLista.put("Legue", "Dana");
        nuevaLista.put("Legu", "Lisa");
        nuevaLista.put("Leg", "Tomy");
        nuevaLista.put("Le", "Lenny");
        nuevaLista.put("Lennard", "Lenny");
        nuevaLista.put("Simpson", "Lisa");
        nuevaLista.put("Pfeiffer", "Michel");
        nuevaLista.put("Tito", "Vilma");
        return nuevaLista;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        Map<String, Integer> valueCount = new HashMap<>();

        // Contar la ocurrencia de cada valor en el mapa original
        for (String value : map.values()) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        // Iterar sobre las entradas del mapa para eliminar duplicados
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            // Si el valor aparece más de una vez, llamamos al segundo método para eliminar
            if (valueCount.get(value) > 1) {
                removeItemFromMapByValue(map, value);
                valueCount.put(value, 0); // Aseguramos que no volvamos a eliminar el mismo valor
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(value)) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> lista = createMap();
        removeFirstNameDuplicates(lista);
        for (Map.Entry<String, String> entry : lista.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
