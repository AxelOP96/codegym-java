import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution12_07 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            lista.add(reader.readLine());
        }
        for(int i =0;i<13;i++){
            String aux = lista.remove(lista.size()-1);
            lista.add(aux);
        }
        for(String show : lista){
            System.out.println(show);
        }
    }

}
