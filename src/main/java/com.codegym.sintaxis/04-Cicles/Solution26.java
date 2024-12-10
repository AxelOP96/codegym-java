public class Solution26 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if(num > 0 && num <= 999){
            if(num % 2 == 0 && num < 10){
                System.out.println("even single-digit number");
            }
            else if(num % 2 == 1 && num < 10){
                System.out.println("odd single-digit number");
            }
            else if(num % 2 == 1 && num < 100){
                System.out.println("odd two-digit number");
            }
            else if(num % 2 == 0 && num < 100){
                System.out.println("even two-digit number");
            }
            else if(num % 2 == 1 && num < 1000){
                System.out.println("odd three-digit number");
            }
            else if(num % 2 == 0 && num < 1000){
                System.out.println("even three-digit number");
            }
        }


    }
}
