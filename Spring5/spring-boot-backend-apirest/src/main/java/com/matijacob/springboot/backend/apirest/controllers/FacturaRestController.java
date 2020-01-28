package com.matijacob.springboot.backend.apirest.controllers;


import com.matijacob.springboot.backend.apirest.models.entity.Factura;
import com.matijacob.springboot.backend.apirest.models.entity.Producto;
import com.matijacob.springboot.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200","*"})
@RestController
@RequestMapping("/api")
public class FacturaRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/facturas/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Secured({"ROLE_ADMIN","ROLE_USER"})
    public Factura show(@PathVariable Long id){
        return clienteService.findFacturaById(id);
    }

    @DeleteMapping("/facturas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Secured({"ROLE_ADMIN"})
    public void delete(@PathVariable Long id){
        clienteService.deleteFacturaById(id);
    }

    @Secured({"ROLE_ADMIN"})
    @GetMapping("/facturas/filtrar-productos/{term}")
    @ResponseStatus(HttpStatus.OK)
    public List<Producto> filtrarProducto(@PathVariable String term){
        return clienteService.findProductoByNombre(term);
    }

    @Secured({"ROLE_ADMIN"})
    @PostMapping("/facturas")
    @ResponseStatus(HttpStatus.CREATED)
    public Factura crear(@RequestBody Factura factura){
        return clienteService.saveFactura(factura);
    }
}
