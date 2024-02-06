package br.italocobains.cursosapi.cursos;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.italocobains.cursosapi.cursos.controllers.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, UUID> {
  Optional<CursoEntity> findByNome(String nome);
}
