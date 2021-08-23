/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.controller;

import com.code.apirest.entity.Pedido;
import com.code.apirest.entity.copyPedido;

import com.code.apirest.service.PedidoService;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Legión
 */
@RestController
@RequestMapping("/formulario")
public class PedidoRestController {    
    
   // String timestamp = new SimpleDateFormat("YYYYMMddHHmmSS").format(Calendar.getInstance().getTime());
   // String serial = timestamp.toString();
    //int serialnumber = Integer.parseInt(serial);
        @Autowired
            private JdbcTemplate jdbcTemplate;
            private PedidoService pedidoService;
     
            
            /*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    //http://127.0.0.1:8080/api/pedido  */        
    @PostMapping(path="/pedido", consumes = {MediaType.APPLICATION_JSON_VALUE},produces ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Pedido> addPedido(@RequestBody copyPedido copypedido) throws URISyntaxException{
     
        Pedido p2 = new Pedido();
         //String sql = "INSERT INTO dbo.PEDIDO(ID_PEDIDO, ID_CLIENTE, ID_TIPO_CLIENTE, ID_PAQUETE, ID_REGION)VALUES (?, ?, ?, ?, ?)";
         
         
       // System.out.println(copypedido.setId_pedido(p2.getId_pedido()));
        
        p2.setId_pedido(copypedido.getId_pedido());
        p2.setId_cliente(copypedido.getId_cliente());
        p2.setId_tipo_cliente(copypedido.getId_tipo_cliente());
        p2.setId_paquete(copypedido.getId_paquete());
        p2.setId_region(copypedido.getId_region());
        
        System.out.println(copypedido.getId_cliente());
        
        
   String sql = "INSERT INTO dbo.PEDIDO(ID_PEDIDO, ID_CLIENTE, ID_TIPO_CLIENTE, ID_PAQUETE, ID_REGION)VALUES (?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                p2.getId_pedido(),
                p2.getId_cliente(),
                p2.getId_tipo_cliente(),
                p2.getId_paquete(),
                p2.getId_region());
        
     
        pedidoService.save(p2);
        
        System.out.println("Pedido Generado con exito");
        // return pedido;
        
        return new ResponseEntity<Pedido>(p2,HttpStatus.OK);
    }
}
