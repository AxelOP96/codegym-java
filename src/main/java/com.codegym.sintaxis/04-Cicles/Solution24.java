public class Solution24 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int a, b, c = teclado.nextInt();
        int minimum = min(a, b, c);
        int maximum = max(a, b, c);
        int med;
        if((minimum != a && maximum != b)|| minimum != b && maximum != a){
            med = c;
        }
        else if((minimum != b && maximum != c) || minimum != c && maximum != b){
            med = a;
        }
        else{
            med = b;
        }
        System.out.println(minimum + " " + med + " " + maximum);
    }
    public static int min(int a, int b, int c){
        if(a < b && a < c)
            return a;
        else if(b < a && b < c){
            return b;
        }else {
            return c;
        }
    }
    public static int max(int a, int b, int c){
        if(a > b && a > c)
            return a;
        else if(b > a && b > c){
            return b;
        }else {
            return c;
        }
    }
}
