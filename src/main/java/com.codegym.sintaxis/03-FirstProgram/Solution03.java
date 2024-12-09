public class Solution03 {
    public static void main(String[] args) {
        convertEurToUsd(20);
        convertEurToUsd(30);
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double result = eur * exchangeRate;
        return result;
    }
}
