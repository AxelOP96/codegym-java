import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Solution02_08 {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("watermelon","melon");
        map.put("banana","fruit");
        map.put("cherry","fruit");
        map.put("pear","fruit");
        map.put("cantaloupe","melon");
        map.put("blackberry","fruit");
        map.put("ginseng","root");
        map.put("strawberry","fruit");
        map.put("iris","flower");
        map.put("potato","tuber");
        Iterator<Map.Entry<String, String>> iterador = map.entrySet().iterator();
        while(iterador.hasNext()){
            Map.Entry<String, String> pair = iterador.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
