/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vladv
 */
@Entity
@Table(name = "unitati_masura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnitatiMasura.findAll", query = "SELECT u FROM UnitatiMasura u"),
    @NamedQuery(name = "UnitatiMasura.findById", query = "SELECT u FROM UnitatiMasura u WHERE u.id = :id"),
    @NamedQuery(name = "UnitatiMasura.findByDenumire", query = "SELECT u FROM UnitatiMasura u WHERE u.denumire = :denumire")})
public class UnitatiMasura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "denumire")
    private String denumire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unitateMasuraID")
    private Collection<Stoc> stocCollection;

    public UnitatiMasura() {
    }

    public UnitatiMasura(Integer id) {
        this.id = id;
    }

    public UnitatiMasura(Integer id, String denumire) {
        this.id = id;
        this.denumire = denumire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @XmlTransient
    public Collection<Stoc> getStocCollection() {
        return stocCollection;
    }

    public void setStocCollection(Collection<Stoc> stocCollection) {
        this.stocCollection = stocCollection;
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
        if (!(object instanceof UnitatiMasura)) {
            return false;
        }
        UnitatiMasura other = (UnitatiMasura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UnitatiMasura[ id=" + id + " ]";
    }
    
}
