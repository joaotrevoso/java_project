package com.github.Select;

import com.github.ConnectionFactory.ConnectionFactory;
import jakarta.persistence.EntityManager;

public interface InfSelect <T>{

    EntityManager em = ConnectionFactory.GetConnection();

    T Select(int id);

}
