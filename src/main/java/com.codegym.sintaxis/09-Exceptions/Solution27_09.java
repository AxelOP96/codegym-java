import java.util.ArrayList;

public class Solution27_09 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        /*Add to the list five array objects whose lengths are 5, 2, 4, 7, and 0, respectively.
Fill the arrays with any data and display them on the screen*/
        ArrayList<int[]> lista = new ArrayList<>();
        int[] five = new int[]{1, 2, 3, 4, 5};
        lista.add(five);
        int[] two = new int[]{2, 22};
        lista.add(two);
        int[] four = new int[]{4, 8, 12, 16};
        lista.add(four);
        int[] seven = new int[]{7, 14, 21, 28, 35, 42, 49};
        lista.add(seven);
        int[] zero = new int[0];
        lista.add(zero);
        return lista;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
