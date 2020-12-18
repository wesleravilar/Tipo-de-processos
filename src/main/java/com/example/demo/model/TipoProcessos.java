package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;



@Entity
@Table(name ="TIPOPROCESSOS")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class TipoProcessos implements Serializable {

    @Id
    @Column (name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "TIPO_PROCESSOS")
    private String  tipo_de_processo;
    @Column (name = "NUMERO")
    private Integer numero;
    @Column (name = "NOME")
    private String nome;
    @Column (name ="DATA_ENTRADA")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date data_entrada;
    @Column (name = "VALOR_DO_RECURSO")
    private Integer valor_do_recurso;
    @Column (name = "OBJETIVO")
    private String objetivo;

    public TipoProcessos(Integer id, String tipo_de_processo, Integer numero, String nome, Date data_entrada, Integer valor_do_recurso, String objetivo) {
        this.id = id;
        this.tipo_de_processo = tipo_de_processo;
        this.numero = numero;
        this.nome = nome;
        this.data_entrada = data_entrada;
        this.valor_do_recurso = valor_do_recurso;
        this.objetivo = objetivo;
    }

    public TipoProcessos(){

}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_de_processo() {
        return tipo_de_processo;
    }

    public void setTipo_de_processo(String tipo_de_processo) {
        this.tipo_de_processo = tipo_de_processo;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_de_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Integer getValor_do_recurso() {
        return valor_do_recurso;
    }

    public void setValor_do_recurso(Integer valor_do_recurso) {
        this.valor_do_recurso = valor_do_recurso;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
