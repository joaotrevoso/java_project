package com.mycompany.DbApi.Tables;

import lombok.*;

import java.net.http.WebSocket;
import java.util.Objects;

@Builder
@AllArgsConstructor
public class EmpresaTb{


    private String NomeEmpresa;

    private String LocalizacaoEmpresa;

    private int IdEmpresa;

//    public EmpresaTb(String nomeEmpresa, String localizacaoEmpresa, int idEmpresa) {
//        NomeEmpresa = nomeEmpresa;
//        LocalizacaoEmpresa = localizacaoEmpresa;
//        IdEmpresa = idEmpresa;
//    }

    public EmpresaTb(String nomeEmpresa, int idEmpresa) {
        NomeEmpresa = nomeEmpresa;
        IdEmpresa = idEmpresa;
    }

    public String getNomeEmpresa() {
        return NomeEmpresa;
    }

    public String getLocalizacaoEmpresa() {
        return LocalizacaoEmpresa;
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaTb empresaTb = (EmpresaTb) o;
        return IdEmpresa == empresaTb.IdEmpresa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdEmpresa);
    }

    @Override
    public String toString() {
        return "EmpresaTb{" +
                "NomeEmpresa='" + NomeEmpresa + '\'' +
                ", LocalizacaoEmpresa='" + LocalizacaoEmpresa + '\'' +
                ", IdEmpresa=" + IdEmpresa +
                '}';
    }
}
