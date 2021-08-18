package com.dio.PontoDeAcesso.model;

import io.swagger.annotations.ApiModel;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
@ApiModel(value = "Jornada de Trabalho", description = "jornada de trabalho")
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, unique = true)
    private String descricao;
}
