package DateandTimeUtilites;

import java.sql.Date;
import java.time.LocalDate;

public class DateUtilites {

    public static Date GetDataAtual(){

        return Date.valueOf(LocalDate.now());

    }

}
