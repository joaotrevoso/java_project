package MenuApi;

import MenuApi.Selects_Mostrar.MenuVer;

import java.util.Scanner;

import static java.lang.System.*;

public class MenuCentral {

    public static void Menur(){

        int opcao;
        Scanner sc = new Scanner(System.in);

        do {

            out.println("Opcoes: (1) Entrar");
            out.println("Opcoes: (0) Sair");


            out.println();
           System.out.print(": "); opcao = sc.nextInt();

           switch (opcao){

               case 1: MenuVer.Ver(); break;

               default: break;
           }

        }while(opcao != 0);
    }

}
