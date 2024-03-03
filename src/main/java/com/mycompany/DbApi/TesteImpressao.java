//package com.mycompany.DbApi;
//
//import com.mycompany.DbApi.Querrys.Selects.SelectForIds;
//import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_FilterDatas;
//import com.mycompany.DbApi.StringUtilites.ConvertStringToId;
//import com.mycompany.DbApi.Tables.EmpresaTb;
//import com.mycompany.DbApi.Tables.EntregaTb;
//import com.mycompany.DbApi.Tables.EntregadorTb;
//
//import java.util.IllegalFormatConversionException;
//
//public class TesteImpressao {
//
//    public static void Imprimir(EntregaTb entrega){
//
//        EntregadorTb entregador = SelectForIds.Entregador(entrega.getId_Entregador());
//
//
//        System.out.println("Nome do entregador: " + entregador.getNome());
//        System.out.println();
//
//        System.out.println("------------------------------------------");
//
//        System.out.println("Data da entrega: " + entrega.getData_entrega());
//        System.out.println();
//        System.out.println("Hora da saida: " + entrega.getHora_Saida());
//        System.out.println();
//        System.out.println("Hora da chegada: " + entrega.getHora_Entrada());
//        System.out.println();
//
//        System.out.println("--------------------------------------------");
//
//        System.out.println("Empresas: ");
//        System.out.println();
//
//        for(int i : ConvertStringToId.GetId(entrega.getId_Empresas())){
//
//            EmpresaTb empresa = SelectForIds.Empresas(i);
//
//            System.out.println();
//
//            System.out.println("localizacao empresa: " + empresa.getLocalizacaoEmpresa());
//
//            System.out.println("Nome empresa: " + empresa.getNomeEmpresa());
//
//        }
//
//
//
//    }
//
//}
