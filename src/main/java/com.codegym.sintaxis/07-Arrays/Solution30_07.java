import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution30_07 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(Integer.parseInt(reader.readLine())) ;
        }
        Collections.reverse(lista);

        for (int x : lista) {
            System.out.println(x);
        }
    }
}
