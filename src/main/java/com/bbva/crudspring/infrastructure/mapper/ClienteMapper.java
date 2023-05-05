package com.bbva.crudspring.infrastructure.mapper;

import com.bbva.crudspring.domain.Cliente;
import com.bbva.crudspring.infrastructure.mapper.entities.ClienteEntity;

public class ClienteMapper {

  public ClienteEntity toEntity(Cliente cliente) {
    ClienteEntity clienteEntity = new ClienteEntity();
    clienteEntity.setNombre(cliente.getNombre());
    clienteEntity.setApellido(cliente.getApellido());
    clienteEntity.setEmail(cliente.getEmail());
    return clienteEntity;
  }

  public Cliente toDomain(ClienteEntity clienteEntity) {
    Cliente cliente = new Cliente();
    cliente.setNombre(clienteEntity.getNombre());
    cliente.setApellido(clienteEntity.getApellido());
    cliente.setEmail(clienteEntity.getEmail());
    return cliente;
  }

}
