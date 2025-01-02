import java.util.Scanner;

public class Solution30_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if(num < 0 && num % 2 ==0){
            System.out.println("Negative even number");
        }
        else if(num < 0 && num % 2 ==1){
            System.out.println("Negative odd number");
        }
        else if(num > 0 && num % 2 ==0){
            System.out.println("Positive even number");
        }
        else if(num > 0 && num % 2 ==1){
            System.out.println("Positive odd number");
        }
        else{
            System.out.println("Zero");
        }

    }
}
