/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DbApi;


import MenuApi.Inserts.MenuAdicionarNovaEntrega;
import com.mycompany.DbApi.ConnectionDb.ConnectionDB;
import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_FilterDatas;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author joaotrevoso
 */

public class tent {
    
    public static void main(String args[]) throws SQLException {


        //MenuAdicionarNovaEntrega.NovaEntrega();

        Scanner scan = new Scanner(System.in);

       DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println();

       LocalDate data = LocalDate.parse( scan.nextLine(),form);

        System.out.println();

       Date date = Date.valueOf(data);


        SelectQuerrys_FilterDatas.ShowEntrega(date);



        }

    }
    

