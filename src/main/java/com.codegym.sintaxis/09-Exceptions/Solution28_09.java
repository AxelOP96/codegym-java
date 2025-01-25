import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution28_09 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> lista = new HashMap<String, Cat>();
        Cat cat1 = new Cat("cat1");
        lista.put("cat1", cat1);
        lista.put("cat2", new Cat("cat2"));
        lista.put("cat3", new Cat("cat3"));
        lista.put("cat4", new Cat("cat4"));
        lista.put("cat5", new Cat("cat5"));
        lista.put("cat6", new Cat("cat6"));
        lista.put("cat7", new Cat("cat7"));
        lista.put("cat8", new Cat("cat8"));
        lista.put("cat9", new Cat("cat9"));
        lista.put("cat10", new Cat("cat10"));

        return lista;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
