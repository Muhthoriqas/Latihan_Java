
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        String input_date = day + "/" + month + "/" + year;
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        try 
        {
            DateFormat format2 = new SimpleDateFormat("EEEE"); 
            String final_day = format2.format(format1.parse(input_date));
            System.out.println(final_day.toUpperCase());
        }
        catch(Exception e){}
        in.close();
    }
}