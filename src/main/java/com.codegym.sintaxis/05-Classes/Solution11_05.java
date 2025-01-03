public class Solution11_05{
public class Cat {
    String Name;
    int age;
    int weight;
    String address;
    String color;
    public Cat(String name){
        this.Name = name;
    }
    public Cat(String name, int weight, int age){
        this.Name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int age){
        this.Name = name;
        this.age = age;
    }
    public Cat(int weight, String color){

        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
}
