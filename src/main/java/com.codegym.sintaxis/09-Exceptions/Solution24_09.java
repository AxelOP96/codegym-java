import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution24_09 {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        String vowel = "";
        String consonant = "";
        for (int i=0; i< word.length();i++){
            if(isVowel(word.charAt(i))){
                vowel += word.charAt(i) + " ";
            }
            else{
                if(word.charAt(i) == ' '){}
                else{
                    consonant += word.charAt(i) + " ";
                }

            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
