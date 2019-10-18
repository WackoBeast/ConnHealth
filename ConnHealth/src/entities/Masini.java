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
@Table(name = "masini")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Masini.findAll", query = "SELECT m FROM Masini m"),
    @NamedQuery(name = "Masini.findById", query = "SELECT m FROM Masini m WHERE m.id = :id"),
    @NamedQuery(name = "Masini.findByCod", query = "SELECT m FROM Masini m WHERE m.cod = :cod"),
    @NamedQuery(name = "Masini.findByNumar", query = "SELECT m FROM Masini m WHERE m.numar = :numar")})
public class Masini implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cod")
    private String cod;
    @Basic(optional = false)
    @Column(name = "numar")
    private int numar;
    @JoinColumn(name = "judetID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Judete judetID;

    public Masini() {
    }

    public Masini(Integer id) {
        this.id = id;
    }

    public Masini(Integer id, String cod, int numar) {
        this.id = id;
        this.cod = cod;
        this.numar = numar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public Judete getJudetID() {
        return judetID;
    }

    public void setJudetID(Judete judetID) {
        this.judetID = judetID;
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
        if (!(object instanceof Masini)) {
            return false;
        }
        Masini other = (Masini) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Masini[ id=" + id + " ]";
    }
    
}
