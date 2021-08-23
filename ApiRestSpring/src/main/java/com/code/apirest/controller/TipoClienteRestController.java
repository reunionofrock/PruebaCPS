/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.controller;

import com.code.apirest.entity.Region;
import com.code.apirest.entity.TipoCliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Legión
 */

@RestController
@RequestMapping("/api")
public class TipoClienteRestController{
    
     @Autowired
    private JdbcTemplate jdbcTemplate;
    
     
      /*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    //http://127.0.0.1:8080/api/tipocliente*/
    @GetMapping("/tipocliente")
    public List<TipoCliente> fingAll(){
         String sql = "SELECT * FROM dbo.TIPO_CLIENTE";
         List<TipoCliente> tipocliente = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(TipoCliente.class));
         
        tipocliente.forEach(System.out::println);
       // return regionService.findAll();
       
       return tipocliente;
    }
}
