package ru.academits.dao;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

public class CallGenericDaoImpl<T, PK extends Serializable> implements CallGenericDao<T, PK> {
    @PersistenceContext
    protected EntityManager entityManager;

    protected Class<T> clazz;

    public CallGenericDaoImpl(Class<T> type) {
        this.clazz = type;
    }

    @Transactional
    @Override
    public void create(T obj) {
        entityManager.persist(obj);
    }
}