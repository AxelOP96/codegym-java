import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution23_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum=0;
        int minimum=0;
        int[] array = new int[20];
        for(int i=0; i< array.length;i++){
            array[i] = Integer.parseInt(reader.readLine());
            if(i==0){
                maximum = array[0];
                minimum = array[0];
            }
            else{
                if(array[i]< minimum)
                    minimum = array[i];
                if(array[i]> maximum){
                    maximum = array[i];
                }
            }
        }


        System.out.print(maximum + " " + minimum);
    }
}
