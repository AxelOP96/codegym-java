public class Solution15_10 {
    /*
Human class constructors

*/
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String name;
        private int age;
        private double weight;
        private String address;
        private boolean isAlive;
        private char sex;
        public Human(){}
        public Human(String name, int age, double weight, String address, boolean isAlive, char sex){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.isAlive = isAlive;
            this.sex = sex;
        }
        public Human(String name, int age, double weight, String address, boolean isAlive){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.isAlive = isAlive;

        }
        public Human(String name, int age, double weight, String address){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.address = address;
        }
        public Human(String name, int age, double weight){
            this.name = name;
            this.age = age;
            this.weight = weight;

        }
        public Human(String name, int age){
            this.name = name;
            this.age = age;

        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, String address, boolean isAlive, char sex){
            this.name = name;
            this.address = address;
            this.isAlive = isAlive;
            this.sex = sex;
        }
        public Human(String name, int age, boolean isAlive, char sex){
            this.name = name;
            this.age = age;
            this.isAlive = isAlive;
            this.sex = sex;
        }
        public Human(String name, int age, double weight, String address, char sex){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.sex = sex;
        }

    }
}
