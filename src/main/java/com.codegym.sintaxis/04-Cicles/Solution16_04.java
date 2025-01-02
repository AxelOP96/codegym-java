import java.util.Scanner;

public class Solution16_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int number= teclado.nextInt();
        if(number > 0){
            System.out.println(number*2);
        }
        else  if(number < 0){
            System.out.println(number+1);
        }
        else{
            System.out.println(0);
        }
    }

}
