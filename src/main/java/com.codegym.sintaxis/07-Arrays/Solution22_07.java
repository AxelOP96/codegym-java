import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//Shuffled just in time
public class Solution22_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(reader.readLine());
        Integer M = Integer.parseInt(reader.readLine());
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0; i<N; i++){
            lista.add(reader.readLine());
        }
        //Reel de face https://www.facebook.com/reel/632577759430214
        int count =0;
        for(int i=0; i<M;i++){
            if(count == M){
                break;
            }
            else{
                String word = lista.remove(lista.size()-1);
                lista.add(0, word);
                count++;
                i--;
            }
        }
        for(String show : lista){
            System.out.println(show);
        }
    }
}
