package br.italocobains.cursosapi.exercicios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<ExercicioEntity, UUID> {
  
}
