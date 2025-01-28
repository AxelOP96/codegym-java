import java.util.ArrayList;

public class Solution17_10 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] listaFinal = new ArrayList[2];
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("Axel");
        list.add("Daniel");
        list.add("Alejandro");
        list.add("Michel");
        list.add("Benjamin");

        list2.add("Tomy");
        list2.add("Ezequiel");
        list2.add("Lenny");
        list2.add("Santino");
        listaFinal[0] =(list);
        listaFinal[1] = (list2);
        return listaFinal;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
