package com.mycompany.DbApi;

import com.mycompany.DbApi.Querrys.Selects.ConvertStringToInt;
import com.mycompany.DbApi.Querrys.Selects.SelectForIds;
import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

public class TesteImpressao {

    public static void Imprimir(EntregaTb entrega){

        EntregadorTb entregador = SelectForIds.Entregador(entrega.getId_Entregador());

        String idEmpresas = SelectForIds.IdsEmpresas(entrega.getId_Empresas());

        System.out.println("Nome do entregador: " + entregador.getNome());
        System.out.println();

        System.out.println("------------------------------------------");

        System.out.println("Data da entrega: " + entrega.getData_entrega());
        System.out.println();
        System.out.println("Hora da saida: " + entrega.getHora_Saida());
        System.out.println();
        System.out.println("Hora da chegada: " + entrega.getHora_Entrada());
        System.out.println();

        System.out.println("--------------------------------------------");

        System.out.println("Empresas: ");
        System.out.println();

        for(int i : ConvertStringToInt.Convert(idEmpresas)){

            EmpresaTb empresa = SelectForIds.Empresas(i);

            System.out.println();
            System.out.println("Nome: " + empresa.getNomeEmpresa());
            System.out.println();
            System.out.println("Localizacao: " + empresa.getLocalizacaoEmpresa());

        }



    }

}
