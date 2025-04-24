import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Dateu {
    public static void main(String[] args) {
        
        Date date=new Date();
        System.out.println("Current date" + date);

        //Giving format
        SimpleDateFormat format= new SimpleDateFormat("yyyy/MM/dd");

        //Foramting the date
        String dateformat=format.format(date);
        System.out.println("Current date: " + dateformat);

        //Using Date time formater
        //Create a DateTimeFormater with the desire pattern
       
        DateTimeFormatter formating=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //Current Date
        LocalDate date2=LocalDate.now();

        String currentDate=date2.format(formating);
        System.out.println(currentDate);

        //Calendar
        Calendar calendar=Calendar.getInstance();
        calendar.set(2025 ,3, 24);
        Date date3=calendar.getTime();
        System.out.println(date3);

        



    }
}
