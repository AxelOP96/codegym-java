public class Solution13_09 {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getClass());
        }

    }
}
