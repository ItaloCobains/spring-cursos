package br.italocobains.cursosapi.modulos.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.italocobains.cursosapi.exceptions.ModuloFoundException;
import br.italocobains.cursosapi.exercicios.ExercicioRepository;
import br.italocobains.cursosapi.modulos.ModuloEntity;
import br.italocobains.cursosapi.modulos.ModuloRepository;

@Service
public class CreateModuloUseCase {

  @Autowired
  private ModuloRepository moduloRepository;

  @Autowired
  private ExercicioRepository exercicioRepository;

  public ModuloEntity execute(ModuloEntity moduloEntity) {
    this.moduloRepository.findByNome(moduloEntity.getNome()).ifPresent(modulo -> {
      throw new ModuloFoundException();
    });

    return this.moduloRepository.save(moduloEntity);
  }
}
