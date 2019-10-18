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
@Table(name = "judete")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Judete.findAll", query = "SELECT j FROM Judete j"),
    @NamedQuery(name = "Judete.findById", query = "SELECT j FROM Judete j WHERE j.id = :id"),
    @NamedQuery(name = "Judete.findByDenumire", query = "SELECT j FROM Judete j WHERE j.denumire = :denumire"),
    @NamedQuery(name = "Judete.findByPrescurtare", query = "SELECT j FROM Judete j WHERE j.prescurtare = :prescurtare")})
public class Judete implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "denumire")
    private String denumire;
    @Basic(optional = false)
    @Column(name = "prescurtare")
    private String prescurtare;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "judetID")
    private Collection<Masini> masiniCollection;

    public Judete() {
    }

    public Judete(Integer id) {
        this.id = id;
    }

    public Judete(Integer id, String denumire, String prescurtare) {
        this.id = id;
        this.denumire = denumire;
        this.prescurtare = prescurtare;
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

    public String getPrescurtare() {
        return prescurtare;
    }

    public void setPrescurtare(String prescurtare) {
        this.prescurtare = prescurtare;
    }

    @XmlTransient
    public Collection<Masini> getMasiniCollection() {
        return masiniCollection;
    }

    public void setMasiniCollection(Collection<Masini> masiniCollection) {
        this.masiniCollection = masiniCollection;
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
        if (!(object instanceof Judete)) {
            return false;
        }
        Judete other = (Judete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Judete[ id=" + id + " ]";
    }
    
}
