package com.correairwing.estudo_loja.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_produto")
@SequenceGenerator(name = "categoria_produto_seq", sequenceName = "categoria_produto_seq", allocationSize = 1, initialValue = 1)
public class CategoriaProduto {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_produto_seq")
    private Long id;

    private String nomeDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDesc() {
        return nomeDesc;
    }

    public void setNomeDesc(String nomeDesc) {
        this.nomeDesc = nomeDesc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nomeDesc == null) ? 0 : nomeDesc.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CategoriaProduto other = (CategoriaProduto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nomeDesc == null) {
            if (other.nomeDesc != null)
                return false;
        } else if (!nomeDesc.equals(other.nomeDesc))
            return false;
        return true;
    }




}
