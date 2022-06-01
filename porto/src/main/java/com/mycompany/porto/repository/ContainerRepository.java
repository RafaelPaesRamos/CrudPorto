
package com.mycompany.porto.repository;

import com.mycompany.porto.model.Container;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafael&Lais
 */
@Repository
public interface ContainerRepository extends JpaRepository<Container, Long> {
    
    public List<Container> findAllByContainingIgnoreCase(String nome);
    
    public List<Container> findAllByCategoriaContainingIgnoreCase(String categoria);
}
