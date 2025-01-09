public class Solution26_07 {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Mr satan", true, 60);
        Human grandfather2 = new Human("Goku", true, 60);
        Human grandmother1 = new Human("bulma", false, 65);
        Human grandmother2 = new Human("Milk", false, 58);
        Human father1 = new Human("Gohan", true, 40, grandfather2, grandmother2);
        Human mother1 = new Human("Videl", false, 40, grandfather1, grandmother1);
        Human children1 = new Human("Trunks", true, 22, grandfather1, grandmother1);
        Human children2 = new Human("Goten", true, 22, grandfather2, grandmother2);
        Human children3 = new Human("Pan", false, 10, father1, mother1);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }
            return text;
        }
    }
}
