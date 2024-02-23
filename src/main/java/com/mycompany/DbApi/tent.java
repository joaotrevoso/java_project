/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DbApi;


import MenuApi.Inserts.MenuAdicionarNovaEntrega;
import com.mycompany.DbApi.Querrys.Selects.SelectQuerrys_FilterDatas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author joaotrevoso
 */

public class tent {
    
    public static void main(String args[]){



        //MenuAdicionarNovaEntrega.NovaEntrega();

        System.out.println();

        System.out.print("Informe a data da entrega no padrao dd/mm/yyyy: ");

        Scanner scan = new Scanner(System.in);

        String date = scan.nextLine();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate lc =  LocalDate.parse(date,df);

        Date data = Date.valueOf(lc);

        SelectQuerrys_FilterDatas.ShowEntrega(data);

        }

    }
    

