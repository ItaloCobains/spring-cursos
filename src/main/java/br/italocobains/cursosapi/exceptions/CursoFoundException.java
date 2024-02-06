package br.italocobains.cursosapi.exceptions;

public class CursoFoundException extends RuntimeException {
  public CursoFoundException() {
    super("Curso já existe");
  }
}
