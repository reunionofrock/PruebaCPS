/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Legión
 */

@Entity
@Table(name="region")
public class Region {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_region")
    private int id_region;
    
    
    @Column(name="nombre_region")
    private String nombre_region;
    
    public Region(){}
    
     public Region(int id_region, String nombre_region){
        
        this.id_region = id_region;
        this.nombre_region = nombre_region;
     }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    public String getNombre_region() {
        return nombre_region;
    }

    public void setNombre_region(String nombre_region) {
        this.nombre_region = nombre_region;
    }

    @Override
    public String toString() {
        return "Region{" + "id_region=" + id_region + ", nombre_region=" + nombre_region + '}';
    }
     
     
    
}
