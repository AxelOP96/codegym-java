import java.util.Arrays;

public class Solution20_09 {
    public static void main(String[] args) {
        try {
            divideByZero();
        }catch (ArithmeticException e){
            //System.out.println();
            e.printStackTrace();
        }
    }
    public static void divideByZero(){
            System.out.println(2 / 0);


    }
}
