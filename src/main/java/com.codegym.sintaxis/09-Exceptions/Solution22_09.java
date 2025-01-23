import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution22_09 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList lista = new ArrayList();
        while(true){

            try{
                int num = Integer.parseInt(reader.readLine());
                lista.add(num);
            }
            catch (IOException | NumberFormatException e){
                for(Object num : lista){
                    System.out.println(num);
                }
                break;
            }
        }
    }
}
