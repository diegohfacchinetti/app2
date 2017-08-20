/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findByCodProd", query = "SELECT p FROM Produto p WHERE p.codProd = :codProd")
    , @NamedQuery(name = "Produto.findByDesProd", query = "SELECT p FROM Produto p WHERE p.desProd = :desProd")
    , @NamedQuery(name = "Produto.findByCustoProd", query = "SELECT p FROM Produto p WHERE p.custoProd = :custoProd")
    , @NamedQuery(name = "Produto.findByIndiceProd", query = "SELECT p FROM Produto p WHERE p.indiceProd = :indiceProd")
    , @NamedQuery(name = "Produto.findByVendaProd", query = "SELECT p FROM Produto p WHERE p.vendaProd = :vendaProd")
    , @NamedQuery(name = "Produto.findByFornProd", query = "SELECT p FROM Produto p WHERE p.fornProd = :fornProd")
    , @NamedQuery(name = "Produto.findByEstoqueProd", query = "SELECT p FROM Produto p WHERE p.estoqueProd = :estoqueProd")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_prod")
    private Integer codProd;
    @Basic(optional = false)
    @Column(name = "des_prod")
    private String desProd;
    @Basic(optional = false)
    @Column(name = "custo_prod")
    private double custoProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "indice_prod")
    private BigDecimal indiceProd;
    @Basic(optional = false)
    @Column(name = "venda_prod")
    private double vendaProd;
    @Basic(optional = false)
    @Column(name = "forn_prod")
    private int fornProd;
    @Column(name = "estoque_prod")
    private Integer estoqueProd;

    public Produto() {
    }

    public Produto(Integer codProd) {
        this.codProd = codProd;
    }

    public Produto(Integer codProd, String desProd, double custoProd, double vendaProd, int fornProd) {
        this.codProd = codProd;
        this.desProd = desProd;
        this.custoProd = custoProd;
        this.vendaProd = vendaProd;
        this.fornProd = fornProd;
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public String getDesProd() {
        return desProd;
    }

    public void setDesProd(String desProd) {
        this.desProd = desProd;
    }

    public double getCustoProd() {
        return custoProd;
    }

    public void setCustoProd(double custoProd) {
        this.custoProd = custoProd;
    }

    public BigDecimal getIndiceProd() {
        return indiceProd;
    }

    public void setIndiceProd(BigDecimal indiceProd) {
        this.indiceProd = indiceProd;
    }

    public double getVendaProd() {
        return vendaProd;
    }

    public void setVendaProd(double vendaProd) {
        this.vendaProd = vendaProd;
    }

    public int getFornProd() {
        return fornProd;
    }

    public void setFornProd(int fornProd) {
        this.fornProd = fornProd;
    }

    public Integer getEstoqueProd() {
        return estoqueProd;
    }

    public void setEstoqueProd(Integer estoqueProd) {
        this.estoqueProd = estoqueProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProd != null ? codProd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codProd == null && other.codProd != null) || (this.codProd != null && !this.codProd.equals(other.codProd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.Produto[ codProd=" + codProd + " ]";
    }
    
}
