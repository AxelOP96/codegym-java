import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Solution28_08 {
    //Working with dates
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        boolean isOdd = false;
        //Calendar fechaInicio = new GregorianCalendar(2013, Calendar.JANUARY,1);
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        Date fecha = sdf.parse(date);
        Calendar fechaConvertida = new GregorianCalendar();
        fechaConvertida.setTime(fecha);
        int dayOfYear = fechaConvertida.get(Calendar.DAY_OF_YEAR);
        //System.out.println(dayOfYear);
        isOdd = dayOfYear % 2 != 0;
        return isOdd;
    }
}
