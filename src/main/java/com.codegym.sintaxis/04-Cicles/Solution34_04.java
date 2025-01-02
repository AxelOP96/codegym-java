import java.util.Scanner;

public class Solution34_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String word = teclado.nextLine();
        int num = teclado.nextInt();

        int count =1;
        while(count <= num){
            System.out.println(word);
        }

    }
}
