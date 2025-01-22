import java.util.HashMap;

public class Solution12_09 {
    public static void main(String[] args) throws Exception {
        //write your code here
        try{
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
            System.out.println(map);
        }
        catch(NullPointerException e){
            System.out.println(e.getClass());
        }


    }
}
