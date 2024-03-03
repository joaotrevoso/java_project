package com.github.Select.CriteriaSelect;

import com.github.Tables.Empresa;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class CriteriaSelectEmpresa implements InfCriteriaSelect<Empresa,String>{
    @Override
    public Empresa Select(String param) {

       CriteriaBuilder cb =  em.getCriteriaBuilder();

      CriteriaQuery<Empresa> cq =  cb.createQuery(Empresa.class);

      Root<Empresa> root = cq.from(Empresa.class);

      Predicate EscolaPredicate = cb.equal(root.get("NomeEmpresa"),param);

      cq.where(EscolaPredicate);

      TypedQuery<Empresa> querry = em.createQuery(cq);

      return querry.getSingleResult();

    }
}
