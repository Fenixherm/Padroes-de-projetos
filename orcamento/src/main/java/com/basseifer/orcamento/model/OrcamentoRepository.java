package com.basseifer.orcamento.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrcamentoRepository  extends JpaRepository<Orcamento, Long> {
    Orcamento findByromaneio(Integer romaneio);

    @Query("select o from Orcamento o where o.nomeCliente like %:nome%")
    List<Orcamento> findAllBynomeCliente(@Param("nome") String nome);
}
