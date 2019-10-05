/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vladv
 */
public class DBConnection {
    private EntityManagerFactory emf;
    
    
    private DBConnection() {
         emf = Persistence.createEntityManagerFactory("ConnHealthPU");
    }
    
    public static DBConnection getInstance() {
        return DBConnectionHolder.INSTANCE;
    }
    
    private static class DBConnectionHolder {

        private static final DBConnection INSTANCE = new DBConnection();
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }
    
}
