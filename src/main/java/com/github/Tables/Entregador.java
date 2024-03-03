package com.github.Tables;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Builder
@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor

public class Entregador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEntregador;

    @NonNull
    private String Nome;

    @OneToMany(mappedBy = "entregador")
    private List<Entrega> entrega;


}
