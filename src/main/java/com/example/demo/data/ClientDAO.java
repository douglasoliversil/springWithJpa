package com.example.demo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ClientDAO {

    @Autowired
    private EntityManager entityManager;

    public List<Client> findAll() {
        Query query = entityManager.createQuery("SELECT c FROM TB_CLIENT c");
        return query.getResultList();
    }

    @Transactional
    public void save(Client client) {
        entityManager.persist(client);
    }

}
