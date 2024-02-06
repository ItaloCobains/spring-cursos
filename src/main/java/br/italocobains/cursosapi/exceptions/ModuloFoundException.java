package br.italocobains.cursosapi.exceptions;

public class ModuloFoundException extends RuntimeException {
  public ModuloFoundException() {
    super("Já existe um módulo com esse nome");
  }
}
