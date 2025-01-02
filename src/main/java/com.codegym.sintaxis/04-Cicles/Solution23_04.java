import java.util.Scanner;

public class Solution23_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a= teclado.nextInt();int b = teclado.nextInt();int c= teclado.nextInt();int d = teclado.nextInt();
        int max;
        if(a > b && a > c && a > d){
            max = a;
        }
        else if(b > a && b > c && b > d){
            max = b;
        }
        else if(c > a && c> b && c > d){
            max = c;
        }
        else{
            max = d;
        }
        System.out.println(max);
    }
}
