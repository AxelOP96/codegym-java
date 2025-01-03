public class Solution05_05 {
    public static void main(String[] args) {
        Cat one = new Cat("Michel", 31, 40, 20);
        Cat two = new Cat("Axel", 28, 67, 30);
        Cat three = new Cat("Dana", 27, 50, 28);
        System.out.println("Cat one wins vs two?" + one.fight(two));
        System.out.println("Cat one wins vs three?" + one.fight(three));
        System.out.println("Cat three wins vs two?" + three.fight(two));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
