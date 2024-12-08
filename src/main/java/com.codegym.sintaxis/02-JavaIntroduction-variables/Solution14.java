public class Solution14 {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Cat catito = new Cat();
        catito.owner = woman;
        Dog dogito = new Dog();
        dogito.owner = woman;
        Fish fishito = new Fish();
        fishito.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
