package com.matijacob.springboot.backend.apirest.models.services;

import com.matijacob.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pegeable);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente findById(Long id);
}
