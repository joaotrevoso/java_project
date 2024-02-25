package com.mycompany.DbApi.Querrys.Inserts;

import DateandTimeUtilites.TimeUtilites;
import com.mycompany.DbApi.ConnectionDb.ConnectionDB;

import com.mycompany.DbApi.Tables.EntregaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;
import lombok.extern.log4j.Log4j2;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;


@Log4j2
public class Insert_Querry{



    public static void NovaEmpresa(String Nome, String Localizacao){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand("select * from Empresa where NomeEmpresa like ? and LocalizacaoEmpresa like ?;");

            jr.setString(1,String.format("%%%s%%",Nome));

            jr.setString(2,String.format("%%%s%%",Localizacao));

            jr.execute();


            if(!jr.next()) {

                jr.moveToInsertRow();

                jr.updateString("NomeEmpresa", Nome);

                jr.updateString("LocalizacaoEmpresa", Localizacao);

                jr.insertRow();

                jr.commit();
            }


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

    public static void NovoEntregador(String NomeEntregado){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

        String sql = "Select * from Entregador where Nome_entregador like ?";

        jr.setCommand(sql);

        jr.setString(1,String.format("%%%s%%",NomeEntregado));

        jr.execute();

        if(!jr.next()){

            jr.moveToInsertRow();

            jr.updateString("Nome_entregador",NomeEntregado);

            jr.insertRow();

            jr.commit();

        }

        else{

            log.error("Entregador Informado Ja existe! ");

        }


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

    public static void NovaEntrega(EntregadorTb entregador, EntregaTb entrega){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            String sql = "Select * from Entrega where DataEntrega = ? and HoraSaida = ?";

            jr.setCommand(sql);

            jr.setDate(1,entrega.getData_entrega());

            jr.setTime(2,entrega.getHora_Saida());

            jr.execute();

            if(!jr.next()){

                jr.moveToInsertRow();

                jr.updateDate("DataEntrega",entrega.getData_entrega());

                jr.updateTime("HoraSaida",entrega.getHora_Saida());

                jr.updateTime("HoraChegada", TimeUtilites.NullTime);

                jr.updateInt("Fkid_Entregador",entregador.getId_Entrehgador());

                jr.updateString("Fkid_Empresas",entrega.getId_Empresas());

                jr.insertRow();

                jr.commit();

            }
            else{

                log.error("Entrega Ja Cadastrada");

                return;

            }


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }



}
