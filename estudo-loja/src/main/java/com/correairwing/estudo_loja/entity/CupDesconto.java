package com.correairwing.estudo_loja.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "cup_desconto")
@SequenceGenerator(name = "cup_desconto_seq", sequenceName = "cup_desconto_seq", allocationSize = 1, initialValue = 1)
public class CupDesconto implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cup_desconto_seq")
    private Long id;
    

    private String codDescricao;

    private BigDecimal valorRealDesc;

    private BigDecimal valorPercDesc;
    
    @Temporal(TemporalType.DATE)
    private Date dataValidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodDescricao() {
        return codDescricao;
    }

    public void setCodDescricao(String codDescricao) {
        this.codDescricao = codDescricao;
    }

    public BigDecimal getValorRealDesc() {
        return valorRealDesc;
    }

    public void setValorRealDesc(BigDecimal valorRealDesc) {
        this.valorRealDesc = valorRealDesc;
    }

    public BigDecimal getValorPercDesc() {
        return valorPercDesc;
    }

    public void setValorPercDesc(BigDecimal valorPercDesc) {
        this.valorPercDesc = valorPercDesc;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        CupDesconto other = (CupDesconto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
