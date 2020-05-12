package com.cursomc.abstratos;

import java.util.Optional;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.interfaces.IBaseRepository;

@MappedSuperclass
@Service
public abstract class ABaseService<T, E> {
	
	@Autowired
	public E repo;
	
	public T buscar(Integer id) {
		Optional<T> obj = ((IBaseRepository)repo).findById(id);
		return obj.orElse(null);
	}
}