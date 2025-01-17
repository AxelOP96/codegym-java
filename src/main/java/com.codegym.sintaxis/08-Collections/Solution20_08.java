import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution20_08 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        for(Cat cato : cats){
            if(cato.name.equals("Perry")){
                cats.remove(cato);
            }
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Cat cat1 = new Cat("Phineas");
        Cat cat2 = new Cat("Perry");
        Cat cat3 = new Cat("Ferb");
        Set<Cat> lista = new HashSet<>();
        lista.add(cat1);
        lista.add(cat2);
        lista.add(cat3);
        return lista;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        Iterator<Cat> iterator = cats.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // step 1
    public static class Cat{
        private String name;
        public Cat(){}
        public Cat(String name){
            this.name = name;
        }
    }
}
