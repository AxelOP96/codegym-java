import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution03_07 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] array1 = new String[10];
        int[] array2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            array1[i] = reader.readLine();
            array2[i] = array1[i].length();
        }
        for(int i=0;i<10;i++){
            System.out.println(array2[i]);

        }
    }
}
