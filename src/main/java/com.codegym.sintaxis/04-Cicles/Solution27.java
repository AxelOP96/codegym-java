public class Solution27 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int count =0;
        if( a > 0)
            count++;
        else if(b > 0)
            count++;
        else if(c > 0)
            count++;
        System.out.println(count);

    }
}
