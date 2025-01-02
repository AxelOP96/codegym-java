public class Solution19_02 {
    public static int min(int a, int b, int c, int d) {
        int min;
        if (a < b && a < c && a < d)
            min = a;
        else if( b < a && b < c && b < d){
            min = b;
        }
        else if( c < a && c < b && c < d){
            min = c;
        }
        else
            min = d;
        return min;
    }

    public static int min(int a, int b) {
        int min;
        if (a < b)
            min = a;
        else {
            min = b;
        }
        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
