package CurrentTime_6;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Jakub Marciniak
 * #6
 */

public class CurrentTime {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);
        //----------------------------------------

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
        //----------------------------------------

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));
        //----------------------------------------

        SimpleDateFormat dayOffTheWeek = new SimpleDateFormat("EEEE");
        System.out.println(dayOffTheWeek.format(currentDate));
        //----------------------------------------

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));


    }
}
