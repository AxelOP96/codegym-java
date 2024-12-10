public class Solution04 {
    public static void main(String[] args) {
        Cat one = new Cat("Michel", 31, 40, 20);
        Cat two = new Cat("Axel", 28, 67, 30);
        Cat three = new Cat("Dana", 27, 50, 28);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
