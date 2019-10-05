/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entities.Masters;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author vladv
 */
public final class DBAuthentication {
    public static EntityManagerFactory emf = DBConnection.getInstance().getEmf();
    public static EntityManager em = emf.createEntityManager();
    
    
    
    public static boolean hasAccess(String username, String password){
        List<Masters> result  = em.createQuery("SELECT m FROM Masters m " 
                + "WHERE m.mastersPK.username = ?1 AND "
                + "m.mastersPK.code = ?2 ")
                .setParameter(1, username)
                .setParameter(2, password)
                .getResultList();
        
        if(result.isEmpty()) return false;
        else return true;
                
    }
    
}


