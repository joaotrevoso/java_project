package com.mycompany.DbApi.Tables;

import lombok.*;

import java.sql.Date;

@Builder
@AllArgsConstructor
@Data
public class Empresas_Entrega {

    @Getter
    private int idEmpresas_Entrega;

    @Getter
    private String fkEmpresas_id;

    @Getter
    private Date Data_Entrega;
    

}
