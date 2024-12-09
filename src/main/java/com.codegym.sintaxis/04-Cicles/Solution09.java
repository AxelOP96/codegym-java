public class Solution09 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a, b, c = teclado.nextInt();
        if(a < (b + c) && b < (a + c)&& c < (b + a)){
            System.out.println("The triangle is possible.");
        }
        else{
            System.out.println("The triangle is not possible.");
        }
    }
}
