package com.github.Insert;

import com.github.Tables.Empresa;

public class EmpresaInsert implements InfInsert<Empresa> {
    @Override
    public Empresa Insert(Empresa obj) {
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
