/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DbApi;


import MenuApi.Inserts.MenuAdicionarNovaEntrega;
import com.mycompany.DbApi.Querrys.Selects.ConvertStringToInt;
import com.mycompany.DbApi.Querrys.Selects.SelectForIds;
import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_FilterDatas;
import com.mycompany.DbApi.Tables.EmpresaTb;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author joaotrevoso
 */

public class tent {
    
    public static void main(String args[]){


        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       LocalDate lc =  LocalDate.parse("15/09/1980",df);

        Date data = Date.valueOf(lc);

        //MenuAdicionarNovaEntrega.NovaEntrega();

        SelectQuerrys_FilterDatas.ShowEntrega(data);

        }

    }
    

