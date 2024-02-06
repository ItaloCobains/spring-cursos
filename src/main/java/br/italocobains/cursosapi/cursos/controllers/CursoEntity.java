package br.italocobains.cursosapi.cursos.controllers;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class CursoEntity {
  private UUID id;

  @NotBlank(message = "O nome do curso não pode estar em branco")
  private String nome;

  @NotBlank(message = "A descrição do curso não pode estar em branco")
  private String descricao;

  @PositiveOrZero(message = "A duração do curso deve ser um valor positivo ou zero")
  private int duracao;

  @PositiveOrZero(message = "O valor do curso deve ser um valor positivo ou zero")
  private double valor;

  @NotNull(message = "O campo ativo não pode ser nulo")
  private Boolean ativo;
}
