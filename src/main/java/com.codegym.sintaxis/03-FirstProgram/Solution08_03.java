public class Solution08_03 {
    public static void main(String[] args) {
        Zerg one = new Zerg();
        one.name = "one";
        Zerg two = new Zerg();
        two.name = "two";
        Zerg three = new Zerg();
        three.name = "three";
        Zerg four = new Zerg();
        four.name = "four";
        Zerg five = new Zerg();
        five.name = "five";

        Protoss uno = new Protoss();
        uno.name = "uno";
        Protoss dos = new Protoss();
        dos.name = "dos";
        Protoss tres = new Protoss();
        tres.name = "tres";
        Protoss cuatro = new Protoss();
        cuatro.name = "cuatro";
        Protoss cinco = new Protoss();
        cinco.name = "cinco";

        Terran unoo = new Terran();
        unoo.name = "unoo";
        Terran due = new Terran();
        due.name = "due";
        Terran tre = new Terran();
        tre.name = "tre";
        Terran quatro = new Terran();
        quatro.name = "quatro";
        Terran cinque = new Terran();
        cinque.name = "cinque";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
