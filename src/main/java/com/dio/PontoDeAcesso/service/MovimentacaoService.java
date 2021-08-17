package com.dio.PontoDeAcesso.service;

import com.dio.PontoDeAcesso.model.Movimentacao;
import com.dio.PontoDeAcesso.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {


    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public Movimentacao saveMovimentacao(Movimentacao movimentacaoTrabalho) {
        return movimentacaoRepository.save(movimentacaoTrabalho);

    }

    public List<Movimentacao> findAll() {
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getById(Movimentacao.MovimentacaoId idMovimentacao) {
        return movimentacaoRepository.findById(idMovimentacao);
    }

    public Movimentacao updateMovimentacao(Movimentacao movimentacaoTrabalho) {
        return movimentacaoRepository.save(movimentacaoTrabalho);

    }

    public void deleteMovimentacao(Movimentacao.MovimentacaoId idMovimentacao) {
        movimentacaoRepository.deleteById(idMovimentacao);
    }
}
