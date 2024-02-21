/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DbApi;





import com.mycompany.DbApi.Querrys.Insert_Querry;

import java.sql.SQLException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 *
 * @author joaotrevoso
 */
public class tent {
    
    public static void main(String args[]) throws ParseException, SQLException {

        String a = "123";

        StringBuilder sb = new StringBuilder();

        Insert_Querry.NovasEmpresasId("321");


        for(int i = 0; i  < a.length() ; i++){

                int d = 0;

                d = Integer.parseInt(sb.append(a.charAt(i)).toString());

                sb.delete(0,1);

            //System.out.println(d + 1);

        }

    }
    
}
