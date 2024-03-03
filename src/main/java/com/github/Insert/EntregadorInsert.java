package com.github.Insert;

import com.github.Tables.Entregador;

public class EntregadorInsert implements InfInsert<Entregador> {



    @Override
    public  Entregador Insert(Entregador obj) {

        try {

            em.getTransaction().begin();

            em.persist(obj);

            em.getTransaction().commit();


        }catch (Exception e){

            e.printStackTrace();


        }finally {

            em.close();

        }


        return obj;

    }

}
