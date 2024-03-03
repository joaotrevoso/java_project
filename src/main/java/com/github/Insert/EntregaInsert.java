package com.github.Insert;

import com.github.Tables.Entrega;

public class EntregaInsert implements InfInsert<Entrega> {



    @Override
    public  Entrega Insert(Entrega obj) {

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
