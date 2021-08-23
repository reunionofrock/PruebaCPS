/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.dao;


import com.code.apirest.entity.Pedido;

/**
 *
 * @author Legión
 */

public interface PedidoDao {
    
    /**
     *
     * @param pedido
     */
    public void save(Pedido pedido);
    
}
