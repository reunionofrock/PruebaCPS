/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.service;


import com.code.apirest.dao.TipoClienteDao;
import com.code.apirest.entity.TipoCliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Legión
 */
public class TipoClienteServiceImpl implements TipoClienteService {

      
    @Autowired
    private TipoClienteDao tipoClienteDao;

    @Override
    public List<TipoCliente> findAll() {
        List<TipoCliente> listTipoClientes= tipoClienteDao.findAll();
        return listTipoClientes;
    }
    
}
