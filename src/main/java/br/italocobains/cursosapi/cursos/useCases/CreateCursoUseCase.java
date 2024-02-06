package br.italocobains.cursosapi.cursos.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.italocobains.cursosapi.cursos.CursoRepository;
import br.italocobains.cursosapi.cursos.controllers.CursoEntity;
import br.italocobains.cursosapi.exceptions.CursoFoundException;

@Service
public class CreateCursoUseCase {
  @Autowired
  private CursoRepository cursoRepository;

  public CursoEntity execute(CursoEntity cursoEntity) {
    this.cursoRepository.findByNome(cursoEntity.getNome())
        .ifPresent((user) -> {
          throw new CursoFoundException();
        });
    return this.cursoRepository.save(cursoEntity);
  }
}
