package com.bbva.crudspring.application.controller;

import com.bbva.crudspring.application.usecase.IClienteCreateUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

  private final IClienteCreateUseCase clienteService;

  @Autowired
  public ClienteController(IClienteCreateUseCase clienteService) {
    this.clienteService = clienteService;
  }

  @GetMapping("/create")
  public String create() {
    return "Hola";
  }


}
