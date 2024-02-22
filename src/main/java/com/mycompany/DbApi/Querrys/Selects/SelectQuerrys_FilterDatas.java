package com.mycompany.DbApi.Querrys.Selects;

import MenuApi.Inserts.MenuAdicionarNovaEmpresa;
import MenuApi.Inserts.MenuAdicionarNovoEntregador;
import com.mycompany.DbApi.ConnectionDb.ConnectionDB;
import com.mycompany.DbApi.Tables.EmpresaTb;
import com.mycompany.DbApi.Tables.Empresas_Entrega;
import com.mycompany.DbApi.Tables.EntregaTb;
import com.mycompany.DbApi.Tables.EntregadorTb;

import javax.sql.rowset.JdbcRowSet;
import java.sql.Date;
import java.sql.SQLException;

public class SelectQuerrys_FilterDatas {

    public static Empresas_Entrega FilterEmpresasEnt(Date data, String ids){

        String sql = "select * from Empresas_Entrega where Fkempresas_id = ? and Data_empresas = ?;";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {


            jr.setCommand(sql);

            jr.setString(1,ids);
            jr.setDate(2,data);

            jr.execute();

            while (jr.next()){

                return Empresas_Entrega.builder().Data_Entrega(jr.getDate("Data_empresas"))
                        .fkEmpresas_id(jr.getString("Fkempresas_id"))
                        .idEmpresas_Entrega(jr.getInt("idEmpresas_Entrega"))
                        .build();


            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }

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

            if(!jr.next()){

                MenuAdicionarNovoEntregador.NovoEntregador();

                return FilterEntregador(EntName);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        throw new IllegalArgumentException("Nao Deu boa Ao Montar sla");

    }

    public static EmpresaTb FilterEmpresas(String EmpresaName){

        EmpresaName = EmpresaName.replaceAll(" ", "_").toLowerCase();

        String sql = "Select * from Empresa where NomeEmpresa like ? ";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand(sql);

            jr.setString(1,String.format("%%%s%%",EmpresaName));

            jr.execute();

            while(jr.next()){

                return EmpresaTb.builder().IdEmpresa(jr.getInt("pkid_Empresa"))
                        .NomeEmpresa(jr.getString("NomeEmpresa"))
                        .LocalizacaoEmpresa(jr.getString("LocalizacaoEmpresa"))
                        .build();
            }

          if(!jr.next()){

              MenuAdicionarNovaEmpresa.AdicionarNovaEmpresa();

              return FilterEmpresas(EmpresaName);

          }


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

        throw new IllegalArgumentException("sadasd");


    }

    public static EntregaTb ShowEntrega(Date data){

        String sql = "Select * from Entrega where DataEntrega = ?;";

        try(JdbcRowSet jr = ConnectionDB.DbConnect()) {

            jr.setCommand(sql);

            jr.setDate(1,data);

            jr.execute();

            while (jr.next()){

                EntregaTb td =  EntregaTb.builder().Data_entrega(jr.getDate("DataEntrega"))
                        .Hora_Saida(jr.getTime("HoraSaida"))
                        .Hora_Entrada(jr.getTime("HoraChegada"))
                        .Id_Entregador(jr.getInt("Fkid_Entregador"))
                        .Id_Empresas(jr.getInt("Fkid_Empresas"))
                        .Id_Entrega(jr.getInt("pkid_entrega"))
                        .build();

                System.out.println(td);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }

}
