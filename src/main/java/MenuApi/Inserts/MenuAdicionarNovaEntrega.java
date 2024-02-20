package MenuApi.Inserts;

import DateandTimeUtilites.StringToDate;
import DateandTimeUtilites.StringToTime;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

public class MenuAdicionarNovaEntrega {

    public static void NovaEntrega(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do entregador: ");
        String NomeEntregador = scan.nextLine().replaceAll(" ", "_").toLowerCase();

        System.out.println();

        System.out.print("Informe a Data da entrega no padrao dd/mm/yyyy: ");
        String DataString = scan.nextLine();
        Date DataEntrega = StringToDate.Format(DataString);

        System.out.println();

        System.out.print("Informe a Hora da saida no padrao hh:mm:ss: ");
        String HoraString = scan.nextLine();
        Time HoraSql = StringToTime.StrToTime(HoraString);

        System.out.println();


        

    }

}
