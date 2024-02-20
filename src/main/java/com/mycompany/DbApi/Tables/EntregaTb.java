package com.mycompany.DbApi.Tables;


import lombok.Builder;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Builder

public class EntregaTb {

    private int Id_Entrega;

    private Date Data_entrega;

    private Time Hora_Entrada;

    private Time Hora_Saida;

    private int Id_Empresa;

    private int Id_Entregador;

    public EntregaTb(int id_Entrega, Date data_entrega, Time hora_Entrada, Time hora_Saida, int id_Entregador) {
        Id_Entrega = id_Entrega;
        Data_entrega = data_entrega;
        Hora_Entrada = hora_Entrada;
        Hora_Saida = hora_Saida;
        Id_Entregador = id_Entregador;
    }

    public EntregaTb(int id_Entrega, Date data_entrega, Time hora_Entrada, Time hora_Saida, int id_Empresa, int id_Entregador) {
        Id_Entrega = id_Entrega;
        Data_entrega = data_entrega;
        Hora_Entrada = hora_Entrada;
        Hora_Saida = hora_Saida;
        Id_Empresa = id_Empresa;
        Id_Entregador = id_Entregador;
    }

    @Override
    public String toString() {
        return "EntregaTb{" +
                "Id_Entrega=" + Id_Entrega +
                ", Data_entrega=" + Data_entrega +
                ", Hora_Entrada=" + Hora_Entrada +
                ", Hora_Saida=" + Hora_Saida +
                ", Id_Empresa=" + Id_Empresa +
                ", Id_Entregador=" + Id_Entregador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntregaTb entregaTb = (EntregaTb) o;

        if (Id_Entrega != entregaTb.Id_Entrega) return false;
        if (Id_Empresa != entregaTb.Id_Empresa) return false;
        if (Id_Entregador != entregaTb.Id_Entregador) return false;
        if (!Objects.equals(Data_entrega, entregaTb.Data_entrega))
            return false;
        if (!Objects.equals(Hora_Entrada, entregaTb.Hora_Entrada))
            return false;
        return Objects.equals(Hora_Saida, entregaTb.Hora_Saida);
    }

    @Override
    public int hashCode() {
        int result = Id_Entrega;
        result = 31 * result + (Data_entrega != null ? Data_entrega.hashCode() : 0);
        result = 31 * result + (Hora_Entrada != null ? Hora_Entrada.hashCode() : 0);
        result = 31 * result + (Hora_Saida != null ? Hora_Saida.hashCode() : 0);
        result = 31 * result + Id_Empresa;
        result = 31 * result + Id_Entregador;
        return result;
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

    public int getId_Empresa() {
        return Id_Empresa;
    }

    public int getId_Entregador() {
        return Id_Entregador;
    }
}
