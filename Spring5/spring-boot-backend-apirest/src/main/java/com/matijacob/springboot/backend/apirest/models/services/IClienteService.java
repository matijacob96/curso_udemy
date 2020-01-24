package com.matijacob.springboot.backend.apirest.models.services;

import com.matijacob.springboot.backend.apirest.models.entity.Cliente;
import com.matijacob.springboot.backend.apirest.models.entity.Factura;
import com.matijacob.springboot.backend.apirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pegeable);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente findById(Long id);

    public List<Region> findAllRegiones();

    public Factura findFacturaById(Long id);

    public Factura saveFactura(Factura factura);

    public void deleteFacturaById(Long id);
}
