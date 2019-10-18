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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladv
 */
@Entity
@Table(name = "stoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stoc.findAll", query = "SELECT s FROM Stoc s"),
    @NamedQuery(name = "Stoc.findById", query = "SELECT s FROM Stoc s WHERE s.id = :id"),
    @NamedQuery(name = "Stoc.findByNume", query = "SELECT s FROM Stoc s WHERE s.nume = :nume"),
    @NamedQuery(name = "Stoc.findByCantitate", query = "SELECT s FROM Stoc s WHERE s.cantitate = :cantitate"),
    @NamedQuery(name = "Stoc.findByPret", query = "SELECT s FROM Stoc s WHERE s.pret = :pret")})
public class Stoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nume")
    private int nume;
    @Basic(optional = false)
    @Column(name = "cantitate")
    private int cantitate;
    @Basic(optional = false)
    @Column(name = "pret")
    private double pret;
    @JoinColumn(name = "contractID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Contract contractID;
    @JoinColumn(name = "unitateMasuraID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private UnitatiMasura unitateMasuraID;

    public Stoc() {
    }

    public Stoc(Integer id) {
        this.id = id;
    }

    public Stoc(Integer id, int nume, int cantitate, double pret) {
        this.id = id;
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Contract getContractID() {
        return contractID;
    }

    public void setContractID(Contract contractID) {
        this.contractID = contractID;
    }

    public UnitatiMasura getUnitateMasuraID() {
        return unitateMasuraID;
    }

    public void setUnitateMasuraID(UnitatiMasura unitateMasuraID) {
        this.unitateMasuraID = unitateMasuraID;
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
        if (!(object instanceof Stoc)) {
            return false;
        }
        Stoc other = (Stoc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Stoc[ id=" + id + " ]";
    }
    
}
