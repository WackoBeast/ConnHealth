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
@Table(name = "servicii_medicale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServiciiMedicale.findAll", query = "SELECT s FROM ServiciiMedicale s"),
    @NamedQuery(name = "ServiciiMedicale.findById", query = "SELECT s FROM ServiciiMedicale s WHERE s.id = :id"),
    @NamedQuery(name = "ServiciiMedicale.findByNume", query = "SELECT s FROM ServiciiMedicale s WHERE s.nume = :nume"),
    @NamedQuery(name = "ServiciiMedicale.findByPret", query = "SELECT s FROM ServiciiMedicale s WHERE s.pret = :pret")})
public class ServiciiMedicale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nume")
    private String nume;
    @Basic(optional = false)
    @Column(name = "pret")
    private int pret;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviciuID")
    private Collection<Programari> programariCollection;

    public ServiciiMedicale() {
    }

    public ServiciiMedicale(Integer id) {
        this.id = id;
    }

    public ServiciiMedicale(Integer id, String nume, int pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
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

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @XmlTransient
    public Collection<Programari> getProgramariCollection() {
        return programariCollection;
    }

    public void setProgramariCollection(Collection<Programari> programariCollection) {
        this.programariCollection = programariCollection;
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
        if (!(object instanceof ServiciiMedicale)) {
            return false;
        }
        ServiciiMedicale other = (ServiciiMedicale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ServiciiMedicale[ id=" + id + " ]";
    }
    
}
