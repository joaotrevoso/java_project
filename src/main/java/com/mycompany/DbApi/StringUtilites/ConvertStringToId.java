package com.mycompany.DbApi.StringUtilites;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConvertStringToId {

    public static List<Integer> GetId(String x){

        List<Integer> lista = new ArrayList<>();

        Pattern patern = Pattern.compile("\\{(.*?)}");

        Matcher matcher = patern.matcher(x);

        while (matcher.find()){

           lista.add(Integer.valueOf(matcher.group(1)));

        }

        return lista;

        }

}
