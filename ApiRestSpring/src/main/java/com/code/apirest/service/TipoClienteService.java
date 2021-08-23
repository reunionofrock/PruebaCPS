/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.service;

import com.code.apirest.entity.Cliente;
import com.code.apirest.entity.TipoCliente;
import java.util.List;

/**
 *
 * @author Legión
 */


public interface TipoClienteService {
    
     public List<TipoCliente> findAll();
}
