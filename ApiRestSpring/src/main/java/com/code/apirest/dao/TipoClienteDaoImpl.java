/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.dao;


import com.code.apirest.entity.TipoCliente;
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
public class TipoClienteDaoImpl implements TipoClienteDao{

    
    @Autowired
    private EntityManager entityManager;
    
    
    @Override
    public List<TipoCliente> findAll() {
       
        Session currentSession = entityManager.unwrap(Session.class);

        Query<TipoCliente> theQuery = currentSession.createQuery("FROM REGION", TipoCliente.class);

        List<TipoCliente> tipoCliente = theQuery.getResultList();

        return tipoCliente;
    }
    
    
    
}
