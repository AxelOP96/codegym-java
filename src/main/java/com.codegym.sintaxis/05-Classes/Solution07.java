public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int sum =0;
        float total;
        int count = 0;
        while(num != -1){
            sum+= num;
            count++;
            num = teclado.nextInt();
        }
        total = sum/count;
        System.out.println();
    }
}
