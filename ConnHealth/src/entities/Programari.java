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
@Table(name = "programari")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programari.findAll", query = "SELECT p FROM Programari p"),
    @NamedQuery(name = "Programari.findById", query = "SELECT p FROM Programari p WHERE p.id = :id"),
    @NamedQuery(name = "Programari.findByData", query = "SELECT p FROM Programari p WHERE p.data = :data")})
public class Programari implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinColumn(name = "pacientID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Pacienti pacientID;
    @JoinColumn(name = "serviciuID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private ServiciiMedicale serviciuID;

    public Programari() {
    }

    public Programari(Integer id) {
        this.id = id;
    }

    public Programari(Integer id, Date data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Pacienti getPacientID() {
        return pacientID;
    }

    public void setPacientID(Pacienti pacientID) {
        this.pacientID = pacientID;
    }

    public ServiciiMedicale getServiciuID() {
        return serviciuID;
    }

    public void setServiciuID(ServiciiMedicale serviciuID) {
        this.serviciuID = serviciuID;
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
        if (!(object instanceof Programari)) {
            return false;
        }
        Programari other = (Programari) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Programari[ id=" + id + " ]";
    }
    
}
