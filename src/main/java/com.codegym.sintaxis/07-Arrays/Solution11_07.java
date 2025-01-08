import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution11_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            lista.add(0, reader.readLine());
        }
        for(String show : lista){
            System.out.println(show);
        }
    }
}
