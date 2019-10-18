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
@Table(name = "tip_angajat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipAngajat.findAll", query = "SELECT t FROM TipAngajat t"),
    @NamedQuery(name = "TipAngajat.findById", query = "SELECT t FROM TipAngajat t WHERE t.id = :id"),
    @NamedQuery(name = "TipAngajat.findByNume", query = "SELECT t FROM TipAngajat t WHERE t.nume = :nume")})
public class TipAngajat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nume")
    private String nume;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipAngajat")
    private Collection<Angajati> angajatiCollection;

    public TipAngajat() {
    }

    public TipAngajat(Integer id) {
        this.id = id;
    }

    public TipAngajat(Integer id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
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
        if (!(object instanceof TipAngajat)) {
            return false;
        }
        TipAngajat other = (TipAngajat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TipAngajat[ id=" + id + " ]";
    }
    
}
