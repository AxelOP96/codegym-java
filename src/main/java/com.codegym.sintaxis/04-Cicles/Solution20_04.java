import java.util.Scanner;

public class Solution20_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a= teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        if(b == c){
            System.out.println(1);
        }
        else if(a == c){
            System.out.println(2);
        }
        else if(b == a){
            System.out.println(3);
        }
    }
}
