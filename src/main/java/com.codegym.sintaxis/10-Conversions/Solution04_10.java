public class Solution04_10 {
    public static void main(String[] args) {
        float f = (byte) 128.50;
        int i = (int) f;

        int b = (byte) (i + f);
        System.out.println(b);
    }
}
