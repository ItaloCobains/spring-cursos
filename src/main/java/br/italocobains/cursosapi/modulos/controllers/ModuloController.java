package br.italocobains.cursosapi.modulos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.italocobains.cursosapi.modulos.ModuloEntity;
import br.italocobains.cursosapi.modulos.useCases.CreateModuloUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/modulos")
public class ModuloController {
  @Autowired
  private CreateModuloUseCase createModuloUseCase;

  @PostMapping()
  public ResponseEntity<Object> create(@Valid @RequestBody ModuloEntity moduloEntity) {
    try {
      var result = this.createModuloUseCase.execute(moduloEntity);
      return ResponseEntity.ok(result);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
