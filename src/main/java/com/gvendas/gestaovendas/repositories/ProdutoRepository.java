package com.gvendas.gestaovendas.repositories;

import com.gvendas.gestaovendas.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
