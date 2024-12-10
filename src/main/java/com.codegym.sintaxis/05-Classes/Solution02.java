public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if(Cat.strength > anotherCat.strength)
            return true;
        else{
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
