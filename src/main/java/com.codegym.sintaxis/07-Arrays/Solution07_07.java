import java.util.ArrayList;
import java.util.Scanner;

public class Solution07_07 {
    public static void main(String[] args){


    ArrayList<String> list = new ArrayList<>();
    Scanner teclado = new Scanner(System.in);
    String s = teclado.nextLine();
    list.add(s);
    list.add(15, s);
    list.add(0, s);
    list.remove(3);
    }
}
