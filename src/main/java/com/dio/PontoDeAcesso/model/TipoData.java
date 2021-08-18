package com.dio.PontoDeAcesso.model;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@ApiModel(value = "Tipo de Data", description = "tipo de data")
public class TipoData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descricao;
}
