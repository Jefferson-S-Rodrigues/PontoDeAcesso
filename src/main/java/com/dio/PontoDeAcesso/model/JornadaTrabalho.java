package com.dio.PontoDeAcesso.model;

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
public class JornadaTrabalho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, unique = true)
    private String descricao;
}
