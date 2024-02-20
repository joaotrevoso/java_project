package DateandTimeUtilites;

import java.sql.Time;
import java.time.LocalTime;

public class StringToTime {

    public static Time StrToTime(String time){

        LocalTime tim = LocalTime.parse(time);

        return Time.valueOf(tim);

    }

}
