package com.example.demo.dao;

import com.example.demo.model.TipoProcessos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// import com.devmedia.mvc.entity.Livro;

public interface FindByNomeAtributo extends
        JpaRepository<TipoProcessos, Long> {

    //    /**
//     * Encontra todos os livros de um mesmo autor.
//     *
//     * @param pessoa
//     * @return lista de livros
//     */
    List<TipoProcessos> findById(Number id);

    //    /**
//     * Encontra um livro a partir do seu título.
//     * Retorna uma lista pois podem existir
//     * mais de um livro com mesmo título.
//     *
//     * @param titulo
//     * @return lista de livros
//     */
    List<TipoProcessos> findByNome(String nome);

    //    /**
//     * Encontra um livro a partir de seu isbn, como o isbn é único,
//     apenas um livro pode ser encontrado.
//     *
//     * @param isbn
//     * @return livro
//     */
    List<TipoProcessos> findByNumero(Number numero);
}