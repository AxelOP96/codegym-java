import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution04_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for(int i =0; i<10;i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        for(int i = array.length -1; i>=0;i--){
            System.out.println(array[i]);

        }
    }
}
