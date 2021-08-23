/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.service;

import com.code.apirest.dao.RegionDao;
import com.code.apirest.entity.Region;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Legión
 */

@Service
public class RegionServiceImpl implements RegionService {
    
    @Autowired
    private RegionDao regionDao;
    @Override
    public List<Region> findAll() {
       
        List<Region> listRegiones = regionDao.findAll();
        
        return listRegiones;
    }
    
}
