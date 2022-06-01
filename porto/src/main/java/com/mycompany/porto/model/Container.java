
package com.mycompany.porto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

/**
 *
 * @author Rafael&Lais
 */
@Entity
@Table(name = "tb_container")
public class Container {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Length(min = 4, max = 100)
    private String nome;
    
    @NotNull
    @Pattern(regexp = "[A-Z]{4}\\d{7}")
    private String numContainer;
    
    @NotNull
    @Range(min = 20, max = 40)
    private int tipo;
    
    @NotNull
    private boolean cheio;
    
    @NotNull
    private String Categoria;
    
    @OneToMany(mappedBy = "container", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("container")
    private List<Movimentacao> movimentacao;

    public List<Movimentacao> getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(List<Movimentacao> movimentacao) {
        this.movimentacao = movimentacao;
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

    public String getNumContainer() {
        return numContainer;
    }

    public void setNumContainer(String numContainer) {
        this.numContainer = numContainer;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isCheio() {
        return cheio;
    }

    public void setCheio(boolean cheio) {
        this.cheio = cheio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
}
