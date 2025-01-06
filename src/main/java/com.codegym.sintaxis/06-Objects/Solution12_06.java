import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution12_06 {

    public static String readString() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String asked = reader.readLine();
        return  asked;
    }

    public static int readInt() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int asked = reader.read();
        return asked;
    }

    public static double readDouble() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double asked = Double.parseDouble(String.valueOf(reader.read()));
        return asked;
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean asked = Boolean.parseBoolean(String.valueOf(reader.read()));
        return asked;
    }

    public static void main(String[] args) {

    }
}
