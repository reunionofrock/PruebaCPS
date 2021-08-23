/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.dao;


import com.code.apirest.entity.Cliente;
import java.util.List;


/**
 *
 * @author Legión
 */
public interface ClienteDao {
    
    
    public List<Cliente> findAll();
    public Cliente findById(int id_cliente);
    public void save(Cliente cliente);
    public void deleteById(int id_cliente);
    
}
