public class Solution08_10 {
    public static void main(String[] args) {
        //answer: 1234567
        long l = (int) 1234_564_890L;
        int x = (char) 0b1000_1100_1010;
        double m = (char) 110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (short) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}
