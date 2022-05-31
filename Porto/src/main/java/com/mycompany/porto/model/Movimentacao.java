/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.porto.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;



@Entity
@Table(name = "tb_movimentacao")
/**
 *
 * @author Rafael&Lais
 */
public class Movimentacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Length(min = 4, max = 100)
    private String nome; /*tipo de movimentação*/
    
    @NotNull
    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private LocalDateTime dataHoraInicio;
    
    @NotNull
    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private LocalDateTime dataHoraTermino;
    
    @ManyToOne
    @JsonIgnoreProperties("movimentacao")
    private Container contaner;

    public Container getContaner() {
        return contaner;
    }

    public void setContaner(Container contaner) {
        this.contaner = contaner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraTermino() {
        return dataHoraTermino;
    }

    public void setDataHoraTermino(LocalDateTime dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }

 

   
    
    
}
