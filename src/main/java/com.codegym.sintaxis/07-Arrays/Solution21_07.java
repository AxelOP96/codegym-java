import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution21_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i<10;i++){
            lista.add(Integer.parseInt(reader.readLine()));
        }
        Collections.reverse(lista);
        for(Integer show : lista){
            System.out.println(show);
        }
    }
}
