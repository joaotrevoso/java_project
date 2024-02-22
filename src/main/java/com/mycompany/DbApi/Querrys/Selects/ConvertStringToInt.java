package com.mycompany.DbApi.Querrys.Selects;

import java.util.ArrayList;
import java.util.List;

public class ConvertStringToInt {

    public static List<Integer> Convert(String text){

        List<Integer> lista = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < text.length() ; i ++){

            sb.append(text.charAt(i));

           lista.add(Integer.valueOf(sb.toString()));

            sb.deleteCharAt(0);

        }

        return lista;

    };


}
