public class Solution03_03 {
    public static void main(String[] args) {
        convertEurToUsd(20, 1.1);
        convertEurToUsd(30, 1.1);
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double result = eur * exchangeRate;
        return result;
    }
}
