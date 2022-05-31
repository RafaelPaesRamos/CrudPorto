/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.porto.repository;

import com.mycompany.porto.model.Container;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 *
 * @author Rafael&Lais
 */
public interface ContainerRepository extends JpaRepository<Container, Long> {
    
    public List<Container> findAllByNomeContainingIgnoreCase(String nome);
    
    public List<Container> findAllByCategoriaContainingIgnoreCase(String categoria);
}
