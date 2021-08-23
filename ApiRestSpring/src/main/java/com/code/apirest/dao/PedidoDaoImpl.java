/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.dao;

import javax.persistence.EntityManager;
import com.code.apirest.entity.Pedido;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Legión
 */
@Repository
public class PedidoDaoImpl implements PedidoDao{

    @Autowired
    private EntityManager entityManager;

   
     
     
    @Override
     public void save(Pedido  pedido) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(pedido);
        
    
        
        
     
     }

   
   
}
