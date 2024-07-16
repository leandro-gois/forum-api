package com.leandro.Forum_Hub.repository;

import com.leandro.Forum_Hub.domain.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    boolean existsByTitulo(String titulo);
    boolean existsByMensagem(String mensagem);

    List<Topico> findAllByOrderByDataCriacaoDesc();
}