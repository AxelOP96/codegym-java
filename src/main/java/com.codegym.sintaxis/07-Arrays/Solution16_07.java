import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution16_07 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i< 5;i++){
            lista.add(reader.readLine());
        }
        lista.remove(2);
        for(int i=lista.size()-1;i>=0;i--){
            System.out.println(lista.get(i));
        }
    }

}
