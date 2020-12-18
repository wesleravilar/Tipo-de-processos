package com.example.demo.service;

import com.example.demo.dao.TipoProcessosDao;
import com.example.demo.model.TipoProcessos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.web.servlet.RequestBuilder;

import javax.servlet.ServletContext;
import java.util.List;

//@EnableJpaRepositories
@Service
//@Component
public class TipoProcessosService {
    @Autowired
    TipoProcessosDao tipoProcessosDao;

    public List<TipoProcessos> buscatipoProcessos() {
        return tipoProcessosDao.findAll();
    }

    public Integer salvatipoProcessos(TipoProcessos tipoProcessos) {
        return (Integer) tipoProcessosDao.save(tipoProcessos).getId();

    }

    public void deletatipoProcessos(Integer id) {
        TipoProcessos tipoProcessos = tipoProcessosDao.getOne(id);
        tipoProcessosDao.delete(tipoProcessos);
    }
}