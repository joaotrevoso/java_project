package com.mycompany.DbApi.Querrys.Selects;

import com.mycompany.DbApi.ConnectionDb.ConnectionDB;
import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.EntregaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;

public class SelectForIds {


    public static EmpresaTb Empresas(int id){

        String sql = "Select * from Empresa where pkid_Empresa = ?;";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand(sql);

            jr.setInt(1,id);

            jr.execute();

            while(jr.next()){

                return  EmpresaTb.builder().IdEmpresa(id)
                        .NomeEmpresa(jr.getString("NomeEmpresa"))
                        .LocalizacaoEmpresa(jr.getString("LocalizacaoEmpresa"))
                        .build();

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }

    public static EntregadorTb Entregador(int id){

        String sql = "Select * from Entregador where Pkid_entregador = ?;";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand(sql);

            jr.setInt(1,id);

            jr.execute();

            while ((jr.next())){

               return EntregadorTb.builder()
                        .Id_Entrehgador(jr.getInt("Pkid_entregador"))
                        .nome(jr.getString("Nome_entregador"))
                        .build();

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }

}
