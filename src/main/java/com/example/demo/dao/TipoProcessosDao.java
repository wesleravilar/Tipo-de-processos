package com.example.demo.dao;

import com.example.demo.model.TipoProcessos;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface TipoProcessosDao extends JpaRepository<TipoProcessos,Integer> {
    TipoProcessos save(TipoProcessos tipoProcessos);


}



