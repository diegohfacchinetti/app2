/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ItensCompra;
import Util.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Eduardo Silveira
 */
public class C_ItensCompra {
    public void salvar(ItensCompra i){
        
        EntityManager em = new JPAUtil().getEntityManager();
         try{
            em.getTransaction().begin();
            em.persist(i);
            em.getTransaction().commit();
         }catch(Exception ex){
            em.getTransaction().rollback();
         }finally{
            em.close();
         }    
    }
    public void atualizar(ItensCompra i){
            EntityManager em = new JPAUtil().getEntityManager();
            try{
                em.getTransaction().begin();
                em.merge(i);
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
                ItensCompra i = null;
                i = em.find(ItensCompra.class, id);
                if(i == null){
                    return false;
                }else{
                    em.remove(i);
                }
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
            return true;
    }
    
    public ItensCompra consulta(Integer id){
        EntityManager em = new JPAUtil().getEntityManager();
        ItensCompra i = null;
            try{
                em.getTransaction().begin(); 
                i = em.find(ItensCompra.class, id);
                if(i == null){
                    return null;
                }
                em.getTransaction().commit();
            }catch(Exception ex){
                em.getTransaction().rollback();
            }finally{
                em.close();
            }
            return i;
    }
    
    public List<Object[]> consulta(){
        EntityManager em = new JPAUtil().getEntityManager();
        Query q = em.createNativeQuery("select * from itens_Compra");
        List<Object[]> itensCompra = q.getResultList();
        return itensCompra;
    }
    
    
    
    
   public static void main(String...args){
        ItensCompra iCompra;
        iCompra = new ItensCompra();
        iCompra.setId(1);
        iCompra.setIdCompra(1);
        iCompra.setIdProd(5);
        iCompra.setQtd(10);
        iCompra.setValor(3.0);
        C_ItensCompra ic = new C_ItensCompra();
        
        List<Object[]> itensCompra = ic.consulta();
        System.out.println(ic.consulta());
        for(Object[] i : itensCompra){
            System.out.println(i[0]+" "+i[1]);
        }
    } 
}
