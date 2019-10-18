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
@Table(name = "pacienti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacienti.findAll", query = "SELECT p FROM Pacienti p"),
    @NamedQuery(name = "Pacienti.findById", query = "SELECT p FROM Pacienti p WHERE p.id = :id"),
    @NamedQuery(name = "Pacienti.findByNume", query = "SELECT p FROM Pacienti p WHERE p.nume = :nume"),
    @NamedQuery(name = "Pacienti.findByAdresaFizica", query = "SELECT p FROM Pacienti p WHERE p.adresaFizica = :adresaFizica"),
    @NamedQuery(name = "Pacienti.findByTelefon", query = "SELECT p FROM Pacienti p WHERE p.telefon = :telefon"),
    @NamedQuery(name = "Pacienti.findByAdresaMail", query = "SELECT p FROM Pacienti p WHERE p.adresaMail = :adresaMail")})
public class Pacienti implements Serializable {
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
    @Column(name = "adresa_fizica")
    private String adresaFizica;
    @Basic(optional = false)
    @Column(name = "telefon")
    private String telefon;
    @Column(name = "adresa_mail")
    private String adresaMail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacientID")
    private Collection<Programari> programariCollection;

    public Pacienti() {
    }

    public Pacienti(Integer id) {
        this.id = id;
    }

    public Pacienti(Integer id, String nume, String adresaFizica, String telefon) {
        this.id = id;
        this.nume = nume;
        this.adresaFizica = adresaFizica;
        this.telefon = telefon;
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

    public String getAdresaFizica() {
        return adresaFizica;
    }

    public void setAdresaFizica(String adresaFizica) {
        this.adresaFizica = adresaFizica;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
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
        if (!(object instanceof Pacienti)) {
            return false;
        }
        Pacienti other = (Pacienti) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pacienti[ id=" + id + " ]";
    }
    
}
