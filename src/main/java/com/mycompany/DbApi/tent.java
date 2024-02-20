/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DbApi;



import DateandTimeUtilites.StringToDate;
import DateandTimeUtilites.StringToTime;
import MenuApi.Inserts.MenuAdicionarNovaEmpresa;
import MenuApi.Inserts.MenuAdicionarNovaEntrega;
import MenuApi.Inserts.MenuAdicionarNovoEntregador;
import MenuApi.MenuCentral;
import com.mycompany.DbApi.Querrys.Insert_Querry;
import com.mycompany.DbApi.Tables.EntregaTb;

import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
import java.sql.Date;
import java.text.ParseException;


/**
 *
 * @author joaotrevoso
 */
public class tent {
    
    public static void main(String args[]) throws ParseException {

        String a = "123";

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i  < a.length() ; i++){

                int d = 0;

                d = Integer.parseInt(sb.append(a.charAt(i)).toString());

                sb.delete(0,1);

            //System.out.println(d + 1);

        }

      //  MenuAdicionarNovaEmpresa.AdicionarNovaEmpresa();

        //MenuAdicionarNovaEntrega.NovaEntrega();

        System.out.println(StringToTime.StrToTime("14:20"));



        //int b =Integer.valueOf(a);

       // int  c = Integer.parseInt(a);

        //System.out.println(c + 1);

//        LocalTime hora  = LocalTime.parse("18:24:00");
//
//        LocalTime hor2  = LocalTime.parse("13:24:00");
//
//        Time tim1 = Time.valueOf(hora);
//
//        Time tim2 = Time.valueOf(hor2);
//
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        DateFormat frm = DateFormat.getDateInstance(DateFormat.DATE_FIELD);
//
//        LocalDate data = LocalDate.parse("21/02/2024", formato);
//
//        Date data3 = Date.valueOf(data);
//
//        System.out.println(frm.format(data3));
//
//        EntregaTb ent = new EntregaTb(1,data3,tim1,tim2,3);
//
//        Insert_Querry.NovaEntrega(null,null,ent);




    }
    
}
