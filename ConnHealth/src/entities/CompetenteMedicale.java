/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
 * @author vladv
 */
@Entity
@Table(name = "competente_medicale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompetenteMedicale.findAll", query = "SELECT c FROM CompetenteMedicale c"),
    @NamedQuery(name = "CompetenteMedicale.findById", query = "SELECT c FROM CompetenteMedicale c WHERE c.id = :id"),
    @NamedQuery(name = "CompetenteMedicale.findByNume", query = "SELECT c FROM CompetenteMedicale c WHERE c.nume = :nume")})
public class CompetenteMedicale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nume")
    private String nume;

    public CompetenteMedicale() {
    }

    public CompetenteMedicale(Integer id) {
        this.id = id;
    }

    public CompetenteMedicale(Integer id, String nume) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompetenteMedicale)) {
            return false;
        }
        CompetenteMedicale other = (CompetenteMedicale) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CompetenteMedicale[ id=" + id + " ]";
    }
    
}
