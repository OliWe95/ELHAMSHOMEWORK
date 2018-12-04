import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarCalculator {

    //Example of singleton pattern: only one instance and thread safe

    private static CalendarCalculator singletonCalendarCalculator;

    private CalendarCalculator(){
        Calendar c = new GregorianCalendar();
        System.out.println("Aktuelles Datum: "+ String.format("%02d", c.get(GregorianCalendar.DAY_OF_MONTH))+"."
                                             +String.format("%02d", c.get(GregorianCalendar.MONTH))+"."
                                             +String.format("%04d", c.get(GregorianCalendar.YEAR)));
    }

    public static CalendarCalculator getInstance(){
        if(singletonCalendarCalculator == null)
            singletonCalendarCalculator = new CalendarCalculator();
        return singletonCalendarCalculator;
    }

}
