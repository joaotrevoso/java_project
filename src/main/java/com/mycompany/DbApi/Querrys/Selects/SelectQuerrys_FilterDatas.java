package com.mycompany.DbApi.Querrys.Selects;

import com.mycompany.DbApi.ConnectionDb.ConnectionDB;
import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;

public class SelectQuerrys_FilterDatas {

    public static EntregadorTb FilterEntregador(String EntName){

        String sql = "Select * from Entregador where Nome_entregador like ? ";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()){

            jr.setCommand(sql);

            jr.setString(1,String.format("%%%s%%",EntName));

            jr.execute();

            while (jr.next()){

              return EntregadorTb.builder().nome(jr.getString("Nome_entregador")).
                        Id_Entrehgador(jr.getInt("Pkid_entregador")).build();

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        throw new IllegalArgumentException("Nao Deu boa Ao Montar sla");

    }

    public static EmpresaTb FilterEmpresas(String EmpresaName){

        String sql = "Select * from Empresa where NomeEmpresa like ? ";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand(sql);

            jr.setString(1,String.format("%%%s%%",EmpresaName));

            jr.execute();

            while(jr.next()){

                return EmpresaTb.builder().IdEmpresa(jr.getInt("pkid_Empresa"))
                        .LocalizacaoEmpresa(jr.getString("LocalizacaoEmpresa"))
                        .NomeEmpresa(jr.getString("NomeEmpresa")).build();

            }



        } catch (SQLException e) {

            throw new RuntimeException(e);
        }

        throw new IllegalArgumentException("Empresa nao existente favor cadastrar");

    }

}
