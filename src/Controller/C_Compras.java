/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Compras;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Eduardo Silveira
 */
public class C_Compras {
    public void salvar(Compras c){
        
        EntityManager em = new JPAUtil().getEntityManager();
         try{
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
         }catch(Exception ex){
            em.getTransaction().rollback();
         }finally{
            em.close();
         }    
    }
    public void atualizar(Compras c){
            EntityManager em = new JPAUtil().getEntityManager();
            try{
                em.getTransaction().begin();
                em.merge(c);
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
    }
    
    public boolean excluir(Integer id){
            EntityManager em = new JPAUtil().getEntityManager();
            try{
                em.getTransaction().begin();
                Compras c = null;
                c = em.find(Compras.class, id);
                if(c == null){
                    return false;
                }else{
                    em.remove(c);
                }
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
            return true;
    }
    
    public Compras consulta(Integer id){
        EntityManager em = new JPAUtil().getEntityManager();
        Compras c = null;
            try{
                em.getTransaction().begin(); 
                c = em.find(Compras.class, id);
                if(c == null){
                    return null;
                }
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
            return c;
    }
    
    public List<Object[]> consulta(){
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createNativeQuery("select * from compras");
        List<Object[]> compras = q.getResultList();
        return compras;
    }    
}
