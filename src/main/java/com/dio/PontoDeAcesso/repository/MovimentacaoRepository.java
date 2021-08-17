package com.dio.PontoDeAcesso.repository;

import com.dio.PontoDeAcesso.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Movimentacao.MovimentacaoId> {
}
