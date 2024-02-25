import DateandTimeUtilites.StringConvert;
import DateandTimeUtilites.StringTo;

import java.sql.Date;

public class Mainzao {

    public static void main(String args[]){

        StringTo str = new StringConvert();

        Date data = str.StringToDate("13/02/2021");

        System.out.println(data);

    }

}
