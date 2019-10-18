/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladv
 */
@Entity
@Table(name = "angajati")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Angajati.findAll", query = "SELECT a FROM Angajati a"),
    @NamedQuery(name = "Angajati.findById", query = "SELECT a FROM Angajati a WHERE a.id = :id"),
    @NamedQuery(name = "Angajati.findByNume", query = "SELECT a FROM Angajati a WHERE a.nume = :nume"),
    @NamedQuery(name = "Angajati.findByDataNastere", query = "SELECT a FROM Angajati a WHERE a.dataNastere = :dataNastere"),
    @NamedQuery(name = "Angajati.findByAdresaFizica", query = "SELECT a FROM Angajati a WHERE a.adresaFizica = :adresaFizica"),
    @NamedQuery(name = "Angajati.findByTelefon", query = "SELECT a FROM Angajati a WHERE a.telefon = :telefon"),
    @NamedQuery(name = "Angajati.findByAdresaMail", query = "SELECT a FROM Angajati a WHERE a.adresaMail = :adresaMail"),
    @NamedQuery(name = "Angajati.findBySalariu", query = "SELECT a FROM Angajati a WHERE a.salariu = :salariu")})
public class Angajati implements Serializable {
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
    @Column(name = "data_nastere")
    @Temporal(TemporalType.DATE)
    private Date dataNastere;
    @Basic(optional = false)
    @Column(name = "adresa_fizica")
    private String adresaFizica;
    @Basic(optional = false)
    @Column(name = "telefon")
    private String telefon;
    @Basic(optional = false)
    @Column(name = "adresa_mail")
    private String adresaMail;
    @Basic(optional = false)
    @Column(name = "salariu")
    private int salariu;
    @JoinColumn(name = "tip_angajat", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipAngajat tipAngajat;
    @JoinColumn(name = "nr_contract", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Contract nrContract;

    public Angajati() {
    }

    public Angajati(Integer id) {
        this.id = id;
    }

    public Angajati(Integer id, String nume, Date dataNastere, String adresaFizica, String telefon, String adresaMail, int salariu) {
        this.id = id;
        this.nume = nume;
        this.dataNastere = dataNastere;
        this.adresaFizica = adresaFizica;
        this.telefon = telefon;
        this.adresaMail = adresaMail;
        this.salariu = salariu;
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

    public Date getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(Date dataNastere) {
        this.dataNastere = dataNastere;
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

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public TipAngajat getTipAngajat() {
        return tipAngajat;
    }

    public void setTipAngajat(TipAngajat tipAngajat) {
        this.tipAngajat = tipAngajat;
    }

    public Contract getNrContract() {
        return nrContract;
    }

    public void setNrContract(Contract nrContract) {
        this.nrContract = nrContract;
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
        if (!(object instanceof Angajati)) {
            return false;
        }
        Angajati other = (Angajati) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Angajati[ id=" + id + " ]";
    }
    
}
