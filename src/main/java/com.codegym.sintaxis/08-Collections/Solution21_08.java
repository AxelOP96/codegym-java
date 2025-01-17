import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution21_08 {
    //Animal set
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println("Aca termina el primer print");
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> result = new HashSet<Dog>();

        //write your code here
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        result.add(dog1);
        result.add(dog2);
        result.add(dog3);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> combi = new HashSet<>();
        combi.addAll(cats);
        combi.addAll(dogs);
        return combi;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Iterator<Object> iterator = pets.iterator();
        while(iterator.hasNext()){
            if(iterator.next() instanceof Cat){
                iterator.remove();
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        Iterator<Object> iterator = pets.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    //write your code here
    public static class Cat{
        public Cat(){}
    }
    public static class Dog{
        public Dog(){}
    }
}
