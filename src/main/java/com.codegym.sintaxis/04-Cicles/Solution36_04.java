public class Solution36_04 {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;
        while(i < 11){
            j = 1;
            while(j < 11){
                System.out.print((j * i) + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
