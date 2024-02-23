package com.mycompany.DbApi.StringUtilites;

import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

import java.util.Iterator;
import java.util.List;


public class ArrayIdToString {

    public static StringBuilder strb;

    public static String IdToString(List<EmpresaTb> empresas){

        StringBuilder strb = new StringBuilder();

        for (int i = 0; i < empresas.size(); i++) {

            strb.append(String.format("{%d}",empresas.get(i).getIdEmpresa()));

        }

        return strb.toString();

    }

}
