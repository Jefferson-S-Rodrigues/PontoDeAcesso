package com.dio.PontoDeAcesso.repository;

import com.dio.PontoDeAcesso.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}
