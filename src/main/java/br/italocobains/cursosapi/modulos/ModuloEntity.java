package br.italocobains.cursosapi.modulos;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name = "modulos")
public class ModuloEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @NotBlank(message = "O nome do módulo é obrigatório")
  private String nome;

  private String descricao;

  @NotNull(message = "A ordem do módulo é obrigatória")
  private int ordem;

  @NotNull(message = "O módulo deve estar ativo ou inativo")
  private boolean ativo;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
