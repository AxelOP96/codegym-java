import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution13_07 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<>();
        String shortest="";
        String longest ="";
        Integer indexShort=0;
        Integer indexLong =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            lista.add(reader.readLine());
        }
        shortest = lista.get(0);
        longest = lista.get(0);
        for(String word : lista){
            if(word.length() < shortest.length()){
                shortest = word;
                indexShort = lista.indexOf(word);
            }
            if(word.length() > longest.length()){
                longest = word;
                indexLong = lista.indexOf(word);
            }
        }
        System.out.println((indexShort < indexLong ) ? shortest : longest);
    }
}
