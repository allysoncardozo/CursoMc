package com.cursomc.services;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cursomc.abstratos.ABaseService;
import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService extends ABaseService<Categoria, CategoriaRepository> {

}
