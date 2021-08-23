/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.controller;

import com.code.apirest.entity.Cliente;
import com.code.apirest.entity.Region;
import com.code.apirest.service.RegionService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Legión
 */

@RestController
@RequestMapping("/api")
public class RegionRestController {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RegionService regionService;
    
    
    /*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    //http://127.0.0.1:8080/api/regiones*/
    @GetMapping("/regiones")
    public List<Region> fingAll(){
         String sql = "SELECT * FROM dbo.REGION";
         List<Region> region = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Region.class));
         
        region.forEach(System.out::println);
       // return regionService.findAll();
       
       return region;
    }
}
