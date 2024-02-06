package br.italocobains.cursosapi.exercicios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.italocobains.cursosapi.exercicios.ExercicioEntity;
import br.italocobains.cursosapi.exercicios.useCases.CreateExercicioUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {
  @Autowired
  private CreateExercicioUseCase createExercicioUseCase;

  @PostMapping()
  public ExercicioEntity create(@Valid @RequestBody ExercicioEntity exercicioEntity) {
    return this.createExercicioUseCase.execute(exercicioEntity);
  }
}
