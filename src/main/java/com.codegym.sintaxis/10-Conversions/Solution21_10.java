import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution21_10 {
    /*
Functionality is not enough!

*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> lista = new HashMap<>();
        Integer id = Integer.parseInt(reader.readLine());
        String name = reader.readLine();
        while(!name.equals("") || !id.equals("")){
            lista.put(name, id);
            try {
                id = Integer.parseInt(reader.readLine());
                name = reader.readLine();
            } catch (NumberFormatException e) {
                break;
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator = lista.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println(pair.getValue() + " " + pair.getKey());
        }

    }
}
