public class Solution23 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d = teclado.nextInt();
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
