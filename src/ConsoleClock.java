import java.util.Calendar;
import java.util.GregorianCalendar;

public class ConsoleClock implements Runnable {


    public void run() {

        Calendar calendar = new GregorianCalendar();


        System.out.println(calendar.getTime());


    }
}



