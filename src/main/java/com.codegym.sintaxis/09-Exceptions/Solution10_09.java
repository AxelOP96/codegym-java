public class Solution10_09 {
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            int[] m = new int[2];
            m[8] = 5;

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }

    }
}
