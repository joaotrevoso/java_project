package com.mycompany.DbApi.Tables;

import lombok.*;

import java.net.http.WebSocket;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
public class EmpresaTb{


    @Setter(AccessLevel.PRIVATE) private String NomeEmpresa;

    @Setter(AccessLevel.PRIVATE) private String LocalizacaoEmpresa;

    @Setter(AccessLevel.PRIVATE)private int IdEmpresa;


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


}
