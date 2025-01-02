import java.util.Scanner;

public class Solution22_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        if(a < b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
