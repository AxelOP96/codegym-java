import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution08_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            double answer = weight / (height * height);
            if(answer < 18.5){
                System.out.println("Underweight: BMI < 18.5");
            }
            else if(answer >=18.5 && answer < 25){
                System.out.println("Normal: 18.5 <= BMI < 25");
            }
            else if(answer >=25 && answer < 30){
                System.out.println("Normal: 18.5 <= BMI < 25");
            }
            else{
                System.out.println("Obese: BMI >= 30");
            }


        }
    }
}
