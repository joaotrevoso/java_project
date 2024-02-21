package com.mycompany.DbApi.Tables;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Builder
public class EntregadorTb {

    @Getter
    private String nome;
    @Getter
    private int Id_Entrehgador;

    public EntregadorTb(String nome, int id_Entrehgador) {
        this.nome = nome;
        Id_Entrehgador = id_Entrehgador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntregadorTb that = (EntregadorTb) o;

        if (Id_Entrehgador != that.Id_Entrehgador) return false;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + Id_Entrehgador;
        return result;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId_Entrehgador(int id_Entrehgador) {
        Id_Entrehgador = id_Entrehgador;
    }
}
