public class Solution12_04 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if(a < 5)
            System.out.println("The number is less than 5");
        if(a > 5)
            System.out.println("The number is greater than 5");
        else{
            System.out.println("The number is equal to 5");
        }
    }
}