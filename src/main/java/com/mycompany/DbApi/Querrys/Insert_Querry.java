package com.mycompany.DbApi.Querrys;

import DateandTimeUtilites.DateUtilites;
import com.mycompany.DbApi.ConnectionDb.ConnectionDB;
import com.mycompany.DbApi.DbUtilites.RowSet;
import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;
import com.mysql.cj.result.LongValueFactory;
import lombok.extern.log4j.Log4j2;

import javax.sql.ConnectionEvent;
import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import javax.xml.stream.events.EntityReference;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarOutputStream;

@Log4j2
public class Insert_Querry {

    public static void NovasEmpresasId(String ids){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()){

            String sql = "select * from Empresas_Entrega where empresas_id = ? and Data_empresas = ?;";

            jr.setCommand(sql);

            jr.setString(1,String.format("%%%s%%",ids));

            jr.setDate(2,DateUtilites.GetDataAtual());

            jr.execute();

            if(!jr.next()){

                jr.moveToInsertRow();

                jr.updateString("empresas_id",ids);

                jr.updateDate("Data_empresas", DateUtilites.GetDataAtual());

                System.out.println(DateUtilites.GetDataAtual());

                jr.insertRow();

                jr.commit();
            }

            else{

                log.error("deu rim");

            }


        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

    }

    public static void NovaEmpresa(String Nome, String Localizacao){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand("select * from Empresa where NomeEmpresa like ? and LocalizacaoEmpresa like ?;");

            jr.setString(1,String.format("%%%s%%",Nome));

            jr.setString(2,String.format("%%%s%%",Localizacao));

            jr.execute();

            jr.addRowSetListener(new RowSet());

            if(!jr.next()) {

                jr.moveToInsertRow();

                jr.updateString("NomeEmpresa", Nome);
                jr.updateString("LocalizacaoEmpresa", Localizacao);

                jr.insertRow();

                jr.commit();
            }

            else{

                log.error("Empresa Informada Já existe!");

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

    public static void NovaEntrega(EntregadorTb entregador, List<EmpresaTb> empresa, EntregaTb entrega){

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            String sql = "Select * from Entrega where DataEntrega = ? and HoraSaida = ?";

            jr.setCommand(sql);

            jr.setDate(1,entrega.getData_entrega());

            jr.setTime(2,entrega.getHora_Saida());

            jr.execute();

            if(!jr.next()){

                jr.updateDate("DataEntrega",entrega.getData_entrega());

                jr.updateTime("HoraSaida",entrega.getHora_Saida());

                jr.updateTime("HoraChegada",entrega.getHora_Entrada());

                Iterator<EmpresaTb> it = empresa.iterator();

                while(it.hasNext()){

                    it.next().getIdEmpresa();

                }

                jr.updateInt("Fkid_Entregador",entregador.getId_Entrehgador());

                jr.updateRow();

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
