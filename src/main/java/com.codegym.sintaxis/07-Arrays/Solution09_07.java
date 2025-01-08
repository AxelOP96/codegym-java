import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution09_07 {
    public static void main(String[] args) throws Exception{
        String longest = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0;i<5;i++){
            lista.add(reader.readLine());
        }
        longest = lista.get(0);
        for(String palabra : lista){
            if(palabra.length() > longest.length()){
                longest = palabra;
            }
        }
        System.out.println(longest);
    }
}
