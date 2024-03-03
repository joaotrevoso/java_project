package com.github.Select.CriteriaSelect;

import com.github.Tables.Entregador;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class CriteriaSelectEntregador  implements InfCriteriaSelect<Entregador,String>{
    @Override
    public Entregador Select(String param) {

       CriteriaBuilder cb =  em.getCriteriaBuilder();

      CriteriaQuery<Entregador> cq =  cb.createQuery(Entregador.class);

      Root<Entregador> root = cq.from(Entregador.class);

      Predicate EscolaPredicate = cb.equal(root.get("Nome"),param);

      cq.where(EscolaPredicate);

      TypedQuery<Entregador> querry = em.createQuery(cq);

      return querry.getSingleResult();

    }
}
