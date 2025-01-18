import java.util.ArrayList;

public class Solution25_08 {
    //Make a family
    public static void main(String[] args) {
        //The program should create objects and fill them with data to get two grandfathers, two grandmothers, one father, one mother, and three children. Then it should display all the Human objects on the screen.
        Human children1 = new Human("Trunks", true, 20);
        Human children2 = new Human("Goten", true, 19);
        Human children3 = new Human("Pan", false, 10);
        Human father = new Human("Gohan", true, 30);
        father.children.add(children3);
        father.children.add(children2);
        father.children.add(children1);
        Human mother = new Human("Videl", false, 30);
        mother.children.add(children3);
        mother.children.add(children2);
        mother.children.add(children1);
        Human grandfather1 = new Human("Goku",true, 60);
        grandfather1.children.add(father);

        Human grandfather2 = new Human("Vegeta", true, 62);
        grandfather2.children.add(mother);
        Human grandmother1 = new Human("Milk", false, 60);
        grandmother1.children.add(father);
        Human grandmother2 = new Human("Bulma", false, 65);
        grandmother2.children.add(mother);
        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }
        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
