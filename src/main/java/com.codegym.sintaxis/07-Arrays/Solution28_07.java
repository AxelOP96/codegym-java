import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution28_07 {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();

            if (name.isEmpty()) {
                break;
            }
            Integer age = Integer.parseInt(reader.readLine());
            Integer weight = Integer.parseInt(reader.readLine());
            Integer tail = Integer.parseInt(reader.readLine());
            Cat cat = new Cat(name, age, weight, tail);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (Cat cat : CATS) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
