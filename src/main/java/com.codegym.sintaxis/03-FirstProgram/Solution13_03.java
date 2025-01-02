public class Solution13_03 {
    public static int convertToSeconds(int hour){
        int result = hour * 3600;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(30));
        System.out.println(convertToSeconds(5));
    }
}
