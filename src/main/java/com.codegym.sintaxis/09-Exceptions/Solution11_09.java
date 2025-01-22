import java.util.ArrayList;

public class Solution11_09 {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
            System.out.println(s);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
    }
}
