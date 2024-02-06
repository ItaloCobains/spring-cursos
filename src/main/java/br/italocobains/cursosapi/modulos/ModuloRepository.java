package br.italocobains.cursosapi.modulos;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuloRepository extends JpaRepository<ModuloEntity, UUID> {
  Optional<ModuloEntity> findByNome(String nome);
}
