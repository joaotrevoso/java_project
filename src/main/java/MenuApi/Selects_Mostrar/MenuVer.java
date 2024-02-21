package MenuApi.Selects_Mostrar;

import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_AllDatas;

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
                    SelectQuerrys_AllDatas.AllDatas(); SelectQuerrys_AllDatas.ALlHoras(); break;

                case 2:
                    SelectQuerrys_AllDatas.AllEmpresas(); break;

                case 3:
                    SelectQuerrys_AllDatas.AllEntregadores(); break;

                default: break;
            }

        }while(opcao != 0);


    }

}
