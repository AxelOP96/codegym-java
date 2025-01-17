import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution17_08 {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //write your code here
        map.put("Alejandro", df.parse("FEBRUARY 12 1960"));
        map.put("Vilma", df.parse("DECEMBER 18 1965"));
        map.put("Michel", df.parse("MAY 4 1993"));
        map.put("Axel", df.parse("APRIL 2 1996"));
        map.put("Dana", df.parse("OCTOBER 16 1997"));
        map.put("Lisa", df.parse("NOVEMBER 7 2001"));
        map.put("Tomy", df.parse("AUGUST 24 2004"));
        map.put("Santino", df.parse("DECEMBER 8 2008"));
        map.put("Pini", df.parse("DECEMBER 3 2016"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date inicioRango = new Date("JUNE 1"); // fecha de inicio del rango
            Date finRango = new Date("AUGUST 31"); // fecha de fin del rango
            String key = pair.getKey();
            Date fecha = pair.getValue();
            if (fecha.after(inicioRango) && fecha.before(finRango)){
                map.remove(key, fecha);
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> lista = createMap();
        Iterator<Map.Entry<String, Date>> iterator = lista.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();
            Date value = pair.getValue();
            System.out.println("Persona: " + key + ", Cumpleaños: " + value);
    }
}
}