public class Solution25_03 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int resto = 0;

        for(int i= 0; i < number; i++){
            resto += (number % 10);
            number/=10;
        }
        return resto;
    }
}
