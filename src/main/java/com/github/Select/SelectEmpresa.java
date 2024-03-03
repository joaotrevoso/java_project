package com.github.Select;

import com.github.Tables.Empresa;


public class SelectEmpresa implements InfSelect<Empresa>{
    @Override
    public Empresa Select(int id) {

       return em.find(Empresa.class,id);

    }

}
