package DateandTimeUtilites;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {

    public static Date Format(String date){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate locd = LocalDate.parse(date,dtf);

        return Date.valueOf(locd);


    }

}
