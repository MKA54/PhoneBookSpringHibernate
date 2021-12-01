package ru.academits.dao;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

public interface CallGenericDao<T, PK extends Serializable> {
    @Transactional
    void create(T obj);
}