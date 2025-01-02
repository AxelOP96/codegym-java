import java.util.Scanner;

public class Solution21_03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String name = teclado.nextLine();
        int number = teclado.nextInt();
        System.out.println(name + " will take over the world in " + number + " years. Mwa-ha-ha!" );
    }
}
