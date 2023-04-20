package Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtils {
    public static String getCurrentDate() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String current = formatter.format(date);
        LocalDate expire = LocalDate.parse(current);
        return String.valueOf(expire);

    }

    public static String getCurrentTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a EEEE");
        return dateTime.format(formatter);
    }


    public static String geDateFromToday(Integer month) {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String current = formatter.format(date);
        LocalDate expire = LocalDate.parse(current).plusMonths(month);
        return String.valueOf(expire);

    }
}
