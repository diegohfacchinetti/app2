/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1513 IRON
 */
@Entity
@Table(name = "itens_compra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItensCompra.findAll", query = "SELECT i FROM ItensCompra i")
    , @NamedQuery(name = "ItensCompra.findById", query = "SELECT i FROM ItensCompra i WHERE i.id = :id")
    , @NamedQuery(name = "ItensCompra.findByIdCompra", query = "SELECT i FROM ItensCompra i WHERE i.idCompra = :idCompra")
    , @NamedQuery(name = "ItensCompra.findByIdProd", query = "SELECT i FROM ItensCompra i WHERE i.idProd = :idProd")
    , @NamedQuery(name = "ItensCompra.findByQtd", query = "SELECT i FROM ItensCompra i WHERE i.qtd = :qtd")
    , @NamedQuery(name = "ItensCompra.findByValor", query = "SELECT i FROM ItensCompra i WHERE i.valor = :valor")})
public class ItensCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_prod")
    private Integer idProd;
    @Column(name = "qtd")
    private Integer qtd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private Double valor;

    public ItensCompra() {
    }

    public ItensCompra(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProd() {
        return idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensCompra)) {
            return false;
        }
        ItensCompra other = (ItensCompra) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.ItensCompra[ id=" + id + " ]";
    }
    
}
