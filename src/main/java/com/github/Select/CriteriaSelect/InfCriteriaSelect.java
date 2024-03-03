package com.github.Select.CriteriaSelect;

import com.github.ConnectionFactory.ConnectionFactory;
import jakarta.persistence.EntityManager;

public interface InfCriteriaSelect <T,U>{

    EntityManager em = ConnectionFactory.GetConnection();
    T Select(U param);

}
