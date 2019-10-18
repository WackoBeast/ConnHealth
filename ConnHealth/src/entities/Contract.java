/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vladv
 */
@Entity
@Table(name = "contract")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contract.findAll", query = "SELECT c FROM Contract c"),
    @NamedQuery(name = "Contract.findById", query = "SELECT c FROM Contract c WHERE c.id = :id"),
    @NamedQuery(name = "Contract.findByDataSemnare", query = "SELECT c FROM Contract c WHERE c.dataSemnare = :dataSemnare"),
    @NamedQuery(name = "Contract.findByDataExpirare", query = "SELECT c FROM Contract c WHERE c.dataExpirare = :dataExpirare"),
    @NamedQuery(name = "Contract.findByNumeParte1", query = "SELECT c FROM Contract c WHERE c.numeParte1 = :numeParte1"),
    @NamedQuery(name = "Contract.findByNumePart2", query = "SELECT c FROM Contract c WHERE c.numePart2 = :numePart2"),
    @NamedQuery(name = "Contract.findBySpecificatii", query = "SELECT c FROM Contract c WHERE c.specificatii = :specificatii")})
public class Contract implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "dataSemnare")
    @Temporal(TemporalType.DATE)
    private Date dataSemnare;
    @Basic(optional = false)
    @Column(name = "dataExpirare")
    @Temporal(TemporalType.DATE)
    private Date dataExpirare;
    @Basic(optional = false)
    @Column(name = "numeParte1")
    private String numeParte1;
    @Basic(optional = false)
    @Column(name = "numePart2")
    private String numePart2;
    @Column(name = "specificatii")
    private String specificatii;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contractID")
    private Collection<Stoc> stocCollection;
    @JoinColumn(name = "tipContractID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipContract tipContractID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrContract")
    private Collection<Angajati> angajatiCollection;

    public Contract() {
    }

    public Contract(Integer id) {
        this.id = id;
    }

    public Contract(Integer id, Date dataSemnare, Date dataExpirare, String numeParte1, String numePart2) {
        this.id = id;
        this.dataSemnare = dataSemnare;
        this.dataExpirare = dataExpirare;
        this.numeParte1 = numeParte1;
        this.numePart2 = numePart2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataSemnare() {
        return dataSemnare;
    }

    public void setDataSemnare(Date dataSemnare) {
        this.dataSemnare = dataSemnare;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public String getNumeParte1() {
        return numeParte1;
    }

    public void setNumeParte1(String numeParte1) {
        this.numeParte1 = numeParte1;
    }

    public String getNumePart2() {
        return numePart2;
    }

    public void setNumePart2(String numePart2) {
        this.numePart2 = numePart2;
    }

    public String getSpecificatii() {
        return specificatii;
    }

    public void setSpecificatii(String specificatii) {
        this.specificatii = specificatii;
    }

    @XmlTransient
    public Collection<Stoc> getStocCollection() {
        return stocCollection;
    }

    public void setStocCollection(Collection<Stoc> stocCollection) {
        this.stocCollection = stocCollection;
    }

    public TipContract getTipContractID() {
        return tipContractID;
    }

    public void setTipContractID(TipContract tipContractID) {
        this.tipContractID = tipContractID;
    }

    @XmlTransient
    public Collection<Angajati> getAngajatiCollection() {
        return angajatiCollection;
    }

    public void setAngajatiCollection(Collection<Angajati> angajatiCollection) {
        this.angajatiCollection = angajatiCollection;
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
        if (!(object instanceof Contract)) {
            return false;
        }
        Contract other = (Contract) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Contract[ id=" + id + " ]";
    }
    
}
