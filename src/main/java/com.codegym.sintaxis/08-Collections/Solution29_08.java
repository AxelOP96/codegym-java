import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution29_08 {
    //Month number
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

            if(month.equals(months.get(0))){
                System.out.println("January is month 1");
            }
            else if(month.equals(months.get(1))){
                System.out.println("February is month 2");
            }
            else if(month.equals(months.get(2))){
                System.out.println("March is month 3");

            }
            else if(month.equals(months.get(3))){
                System.out.println("April is month 4");

            }
            else if(month.equals(months.get(4))){
                System.out.println("May is month 5");

            }
            else if(month.equals(months.get(5))){
                System.out.println("June is month 6");

            }
            else if(month.equals(months.get(6))){
                System.out.println("July is month 7");

            }
            else if(month.equals(months.get(7))){
                System.out.println("August is month 8");

            }
            else if(month.equals(months.get(8))){
                System.out.println("September is month 9");

            }
            else if(month.equals(months.get(9))){
                System.out.println("October is month 10");

            }
            else if(month.equals(months.get(10))){
                System.out.println("November is month 11");

            }
            else if(month.equals(months.get(11))){
                System.out.println("December is month 12");
            }

    }
}
