import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution02_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<8;i++){
            array[i] = reader.readLine();
        }
        array[8] = "Hello";
        array[9] = "world";
        for(int i= array.length - 1; i>=0;i--){
            System.out.println(array[i] );
        }
    }
}
