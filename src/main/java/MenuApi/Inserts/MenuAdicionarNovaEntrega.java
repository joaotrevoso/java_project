package MenuApi.Inserts;

import DateandTimeUtilites.StringToDate;
import DateandTimeUtilites.StringToTime;
import com.mycompany.DbApi.Querrys.Insert_Querry;
import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_FilterDatas;
import com.mycompany.DbApi.StringUtilites.ArrayIdToString;
import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAdicionarNovaEntrega {

    private static List<EmpresaTb> Empresas;
    private static int controler;

    public static void NovaEntrega(){

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do entregador: ");
        String NomeEntregador = scan.nextLine().replaceAll(" ", "_").toLowerCase();

        EntregadorTb EntregadorFc = SelectQuerrys_FilterDatas.FilterEntregador(NomeEntregador);

        System.out.println();

        System.out.print("Informe a Data da entrega no padrao dd/mm/yyyy: ");
        String DataString = scan.nextLine();
        Date DataEntrega = StringToDate.Format(DataString);

        System.out.println();

        System.out.print("Informe a Hora da saida no padrao hh:mm:ss: ");
        String HoraString = scan.nextLine();
        Time HoraSql = StringToTime.StrToTime(HoraString);

        System.out.print("Informe o numero de empresas na entrega: ");
        controler = scan.nextInt();

        scan.nextLine();

        Empresas = new ArrayList<>();

        for (int i = 0; i < controler ; i ++){

            System.out.println();
            System.out.print("Nome da empresa: ");
            String empresa = scan.nextLine().replaceAll(" ", "_").toLowerCase();

           Empresas.add(SelectQuerrys_FilterDatas.FilterEmpresas(empresa));

        }

        String IdsEmpresas = ArrayIdToString.IdToString(Empresas);

        Insert_Querry.NovaEntrega(EntregadorFc);

    }

}
