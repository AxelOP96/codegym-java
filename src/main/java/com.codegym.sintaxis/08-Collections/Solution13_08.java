import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution13_08 {
    public static void main(String[] args) throws IOException {
        //write your code here
        int streak = 1;
        int saved = 1;
        ArrayList<Integer> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            lista.add(Integer.parseInt(reader.readLine()));

        }
        Iterator<Integer> listaIterada = lista.iterator();
        int prev = listaIterada.next();
        while(listaIterada.hasNext()){
            int current = listaIterada.next();
            if (current == prev) {
                streak++;
            }
            else{
                if(streak > saved){
                    saved = streak;

                }
                streak = 1;

            }prev = current;
        }
        if (streak > saved) {
            saved = streak;
        }
        System.out.println(saved);
    }

}
