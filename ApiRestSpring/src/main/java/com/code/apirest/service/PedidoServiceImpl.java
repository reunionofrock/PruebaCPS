/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.service;

import com.code.apirest.dao.PedidoDao;

import com.code.apirest.entity.Pedido;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Service;

/**
 *
 * @author Legión
 */
@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    
    private PedidoDao pedidoDao;
 
    @Override
    public void save(Pedido pedido) {
       
         pedidoDao.save(pedido);
      

    }

  
    
}
