/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.code.apirest.controller;

import com.code.apirest.entity.Cliente;
import com.code.apirest.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Legión
 */
@RestController
@RequestMapping("/api")

public class ClienteRestController {

    //Inyectamos el servicio para poder hacer uso de el
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private ClienteService clienteService;

    /*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    //http://127.0.0.1:8080/api/cliente*/
    @GetMapping("/cliente")
    public List<Cliente> findAll(){
        String sql = "SELECT * FROM dbo.CLIENTE";
        List<Cliente> cliente = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Cliente.class));
         
        cliente.forEach(System.out::println);
        //retornará todos los usuarios
   
      return cliente;
    }

    /*/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un usuario
    http://127.0.0.1:8080/api/cliente/1
    @GetMapping("/clientes/{id_cliente}")
    public Cliente getCliente(@PathVariable int id_cliente){
         String sql = "SELECT * FROM dbo.CLIENTE WHERE ID_CLIENTE ="+id_cliente;
       // Cliente cliente = clienteService.findById(id_cliente);
       cliente= sql, BeanPropertyRowMapper.newInstance(Cliente.class));
         cliente = (System.out::println);

        if(cliente == null) {
            throw new RuntimeException("User id not found -"+id_cliente);
        }
        //retornará al usuario con id pasado en la url
        return cliente;
    }

    /*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    //http://127.0.0.1:8080/api/users/  */
    @PostMapping("/clientes")
    public Cliente addCliente(@RequestBody Cliente cliente) {
      //  cliente.setId_cliente(0);

        //Este metodo guardará al usuario enviado
        clienteService.save(cliente);

        return cliente;

    }
    /*Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/clientes/  
    @PutMapping("/clientes")
    public Cliente updateCliente(@RequestBody Cliente cliente) {

        clienteService.save(cliente);

        //este metodo actualizará al usuario enviado

        return cliente;
    }

    /*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del usuario
    http://127.0.0.1:8080/api/clientes/1  
    @DeleteMapping("clientes/{id_cliente}")
    public String deteteCliente(@PathVariable int id_cliente) {

        Cliente cliente = clienteService.findById(id_cliente);

        if(cliente == null) {
            throw new RuntimeException("User id not found -"+id_cliente);
        }

        clienteService.deleteById(id_cliente);

        //Esto método, recibira el id de un usuario por URL y se borrará de la bd.
        return "Deleted user id - "+id_cliente;
    }
*/
}

