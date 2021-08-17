package com.dio.PontoDeAcesso.repository;

import com.dio.PontoDeAcesso.model.BancoHoras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, BancoHoras.BancoHorasId> {
}
