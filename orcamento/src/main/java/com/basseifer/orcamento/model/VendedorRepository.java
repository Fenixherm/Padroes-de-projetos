package com.basseifer.orcamento.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Long> {
}
