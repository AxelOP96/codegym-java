public class Solution09_09 {
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            String s = null;
            String m = s.toLowerCase();
        }
        catch(NullPointerException e){
            System.out.println(e.getClass());
        }

    }
}
