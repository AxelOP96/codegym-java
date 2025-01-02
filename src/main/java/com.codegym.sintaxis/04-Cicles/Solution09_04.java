import java.util.Scanner;

public class Solution09_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int  b = teclado.nextInt();
        int c = teclado.nextInt();
        if(a < (b + c) && b < (a + c)&& c < (b + a)){
            System.out.println("The triangle is possible.");
        }
        else{
            System.out.println("The triangle is not possible.");
        }
    }
}
