import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution24_08 {
    //Going national
    public static String capitalize(String sentence){
        StringBuilder result = new StringBuilder();
        for(int i=0; i< sentence.length();i++){
            if(i == 0){
                result.append(Character.toString(sentence.charAt(i)).toUpperCase());
            }
            else if(sentence.charAt(i-1) == (' ')){
                result.append(Character.toString(sentence.charAt(i)).toUpperCase());
            }
            else{
                result.append((sentence.charAt(i)));
            }
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here
        System.out.println(capitalize(s));
    }
}
