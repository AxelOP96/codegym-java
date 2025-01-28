import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution18_10 {
    /*
Identical words in a list

*/
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for(int i = 0; i< list.size(); i++){
            result.put(list.get(i), count(list, list.get(i)));
        }
        return result;
    }
    public static Integer count(ArrayList<String> lista, String word){
        Integer count = 0;
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(word)){
                count++;
            }
        }
        return count;
    }
}
