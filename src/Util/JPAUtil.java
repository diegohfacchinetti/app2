/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Eduardo Silveira
 */
public class JPAUtil {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("app2PU");;
    
    public EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
    
    
}
