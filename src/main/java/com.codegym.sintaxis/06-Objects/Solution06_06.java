import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution06_06 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int even =0;
        int odd =0;
        for(int i=0; i<num.length();i++){
            if(Integer.parseInt(String.valueOf(num.charAt(i))) % 2 ==0){
                even++;
            }
            else{
                odd++;
                }
            }
        System.out.println("Even: " +even+ " Odd: " + odd);
        }

    }
