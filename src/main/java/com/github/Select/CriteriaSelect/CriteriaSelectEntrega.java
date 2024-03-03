package com.github.Select.CriteriaSelect;

import com.github.Tables.Entrega;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.sql.Date;

public class CriteriaSelectEntrega implements InfCriteriaSelect<Entrega, Date>{
    @Override
    public Entrega Select(Date param) {

       CriteriaBuilder cb =  em.getCriteriaBuilder();

      CriteriaQuery<Entrega> cq =  cb.createQuery(Entrega.class);

      Root<Entrega> root = cq.from(Entrega.class);

      Predicate EscolaPredicate = cb.equal(root.get("Data_entrega"),param);

      cq.where(EscolaPredicate);

      TypedQuery<Entrega> querry = em.createQuery(cq);

      return querry.getSingleResult();

    }
}
