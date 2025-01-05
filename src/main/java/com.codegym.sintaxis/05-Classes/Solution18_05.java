import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Solution18_05 {
    public static void main(String[] args){

        //LocalDate hora = LocalDate.of(2018, 6, 15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate hora = LocalDate.parse("06 15 2018", formatter);
        System.out.println(hora.format(formatter));
    }
}
