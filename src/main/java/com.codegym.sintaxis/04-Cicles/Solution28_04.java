import java.util.Scanner;

public class Solution28_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int countPos =0;
        int countNeg = 0;
        if( a > 0)
            countPos++;
        else if(b > 0)
            countPos++;
        else if(c > 0)
            countPos++;
        if( a < 0)
            countNeg++;
        else if(b < 0)
            countNeg++;
        else if(c < 0)
            countNeg++;
        System.out.println("Number of negative numbers: " + countNeg);
        System.out.println("Number of positive numbers: " + countPos);

    }
}
