package com.mycompany.DbApi.DbUtilites;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;

public class RowSet implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {

        System.out.println();
        System.out.println("Sla oq acoteceu");
        System.out.println();

    }

    @Override
    public void rowChanged(RowSetEvent event) {

        System.out.println();
        System.out.println("Linha mudada");
        System.out.println();

    }

    @Override
    public void cursorMoved(RowSetEvent event) {

        System.out.println();
        System.out.println("Ponteiro movido");
        System.out.println();
    }
}
