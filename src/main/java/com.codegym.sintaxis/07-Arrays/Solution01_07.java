import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution01_07 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for(int i=0;i<20;i++){
            array[i] = Integer.parseInt((reader.readLine())) ;
        }
        return array;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = array[0];
        for(int i=0;i<20;i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;
    }
}
