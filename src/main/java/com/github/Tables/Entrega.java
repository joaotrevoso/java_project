package com.github.Tables;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Entrega;

    private Date Data_entrega;

    private Time Hora_Entrada;

    private Time Hora_Saida;

    private String Id_Empresas;

    @ManyToOne
    @JoinColumn(name = "fkid_entregador", foreignKey = @ForeignKey(name = "FK_entregador"),
            referencedColumnName = "IdEntregador",nullable = false)
    private Entregador entregador;

}
