public class Solution11 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        if(a == b && a == c){
            System.out.println(a + " " + b + " " + c);
        }
        else if(a == b){
            System.out.println(a + " " + b);
        }
        else if(a == c){
            System.out.println(a + " " + c);
        }
        else if(b == c){
            System.out.println(b + " " + c);
        }
    }
}

