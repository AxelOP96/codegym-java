import java.util.HashMap;
import java.util.Map;

public class Solution22_08 {
    //Shared last names and first names
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> lista = new HashMap<String, String>();
        lista.put("Ketchum", "Ash");
        lista.put("Ketchum", "unknown");
        lista.put("Oak", "Gary");
        lista.put("Stu", "Gary");
        lista.put("Snail", "Gary");
        lista.put("Salchichon", "John");
        lista.put("Doe", "John");
        lista.put("O'Connor", "John");
        lista.put("Parker", "Peter");
        lista.put("Watson", "Mary Jane");

        return lista;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
