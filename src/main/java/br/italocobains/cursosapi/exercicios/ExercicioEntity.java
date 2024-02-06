package br.italocobains.cursosapi.exercicios;

import java.util.UUID;

import br.italocobains.cursosapi.modulos.ModuloEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Entity(name = "exercicios")
public class ExercicioEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @NotBlank(message = "O nome do exercício é obrigatório")
  private String nome;

  private String descricao;

  @ManyToOne()
  @JoinColumn(name = "modulo_id", insertable = false, updatable = false)
  private ModuloEntity modulo;

  @NotNull(message = "O ID do módulo é obrigatório")
  @Column(name = "modulo_id", nullable = false)
  private UUID moduloId;

  @Positive(message = "A ordem deve ser um número positivo")
  private int ordem;

  private boolean ativo;

  @NotBlank(message = "O tipo do exercício é obrigatório")
  private String tipo;

  @NotBlank(message = "O enunciado do exercício é obrigatório")
  private String enunciado;

  @NotBlank(message = "A resposta do exercício é obrigatória")
  private String resposta;

  private String alternativas;

  private String dica;
}
