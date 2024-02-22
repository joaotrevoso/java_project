package MenuApi.Inserts;

import com.mycompany.DbApi.Querrys.Inserts.Insert_Querry;

import java.util.Scanner;

public class MenuAdicionarNovaEmpresa {

    public static void AdicionarNovaEmpresa(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Empresa nao existente! Cadastrando agora !");
        System.out.println();

        System.out.print("Informe o nome da empresa: ");
        String NomeEmpresa = scan.nextLine().replaceAll(" ", "_").toLowerCase();

        System.out.println();

        System.out.print("Informe a Localizacao da empresa: ");
        String LocalizacaoEMpresa = scan.nextLine().replaceAll(" ","_").toLowerCase();

        System.out.println(NomeEmpresa);
        System.out.println(LocalizacaoEMpresa);

       Insert_Querry.NovaEmpresa(NomeEmpresa,LocalizacaoEMpresa);

    }

}
