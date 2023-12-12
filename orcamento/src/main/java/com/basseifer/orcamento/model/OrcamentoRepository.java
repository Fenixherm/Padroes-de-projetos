package com.basseifer.orcamento.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcamentoRepository  extends JpaRepository<Orcamento, Long> {
}
