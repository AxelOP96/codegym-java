import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution05_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] bigarray = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<20;i++){
            bigarray[i] = Integer.parseInt(reader.readLine());
            if(i >= 10){
                small2[i-10] = bigarray[i];
            }
        }
        for(int i =0;i<10;i++){
            System.out.println(small2[i]);
        }
    }
}
