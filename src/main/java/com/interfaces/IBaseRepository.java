package com.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IBaseRepository<T> extends JpaRepository<T, Integer> {

}
