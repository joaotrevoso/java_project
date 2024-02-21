package com.mycompany.DbApi.StringUtilites;

import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

import java.util.Iterator;
import java.util.List;


public class ArrayIdToString {

    public static StringBuilder strb;

    public static String IdToString(List<EmpresaTb> empresas){

        strb = new StringBuilder();

        Iterator<EmpresaTb> iterator  = empresas.iterator();

        while(iterator.hasNext()){

            strb.append(iterator.next().getIdEmpresa());

        }

    return strb.toString();

    }

}
