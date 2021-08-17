package com.dio.PontoDeAcesso.repository;

import com.dio.PontoDeAcesso.model.TipoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}
