package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.Calendario;
import com.dio.PontoDeAcesso.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {


    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    public Calendario saveCalendario(Calendario calendarioTrabalho) {
        return calendarioRepository.save(calendarioTrabalho);

    }

    public List<Calendario> findAll() {
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> getById(Long idCalendario) {
        return calendarioRepository.findById(idCalendario);
    }

    public Calendario updateCalendario(Calendario calendarioTrabalho) {
        return calendarioRepository.save(calendarioTrabalho);

    }

    public void deleteCalendario(Long idCalendario) {
        calendarioRepository.deleteById(idCalendario);
    }
}
