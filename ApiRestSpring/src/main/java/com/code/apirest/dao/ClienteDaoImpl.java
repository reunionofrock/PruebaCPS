/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.dao;

import com.code.apirest.entity.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Legión
 */

@Repository
class ClienteDaoImpl implements ClienteDao{

    @Autowired
    private EntityManager entityManager;
    
    
    @Override
    public List<Cliente> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Cliente> theQuery = currentSession.createQuery("FROM dbo.CLIENTE", Cliente.class);
        
    List<Cliente> clientes = theQuery.getResultList();
        return clientes;
    }
    
        

    @Override
    public Cliente findById(int id_cliente) {
       Session currentSession = entityManager.unwrap(Session.class);
       Cliente cliente = currentSession.get(Cliente.class, id_cliente);
       
       return cliente;
        
        
    }

    @Override
    public void save(Cliente cliente) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(cliente);
    }

    @Override
    public void deleteById(int id_cliente) {
        Session currentSession = entityManager.unwrap(Session.class);
         Query<ClienteDaoImpl> theQuery = currentSession.createQuery("DELETE FROM dbo.CLIENTE WHERE id_cliente=:ID_CLIENTE");
         theQuery.setParameter("ID_CLIENTE", id_cliente);
         theQuery.executeUpdate();
    }
    
}
