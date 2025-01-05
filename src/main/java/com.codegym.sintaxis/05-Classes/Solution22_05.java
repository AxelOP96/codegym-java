import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution22_05 {
    public static void main(String[] args) throws Exception {
        /*1. reads a number N (must be greater than 0) from the console
         2. reads N numbers from the console
         3. Displays the maximum of the N entered numbers.*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        int maximum = 0;

        //write your code here
        for(int i =0; i< length; i++){
            int pedido = Integer.parseInt(reader.readLine());
            if(i == 0){
                maximum = pedido;
            }
            else if(pedido > maximum)
                maximum = pedido;

        }
        System.out.println(maximum);
    }
}
