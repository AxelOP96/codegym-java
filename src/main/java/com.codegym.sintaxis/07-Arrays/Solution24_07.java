import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution24_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String word = reader.readLine();
        for(;;){
        //while(!word.equals("end")){
            if(word.equals("end")){
                break;
            }
            else{
                list.add(word);

                System.out.println(word);
                word = reader.readLine();
            }

        }
    }
}
