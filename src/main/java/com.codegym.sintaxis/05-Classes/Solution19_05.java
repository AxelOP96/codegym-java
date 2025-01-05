import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution19_05 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int total =0;
        while(true){
            String s = buffer.readLine();

            if(s.equals("sum"))
                break;
            else{
                Integer parseado = Integer.valueOf(s);
                total += parseado;
            }
        }
        System.out.println(total);
    }

}
