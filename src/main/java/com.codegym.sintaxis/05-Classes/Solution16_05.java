public class Solution16_05 {
    public static void main(String[] args) {
        //write your code here
        Man seun = new Man("Seun");
        Woman brittany = new Woman("Brittany");
        Man yeungseok = new Man("Yeungseok", 20);
        Woman kimMiso = new Woman("Kim min so", 22);
        System.out.println(seun.toString());
        System.out.println(brittany.toString());
        System.out.println(yeungseok.toString());
        System.out.println(kimMiso.toString());
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public String toString(){
            return name + " " + age + " " + address;
        }
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Man(){
            this.name = "";
            this.age = 0;
            this.address = "";
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "";
        }
        public Man(String name){
            this.name = name;
            this.age = 0;
            this.address = "";
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;
        public String toString(){
            return name + " " + age + " " + address;
        }
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public Woman(){
            this.name = "";
            this.age = 0;
            this.address = "";
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "";
        }
        public Woman(String name){
            this.name = name;
            this.age = 0;
            this.address = "";
        }
    }
}
