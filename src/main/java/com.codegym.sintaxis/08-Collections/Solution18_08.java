import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution18_08 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> nuevaLista = new HashMap<>();
        nuevaLista.put("Leguero", "Michel");
        nuevaLista.put("Leguero", "Axel");
        nuevaLista.put("Leguero", "Dana");
        nuevaLista.put("Leguero", "Lisa");
        nuevaLista.put("Leguero", "Tomy");
        nuevaLista.put("Leguero", "Lenny");
        nuevaLista.put("Lennard", "Lenny");
        nuevaLista.put("Simpson", "Lisa");
        nuevaLista.put("Pfeiffer", "Michel");
        nuevaLista.put("Tito", "Vilma");
        return nuevaLista;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            removeItemFromMapByValue(map, value);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> lista = createMap();
        Iterator<Map.Entry<String, String>> iterator = lista.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
