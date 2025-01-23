import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution23_09 {
    //What's today's date?
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String userDate = reader.readLine().replace('-', ' ');

        try{
            //
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
            Date date = inputFormat.parse(userDate);
            SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            String formattedDate = df.format(date).toUpperCase();
            System.out.println(formattedDate);
        }catch(IllegalArgumentException | ParseException e){
            System.out.println(e.getMessage());
        }
        //2013-08-18 -> INPUT
        //AUG 18, 2013 -> OUTPUT
    }
}
