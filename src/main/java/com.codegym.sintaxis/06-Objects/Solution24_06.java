import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution24_06 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> lista= new ArrayList<>();
        for(int i=0;i<5;i++){
            int num = Integer.parseInt(reader.readLine());
            lista.add(num);
            System.out.println(num);
        }
        //Ordenar
        Collections.sort(lista);
        for(Integer num : lista){
            System.out.println(num);
        }
    }
}
