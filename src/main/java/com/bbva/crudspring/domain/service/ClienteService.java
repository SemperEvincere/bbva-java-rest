package com.bbva.crudspring.domain.service;

import com.bbva.crudspring.application.repository.IClienteRepository;
import com.bbva.crudspring.application.usecase.IClienteCreateUseCase;
import com.bbva.crudspring.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteCreateUseCase {

  private IClienteRepository clienteRepository;
  @Override
  public Cliente create(Cliente cliente) {
    return clienteRepository.create(cliente);
  }
}
