public class Solution13_06 {
    public static String multiply(String s) {
        String result = "";
        for(int i =0; i<5;i++){
            result+=s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for(int i=0; i<count;i++){
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(multiply("axel"));
        System.out.println(multiply("axel", 7));
    }
}
