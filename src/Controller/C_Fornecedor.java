/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Eduardo Silveira
 */
public class C_Fornecedor {
    
    
    
    
    public List<Object[]> consulta(){
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createNativeQuery("select * from produto");
        List<Object[]> fornecedores = q.getResultList();
        return fornecedores;
    }
    
}
