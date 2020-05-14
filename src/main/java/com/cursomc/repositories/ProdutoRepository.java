package com.cursomc.repositories;

import org.springframework.stereotype.Repository;

import com.cursomc.domain.Produto;
import com.interfaces.IBaseRepository;

@Repository
public interface ProdutoRepository extends IBaseRepository<Produto>{

}