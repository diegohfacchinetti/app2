/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Fornecedor;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Eduardo Silveira
 */
public class C_Fornecedor {
    
    public void salvar(Fornecedor p){
        
        EntityManager em = new JPAUtil().getEntityManager();
         try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
         }catch(Exception ex){
            em.getTransaction().rollback();
         }finally{
            em.close();
         }    
    }
    
    public void atualizar(Fornecedor p){
            EntityManager em = new JPAUtil().getEntityManager();
            try{
                em.getTransaction().begin();
                em.merge(p);
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
                Fornecedor p = null;
                p = em.find(Fornecedor.class, id);
                if(p == null){
                    return false;
                }else{
                    em.remove(p);
                }
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
            return true;
    }
   
    public List<Object[]> consulta(){
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createNativeQuery("select * from Fornecedor");
        List<Object[]> fornecedores = q.getResultList();
        return fornecedores;
    }
    public Fornecedor consulta(Integer id){
        EntityManager em = new JPAUtil().getEntityManager();
        Fornecedor p = null;
            try{
                em.getTransaction().begin(); 
                p = em.find(Fornecedor.class, id);
                if(p == null){
                    return null;
                }
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
            return p;
    }
    
}
