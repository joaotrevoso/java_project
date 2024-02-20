package MenuApi.Selects_Mostrar;

import com.mycompany.DbApi.Querrys.Select_Querry;

import java.util.Scanner;

public class MenuVer {

    public static void Ver(){

        int opcao;
        Scanner sc = new Scanner(System.in);

        do{


            System.out.println("Opcao: (1) Ver Datas e Horas");
            System.out.println("Opcao: (3) Ver Empresas Cadastradas");
            System.out.println("Opcao: (4) Ver Motoristas Cadastrados");
            System.out.println("Opcao: (0) Sair");

            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    Select_Querry.AllDatas(); Select_Querry.ALlHoras(); break;

                case 2:
                    Select_Querry.AllEmpresas(); break;

                case 3:
                    Select_Querry.AllEntregadores(); break;

                default: break;
            }

        }while(opcao != 0);


    }

}
