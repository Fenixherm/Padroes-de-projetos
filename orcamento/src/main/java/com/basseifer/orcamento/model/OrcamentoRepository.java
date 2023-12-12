package com.basseifer.orcamento.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrcamentoRepository  extends JpaRepository<Orcamento, Long> {
    //query(SELECT * FROM ORCAMENTO WHERE ROMANEIO=500)
    Orcamento findByromaneio(Integer romaneio);
}
