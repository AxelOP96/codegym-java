import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution05_08 {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterador = map.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry<String, String> pair = iterador.next();
            String value = pair.getValue();
            System.out.println("Value: " + value);
        }

    }
}
