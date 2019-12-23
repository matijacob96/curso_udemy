package com.matijacob.springboot.backend.apirest.models.dao;

import com.matijacob.springboot.backend.apirest.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
