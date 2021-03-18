package com.formatoweb.crudbasico17032021.controller;

import com.formatoweb.crudbasico17032021.entity.Cliente;
import com.formatoweb.crudbasico17032021.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public List<Cliente> clientes(){
        return clienteService.getClientes();
    }

    @PostMapping("/cliente")
    public Cliente saveCliente(Cliente cliente){
        return clienteService.saveCliente(cliente);
    }
}
