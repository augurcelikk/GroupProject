package com.ugur.utility;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public class MyFactoryController<T,ID> implements ICrud<T,ID>{
    private Session session;
    private Transaction transaction;
    private CriteriaBuilder criteriaBuilder;
    private EntityManager entityManager;
    T t;

    public MyFactoryController(T entiy) {
        entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        criteriaBuilder = entityManager.getCriteriaBuilder();
        this.t = entiy;
    }

    @Override
    public T save(T entity) {
        return e ;
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entites) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.empty();
    }

    @Override
    public boolean existById(ID id) {
        return false;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public List<T> findByEntity(T entity) {
        return null;
    }

    @Override
    public List<T> findByColumnNameAndValue(String columnName, String value) {
        return null;
    }
}
