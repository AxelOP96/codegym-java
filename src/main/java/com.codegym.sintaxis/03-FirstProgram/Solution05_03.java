public class Solution05_03{

    public static class Cat{
        private String nombre;
        public Cat(String nombre){
            this.nombre = nombre;
        }
    }
    public static void main(String[] args){
        Cat cat = new Cat("Kitty");
        System.out.println("The cat is " + cat.toString());
    }

}

