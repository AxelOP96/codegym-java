public class Solution16_10 {
    /*
Use the fewest number of static modifiers

*/
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution16_10 solution = new Solution16_10();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution16_10.D = 5 * D * C;

        Solution16_10.D = 5;
    }

    public int getA() {
        return A;
    }
}
