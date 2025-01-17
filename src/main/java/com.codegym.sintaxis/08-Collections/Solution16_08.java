import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution16_08 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> lista = new HashMap<>();
        return lista;

    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        HashMap<String, String> nuevaLista = createMap();
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
        System.out.println(getSameFirstNameCount(nuevaLista, "Lenny"));
        System.out.println(getSameLastNameCount(nuevaLista, "Leguero"));
        System.out.println(nuevaLista.size());
    }
}
