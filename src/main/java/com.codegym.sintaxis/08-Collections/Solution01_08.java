import java.util.HashSet;
import java.util.Iterator;

public class Solution01_08 {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();
        set.add("watermelon");
        set.add("banana");
        set.add("cherry");
        set.add("pear");
        set.add("cantaloupe");
        set.add("blackberry");
        set.add("ginseng");
        set.add("strawberry");
        set.add("iris");
        set.add("potato");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

    }
}
