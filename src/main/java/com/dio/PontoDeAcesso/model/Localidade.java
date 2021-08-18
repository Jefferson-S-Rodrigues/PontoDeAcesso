package com.dio.PontoDeAcesso.model;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@ApiModel(value = "Localidade", description = "localidade")
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
