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
@Table(name = "fornecedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f")
    , @NamedQuery(name = "Fornecedor.findByIdForn", query = "SELECT f FROM Fornecedor f WHERE f.idForn = :idForn")
    , @NamedQuery(name = "Fornecedor.findByRazaoForn", query = "SELECT f FROM Fornecedor f WHERE f.razaoForn = :razaoForn")
    , @NamedQuery(name = "Fornecedor.findByFantasiaForn", query = "SELECT f FROM Fornecedor f WHERE f.fantasiaForn = :fantasiaForn")
    , @NamedQuery(name = "Fornecedor.findByCnpjForn", query = "SELECT f FROM Fornecedor f WHERE f.cnpjForn = :cnpjForn")
    , @NamedQuery(name = "Fornecedor.findByInscrForn", query = "SELECT f FROM Fornecedor f WHERE f.inscrForn = :inscrForn")
    , @NamedQuery(name = "Fornecedor.findByTelForn", query = "SELECT f FROM Fornecedor f WHERE f.telForn = :telForn")})
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_forn")
    private Integer idForn;
    @Basic(optional = false)
    @Column(name = "razao_forn")
    private String razaoForn;
    @Basic(optional = false)
    @Column(name = "fantasia_forn")
    private String fantasiaForn;
    @Basic(optional = false)
    @Column(name = "cnpj_forn")
    private String cnpjForn;
    @Basic(optional = false)
    @Column(name = "inscr_forn")
    private String inscrForn;
    @Column(name = "tel_forn")
    private String telForn;

    public Fornecedor() {
    }

    public Fornecedor(Integer idForn) {
        this.idForn = idForn;
    }

    public Fornecedor(Integer idForn, String razaoForn, String fantasiaForn, String cnpjForn, String inscrForn) {
        this.idForn = idForn;
        this.razaoForn = razaoForn;
        this.fantasiaForn = fantasiaForn;
        this.cnpjForn = cnpjForn;
        this.inscrForn = inscrForn;
    }

    public Integer getIdForn() {
        return idForn;
    }

    public void setIdForn(Integer idForn) {
        this.idForn = idForn;
    }

    public String getRazaoForn() {
        return razaoForn;
    }

    public void setRazaoForn(String razaoForn) {
        this.razaoForn = razaoForn;
    }

    public String getFantasiaForn() {
        return fantasiaForn;
    }

    public void setFantasiaForn(String fantasiaForn) {
        this.fantasiaForn = fantasiaForn;
    }

    public String getCnpjForn() {
        return cnpjForn;
    }

    public void setCnpjForn(String cnpjForn) {
        this.cnpjForn = cnpjForn;
    }

    public String getInscrForn() {
        return inscrForn;
    }

    public void setInscrForn(String inscrForn) {
        this.inscrForn = inscrForn;
    }

    public String getTelForn() {
        return telForn;
    }

    public void setTelForn(String telForn) {
        this.telForn = telForn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idForn != null ? idForn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idForn == null && other.idForn != null) || (this.idForn != null && !this.idForn.equals(other.idForn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.Fornecedor[ idForn=" + idForn + " ]";
    }
    
}
