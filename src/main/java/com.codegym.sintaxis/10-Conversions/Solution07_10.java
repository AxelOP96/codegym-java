public class Solution07_10 {
    /*
Task No. 6 about integer type conversions

*/
    public static void main(String[] args) {
        //result: 1000.0
        double d = (short) 2.50256e2d;

        char c =  'd';

        short s = (short) 2.22;

        int i =  150000;

        float f = 0.50f;

        double result = f + (i / c) - (d * s) - 500e-3;

        System.out.println("result: " + result);
    }
}
