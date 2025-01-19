import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

public class Solution31_08 {
    //Task about algorithms
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String aux = "";
        for(int i=0; i<array.length-1; i++){
            for (int j = 0; j < array.length - 1; j++) {
                if(isGreaterThan(array[j], array[j+1])) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j+ 1] = aux;
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
