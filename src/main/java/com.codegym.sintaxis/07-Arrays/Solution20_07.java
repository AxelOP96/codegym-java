import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution20_07 {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10;i++){
            lista.add(reader.readLine());
        }
        boolean isOrdered = true;
        int count = lista.get(0).length();
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).length() < count){
                isOrdered = false;
                System.out.println(lista.indexOf(lista.get(i)));
                break;
            }
            else{
                count = lista.get(i).length();
            }
        }
    }
}
