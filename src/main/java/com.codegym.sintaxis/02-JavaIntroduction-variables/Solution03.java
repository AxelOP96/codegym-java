public class Solution03 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double TF = (9/5) * celsius + 32;

        return TF;
    }
}
