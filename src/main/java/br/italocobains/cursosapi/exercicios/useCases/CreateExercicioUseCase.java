package br.italocobains.cursosapi.exercicios.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.italocobains.cursosapi.exercicios.ExercicioEntity;
import br.italocobains.cursosapi.exercicios.ExercicioRepository;

@Service
public class CreateExercicioUseCase {
  @Autowired
  private ExercicioRepository exercicioRepository;

  @SuppressWarnings("null")
  public ExercicioEntity execute(ExercicioEntity exercicioEntity) {
    return this.exercicioRepository.save(exercicioEntity);
  }
}
