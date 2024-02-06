package br.italocobains.cursosapi.cursos.controllers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Entity(name = "cursos")
public class CursoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
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

  @CreationTimestamp
  private LocalDateTime createdAt;
}
