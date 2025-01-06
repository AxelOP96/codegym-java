public class Solution14_06 {
    public static int plus(int a, int b) {
        //write your code here
        return a +b;
    }

    public static int minus(int a, int b) {
        //write your code here
        return a-b;
    }

    public static int multiply(int a, int b) {
        //write your code here
        return a*b;
    }

    public static double divide(int a, int b) {
        //write your code here
        return a/b;
    }

    public static double percent(int a, int b) {
        //write your code here
        return (a * b)/100;
    }

    public static void main(String[] args) {
        System.out.println(plus(2,2) + " " + minus(5, 3)+ " " + multiply(45,45) + " " + divide(10,3) + " " + percent(50, 10));
        plus(2,2);
        minus(5, 3);
        multiply(45,45);
        divide(10,3);
        percent(50, 10);
    }
}
