/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.porto.repository;


import com.mycompany.porto.model.Movimentacao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafael&Lais
 */
@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    
     public List<Movimentacao> findAllByNomeContainingIgnoreCase(String nome); /*buscar por tipo de movimentação*/
    
   
}
