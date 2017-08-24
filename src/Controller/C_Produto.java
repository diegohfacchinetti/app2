/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Produto;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Eduardo Silveira
 */
public class C_Produto {
    
    public void salvar(Produto p){
        
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
    public void atualizar(Produto p){
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
                Produto p = null;
                p = em.find(Produto.class, id);
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
    
    public Produto consulta(Integer id){
        EntityManager em = new JPAUtil().getEntityManager();
        Produto p = null;
            try{
                em.getTransaction().begin(); 
                p = em.find(Produto.class, id);
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
    
    public List<Object[]> consulta(){
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createNativeQuery("select * from produto order by des_prod");
        List<Object[]> produtos = q.getResultList();
        return produtos;
    }
    
    
    
    
   public static void main(String...args){
       Produto prod;
        prod = new Produto();
        prod.setCodProd(1);
        prod.setVendaProd(5);
        prod.setDesProd("beterraba brabolenta");
        prod.setCustoProd(2.5);
        prod.setEstoqueProd(0);
        prod.setIndiceProd(null);
        C_Produto pc = new C_Produto();
       // pc.atualizar(prod);
        
        List<Object[]> produtos = pc.consulta();
        System.out.println(pc.consulta());
        for(Object[] p : produtos){
            System.out.println(p[0]+" "+p[1]);
        }
    } 
}
