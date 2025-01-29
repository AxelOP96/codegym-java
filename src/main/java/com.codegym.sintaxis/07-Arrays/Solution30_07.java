import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution30_07 {
    //In decreasing order
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int aux = 0;
        for(int i = 0; i< array.length-1;i++){
            for(int j = 0; j< array.length -1; j++){
                if(array[j+1]> array[j]){
                    aux = array[j+1];
                    array[j+1] = array[j];
                    array[j]= aux;

                }
            }
        }
    }
}
