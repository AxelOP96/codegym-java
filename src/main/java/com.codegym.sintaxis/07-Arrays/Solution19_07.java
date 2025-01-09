import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution19_07 {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Display result
        for(String show : list){
            System.out.println(show);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int i=0;
        while(i<list.size()){
            list.add(i+1,list.get(i));
            i+=2;
        }
        return list;
    }
}
