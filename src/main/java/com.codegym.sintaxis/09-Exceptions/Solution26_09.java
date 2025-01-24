public class Solution26_09 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution26_09 room = new Solution26_09();
        room.A = 5;

        Solution26_09.D = 5;
        //System.out.println(Solution26_09.D);
    }

    public int getA() {
        return A;
    }
}
