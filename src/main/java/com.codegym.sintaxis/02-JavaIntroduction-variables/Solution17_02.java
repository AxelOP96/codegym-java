public class Solution17_02 {
    public static int min(int a, int b) {
        int min;
        if (a < b)
            min = a;
        else{
            min = b;
        }

        return min;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
