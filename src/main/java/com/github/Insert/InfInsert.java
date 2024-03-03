package com.github.Insert;

import com.github.ConnectionFactory.ConnectionFactory;
import jakarta.persistence.EntityManager;

public interface InfInsert<T> {

     EntityManager em = ConnectionFactory.GetConnection();

     T Insert(T obj);

}
