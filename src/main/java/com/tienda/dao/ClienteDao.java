package com.tienda.dao;

import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente,Long> {
    public List<Cliente> findByIdCliente(String idCliente);
    
    public List<Cliente> findByApellidos(String apellidos);
}
