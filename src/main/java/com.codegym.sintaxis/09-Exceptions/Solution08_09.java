public class Solution08_09 {
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            int a = 42 / 0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass());
        }

    }
}
