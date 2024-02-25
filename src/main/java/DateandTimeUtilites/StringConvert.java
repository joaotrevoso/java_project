package DateandTimeUtilites;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringConvert implements StringTo{

    @Override
    public Date StringToDate(String date) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate locd = LocalDate.parse(date,dtf);

        return Date.valueOf(locd);

    }

    @Override
    public Time StringToTime(String time) {

        LocalTime tim = LocalTime.parse(time);

        return Time.valueOf(tim);

    }
}
