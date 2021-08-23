/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.entity;

import javax.persistence.Table;


/**
 *
 * @author Legión
 */
//@Entity
@Table(name="pedido")
public class copyPedido {

  

   
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    //@Value("ID_PEDIDO")
    private int id_pedido;
    
    
    //@Value("ID_CLIENTE")
    private int id_cliente;
    
    //@Value("ID_TIPO_CLIENTE")
    private int id_tipo_cliente;
    
    //@Column(name="ID_PAQUETE")
    private int id_paquete;
    
    //@Column(name="ID_REGION")
    private int id_region;
    
    public copyPedido(){}

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_tipo_cliente() {
        return id_tipo_cliente;
    }

    public void setId_tipo_cliente(int id_tipo_cliente) {
        this.id_tipo_cliente = id_tipo_cliente;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", id_cliente=" + id_cliente + ", id_tipo_cliente=" + id_tipo_cliente + ", id_paquete=" + id_paquete + ", id_region=" + id_region + '}';
    }

   
    
}