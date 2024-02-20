package com.mycompany.DbApi.Querrys;

import com.mycompany.DbApi.ConnectionDb.ConnectionDB;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Locale;

public class Select_Querry {


    public static void AllDatas(){

        String sql = "select DataEntrega from Entrega;";

        try(JdbcRowSet jd = ConnectionDB.DbConnect()){

            jd.setCommand(sql);

            jd.execute();

               while (jd.next()) {

                Date da =  jd.getDate(("DataEntrega"));


                DateFormat df = DateFormat.getDateInstance();

                   System.out.println(df.format(da));

               }
        }catch (Exception e){

            e.printStackTrace();

        }


    }

    public static void AllEmpresas(){

        String sql = "Select * from Empresa";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

                jr.setCommand(sql);

                jr.execute();

                while(jr.next()){

                    System.out.println("--------------------------");
                    System.out.println(String.format("Nome empresa: %s id: %d Localizacao: %s",jr.getString("NomeEmpresa"),
                            jr.getInt("pkid_Empresa"),jr.getString("LocalizacaoEmpresa")));
                    System.out.println("---------------------------");

                }



        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

    }

    public static void AllEntregadores(){

        String sql = "Select * from Entregador";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()){

            jr.setCommand(sql);

            jr.execute();

            while (jr.next()){

                System.out.println("--------------------------");
                System.out.println(String.format("Nome Entregador: %s Id Entregador: %d",jr.getString("Nome_entregador"),
                        jr.getInt("Pkid_entregador")));
                System.out.println("--------------------------");

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void ALlHoras(){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            String sql = "Select HoraChegada,HoraSaida from Entrega";

            jr.setCommand(sql);

            jr.execute();

            while(jr.next()){

             Time a = jr.getTime("HoraChegada");
                Time b = jr.getTime("HoraSaida");

                var hora = LocalTime.of(a.getHours(),a.getMinutes(),a.getSeconds());
                var hora2 = LocalTime.of(b.getHours(),b.getMinutes(),b.getSeconds());


                System.out.println("Chegada: " + hora);

                System.out.println("Saida: " + hora2);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
