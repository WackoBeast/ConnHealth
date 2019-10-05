/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladv
 */
@Entity
@Table(name = "masters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Masters.findAll", query = "SELECT m FROM Masters m"),
    @NamedQuery(name = "Masters.findByUsername", query = "SELECT m FROM Masters m WHERE m.mastersPK.username = :username"),
    @NamedQuery(name = "Masters.findByCode", query = "SELECT m FROM Masters m WHERE m.mastersPK.code = :code")})
public class Masters implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MastersPK mastersPK;

    public Masters() {
    }

    public Masters(MastersPK mastersPK) {
        this.mastersPK = mastersPK;
    }

    public Masters(String username, String code) {
        this.mastersPK = new MastersPK(username, code);
    }

    public MastersPK getMastersPK() {
        return mastersPK;
    }

    public void setMastersPK(MastersPK mastersPK) {
        this.mastersPK = mastersPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mastersPK != null ? mastersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Masters)) {
            return false;
        }
        Masters other = (Masters) object;
        if ((this.mastersPK == null && other.mastersPK != null) || (this.mastersPK != null && !this.mastersPK.equals(other.mastersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Masters[ mastersPK=" + mastersPK + " ]";
    }
    
}
