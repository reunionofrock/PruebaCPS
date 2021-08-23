/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.apirest.dao.ClienteDao;
import com.code.apirest.entity.Cliente;



/**
 *
 * @author Legión
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    
      @Autowired
    private ClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        List<Cliente> listClientes= clienteDao.findAll();
        return listClientes;
    }

    @Override
    public Cliente findById(int id_cliente) {
        Cliente cliente = clienteDao.findById(id_cliente);
        return cliente;
    }

    @Override
    public void save(Cliente cliente) {
        clienteDao.save(cliente);

    }

    @Override
    public void deleteById(int id_cliente) {
        clienteDao.deleteById(id_cliente);
    }
///////////////////
    
    
}
