import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Solution23_08 {
    //Minimum of N numbers
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Integer minimum = Collections.min(array);
        return minimum;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        List<Integer> lista = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer length = Integer.parseInt(reader.readLine());
        for(int i = 0; i< length; i++){
            Integer num = Integer.parseInt(reader.readLine());
            lista.add(num);
        }
        return lista;
    }
}
