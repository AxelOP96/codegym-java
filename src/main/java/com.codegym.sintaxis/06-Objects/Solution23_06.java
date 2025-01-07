import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution23_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);*/
        Cat grandfather = new Cat("Grandfather Tiger");
        Cat grandmother = new Cat("Grandmother Puss");
        Cat father = new Cat("Father Oscar",false, grandfather);
        Cat mother = new Cat("Mother Missy", true, grandmother);
        Cat son = new Cat("Son Simba", mother, father);
        Cat daughter = new Cat("Daughter Coco", mother, father);
        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;
        private boolean motherlives;
        Cat(String name) {
            this.name = name;
        }

        Cat(String name, boolean motherLives, Cat parent) {
            this.name = name;
            this.motherlives = motherLives;
            if(motherLives){
                this.mother = parent;
            }
            else{
                this.father = parent;
            }
        }

        Cat(String name, Cat grandmother, Cat grandfather){
            this.name = name;
            this.mother = grandmother;
            this.father = grandfather;

        }
        @Override
        public String toString() {
            if (father == null && mother == null) {
                return "The cat's name is " + name + ", no mother , no father";
            }
            else if(motherlives){
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            }
            else if(!motherlives){
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            }
            else{
                return "The cat's name is " + name + ", " + mother.name + " is the mother " + father.name + " is the father";
            }
        }
    }
}
