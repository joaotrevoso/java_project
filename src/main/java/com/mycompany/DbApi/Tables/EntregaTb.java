package com.mycompany.DbApi.Tables;


import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Builder
@Data

public class EntregaTb {

    private int Id_Entrega;

    private Date Data_entrega;

    private Time Hora_Entrada;

    private Time Hora_Saida;

    private String Id_Empresas;

    private int Id_Entregador;

    public EntregaTb(Date data_entrega, Time hora_Saida, String id_Empresas, int id_Entregador) {
        Data_entrega = data_entrega;
        Hora_Saida = hora_Saida;
        Id_Empresas = id_Empresas;
        Id_Entregador = id_Entregador;
    }

    public EntregaTb(int id_Entrega, Date data_entrega, Time hora_Entrada, Time hora_Saida, int id_Entregador) {
        Id_Entrega = id_Entrega;
        Data_entrega = data_entrega;
        Hora_Entrada = hora_Entrada;
        Hora_Saida = hora_Saida;
        Id_Entregador = id_Entregador;
    }

    public EntregaTb(int id_Entrega, Date data_entrega, Time hora_Entrada, Time hora_Saida, String id_Empresa, int id_Entregador) {
        Id_Entrega = id_Entrega;
        Data_entrega = data_entrega;
        Hora_Entrada = hora_Entrada;
        Hora_Saida = hora_Saida;
        Id_Empresas = id_Empresa;
        Id_Entregador = id_Entregador;
    }

    @Override
    public String toString() {
        return "EntregaTb{" +
                "Id_Entrega=" + Id_Entrega +
                ", Data_entrega=" + Data_entrega +
                ", Hora_Entrada=" + Hora_Entrada +
                ", Hora_Saida=" + Hora_Saida +
                ", Id_Empresa=" + Id_Empresas +
                ", Id_Entregador=" + Id_Entregador +
                '}';
    }




    public int getId_Entrega() {
        return Id_Entrega;
    }

    public Date getData_entrega() {
        return Data_entrega;
    }

    public Time getHora_Entrada() {
        return Hora_Entrada;
    }

    public Time getHora_Saida() {
        return Hora_Saida;
    }

    public String getId_Empresas() {
        return Id_Empresas;
    }

    public int getId_Entregador() {
        return Id_Entregador;
    }
}
