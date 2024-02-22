package com.mycompany.DbApi.StringUtilites;

public class StringFormat {

    public static String Format(String x){

        return x.replaceAll(" ", "_").toLowerCase();

    }

}
