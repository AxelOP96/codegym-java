import java.util.Scanner;

public class Solution21_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        if(a > 0 && b > 0)
            System.out.println(1);
        else if(a < 0 && b > 0)
            System.out.println(2);
        else if(a < 0 && b < 0)
            System.out.println(3);
        else{
            System.out.println(4);
        }
    }
}
