import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution21_05 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    public static int min(int a, int b, int c, int d, int e){
        int min = a;
        if(a <= b && a <= c && a <= d && a <= e){
            min = a;
        }
        else if(c <= b && c <= a && c <= d && c <= e){
            min = c;
        }
        else if(d <= b && d <= c && d <= a && d <= e){
            min = d;
        }
        else if(e <= b && e <= c && e <= d && e <= a){
            min = e;
        }
        else{
            min = b;
        }
        return min;
    }
}
