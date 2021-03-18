package com.formatoweb.crudbasico17032021.service.impl;

import com.formatoweb.crudbasico17032021.entity.Cliente;
import com.formatoweb.crudbasico17032021.repository.ClienteRepository;
import com.formatoweb.crudbasico17032021.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
