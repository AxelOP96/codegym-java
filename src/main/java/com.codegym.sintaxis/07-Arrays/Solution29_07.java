import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution29_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        String s = reader.readLine();
        while (!s.isEmpty()) {
            list.add(s);
            s = reader.readLine();
        }
        ArrayList<String> newList = new ArrayList<String>();

        for (String word : list) {
            if (word.length() % 2 == 0) {
                newList.add(word + " " + word);
            } else {
                newList.add(word + " " + word + " " + word);
            }
        }
        for (String word : newList) {
            System.out.println(word);
        }
    }
}
