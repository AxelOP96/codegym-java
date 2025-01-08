import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution06_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] array = new int[15];
        int even =0;
        int odd =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<array.length;i++){
            array[i] = Integer.parseInt(reader.readLine());
            if(array[i] %2==0){
                even++;
            }else{
                odd++;
            }
        }
        if(even < odd){
            System.out.println("Odd-numbered houses have more residents.");
        }else{
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
