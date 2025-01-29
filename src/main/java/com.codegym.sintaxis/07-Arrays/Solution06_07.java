import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution06_07 {
    //Streets and houses
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] array = new int[15];
        int even =0;
        int odd =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<array.length;i++){
            array[i] = Integer.parseInt(reader.readLine());
            if(i %2==0){
                even+=array[i];
            }else{
                odd+=array[i];
            }
        }
        if(even < odd){
            System.out.println("Odd-numbered houses have more residents.");
        }
        else if(even == odd){

        }else{
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
