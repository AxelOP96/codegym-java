import java.util.Scanner;

public class Solution19_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int age = teclado.nextInt();
        String name = teclado.nextLine();
        if(age>20)
            System.out.println("18 is old enough");
    }
}
