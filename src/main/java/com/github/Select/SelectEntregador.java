package com.github.Select;

import com.github.Tables.Entregador;

public class SelectEntregador implements InfSelect<Entregador>{
    @Override
    public Entregador Select(int id) {

       return em.find(Entregador.class,id);

    }

}
