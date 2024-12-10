public class Solution18 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner();
        int age = teclado.nextInt();
        String name = teclado.nextLine();
        if(age<18)
            System.out.println("Grow up a little more");
    }
}
