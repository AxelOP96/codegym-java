import java.util.ArrayList;

public class Solution16_06 {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        Cat.printCats();
    }
    public static class Cat {
        //write your code here
        public static ArrayList<Cat> cats= new ArrayList<>();
        public Cat() {
            Cat.cats.add(this);
        }



        public static void printCats() {
            for(Cat cato : cats){
                System.out.println(cato.toString());
            }
        }

    }

}
