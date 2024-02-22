/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DbApi;


import MenuApi.Inserts.MenuAdicionarNovaEntrega;
import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_AllDatas;
import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_FilterDatas;
import com.mycompany.DbApi.Tables.Empresas_Entrega;
import com.mycompany.DbApi.Tables.EntregaTb;

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

       LocalDate lc =  LocalDate.parse("21/02/2024",df);

        Date data = Date.valueOf(lc);

        EntregaTb ent = SelectQuerrys_FilterDatas.ShowEntrega(data);


        }

    }
    

