/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 1513 IRON
 */
@Entity
@Table(name = "compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compras.findAll", query = "SELECT c FROM Compras c")
    , @NamedQuery(name = "Compras.findByIdCompra", query = "SELECT c FROM Compras c WHERE c.idCompra = :idCompra")
    , @NamedQuery(name = "Compras.findByNumNota", query = "SELECT c FROM Compras c WHERE c.numNota = :numNota")
    , @NamedQuery(name = "Compras.findByIdForn", query = "SELECT c FROM Compras c WHERE c.idForn = :idForn")
    , @NamedQuery(name = "Compras.findByDataCompra", query = "SELECT c FROM Compras c WHERE c.dataCompra = :dataCompra")})
public class Compras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Basic(optional = false)
    @Column(name = "num_nota")
    private String numNota;
    @Basic(optional = false)
    @Column(name = "id_forn")
    private int idForn;
    @Column(name = "data_compra")
    @Temporal(TemporalType.DATE)
    private Date dataCompra;

    public Compras() {
    }

    public Compras(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Compras(Integer idCompra, String numNota, int idForn) {
        this.idCompra = idCompra;
        this.numNota = numNota;
        this.idForn = idForn;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getNumNota() {
        return numNota;
    }

    public void setNumNota(String numNota) {
        this.numNota = numNota;
    }

    public int getIdForn() {
        return idForn;
    }

    public void setIdForn(int idForn) {
        this.idForn = idForn;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.Compras[ idCompra=" + idCompra + " ]";
    }
    
}
