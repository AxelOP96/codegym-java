import java.util.Scanner;

public class Solution08_04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int year = teclado.nextInt();
        int leap = 366;
        int ord = 365;
        if(year % 400 == 0){
            System.out.println("Number of days in the year: " + leap);
        }
        else if(year % 100 == 0)
            System.out.println("Number of days in the year: " + ord);
        else if(year % 4 == 0)
            System.out.println("Number of days in the year: " + leap);
        else{
            System.out.println("Number of days in the year: " + ord);
        }
    }
}
