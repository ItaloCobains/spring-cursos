package br.italocobains.cursosapi.cursos.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cursos")
public class CursoController {
  @PostMapping()
  public CursoEntity create(@Valid @RequestBody CursoEntity cursoEntity) {
    System.out.println(cursoEntity);
    return cursoEntity;
  }
}
