import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution19_08 {
    //Only for the rich
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> lista = new HashMap<>();
        lista.put("item1", 200);
        lista.put("item2", 500);
        lista.put("item3", 800);
        lista.put("item4", 300);
        lista.put("item5", 600);
        lista.put("item6", 2000);
        lista.put("item7", 5200);
        lista.put("item8", 1800);
        lista.put("item9", 3000);
        lista.put("item10", 600);
        return  lista;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> lista = iterator.next();
            if(lista.getValue() < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> lista = createMap();
        removeItemFromMap(lista);
        Iterator<Map.Entry<String, Integer>> iterator = lista.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
