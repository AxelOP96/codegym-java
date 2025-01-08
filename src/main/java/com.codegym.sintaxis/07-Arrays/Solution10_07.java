import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution10_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String shortest = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0;i<5;i++){
            lista.add(reader.readLine());
        }
        shortest = lista.get(0);
        for(String palabra : lista){
            if(palabra.length() < shortest.length()){
                shortest = palabra;
            }
        }
        ArrayList<String> cortas = new ArrayList<>();
        for(String corta :  lista){
            if(corta.length() == shortest.length()){
                cortas.add(corta);
                System.out.println(corta);
            }

        }
        if(cortas.size() == 1){
            System.out.println(shortest);
        }

    }
}
