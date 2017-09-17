/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainView;

import View.V_Compras;
import View.V_Compras_Atualizacao;
import View.V_Compras_Listar;
import View.V_Fornecedor;
import View.V_Fornecedor_Listar;
import View.V_ItensCompra1;
import View.V_ItensCompra_Listar;
import View.V_ItensCompra_PreAtualizar;
import View.V_Produto;
import View.V_Produto_Atualizacao;
import View.V_Produto_Listar;

/**
 *
 * @author Henrique
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        iProd = new javax.swing.JButton();
        iForn = new javax.swing.JButton();
        i_ItensComp = new javax.swing.JButton();
        iComp = new javax.swing.JButton();
        updatePanel = new javax.swing.JPanel();
        updProd = new javax.swing.JButton();
        updForn = new javax.swing.JButton();
        upd_ItensComp = new javax.swing.JButton();
        updComp = new javax.swing.JButton();
        listPanel = new javax.swing.JPanel();
        listProd = new javax.swing.JButton();
        listForn = new javax.swing.JButton();
        list_ItensComp = new javax.swing.JButton();
        listComp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        iProd.setText("Produtos");
        iProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iProdActionPerformed(evt);
            }
        });

        iForn.setText("Fornecedores");
        iForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iFornActionPerformed(evt);
            }
        });

        i_ItensComp.setText("Itens Compra");
        i_ItensComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_ItensCompActionPerformed(evt);
            }
        });

        iComp.setText("Compras");
        iComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iForn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_ItensComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iForn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(i_ItensComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atualizar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        updProd.setText("Produtos");
        updProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updProdActionPerformed(evt);
            }
        });

        updForn.setText("Fornecedores");
        updForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updFornActionPerformed(evt);
            }
        });

        upd_ItensComp.setText("Itens Compra");
        upd_ItensComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upd_ItensCompActionPerformed(evt);
            }
        });

        updComp.setText("Compras");
        updComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updForn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upd_ItensComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updForn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upd_ItensComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        listProd.setText("Produtos");
        listProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProdActionPerformed(evt);
            }
        });

        listForn.setText("Fornecedores");
        listForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFornActionPerformed(evt);
            }
        });

        list_ItensComp.setText("Itens Compra");
        list_ItensComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_ItensCompActionPerformed(evt);
            }
        });

        listComp.setText("Compras");
        listComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listForn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_ItensComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listForn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_ItensComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listComp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iProdActionPerformed
        V_Produto.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_iProdActionPerformed

    private void iFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iFornActionPerformed
        V_Fornecedor.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_iFornActionPerformed

    private void i_ItensCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_ItensCompActionPerformed
        V_ItensCompra1.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_i_ItensCompActionPerformed

    private void iCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iCompActionPerformed
        V_Compras.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_iCompActionPerformed

    private void updProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updProdActionPerformed
        // TODO add your handling code here:
        V_Produto_Atualizacao.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_updProdActionPerformed

    private void updFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updFornActionPerformed
        // TODO add your handling code here:
        //V_Fornecedor_Atualizacao.main(new String[0]);
    }//GEN-LAST:event_updFornActionPerformed

    private void upd_ItensCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upd_ItensCompActionPerformed
        // TODO add your handling code here:
        V_ItensCompra_PreAtualizar.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_upd_ItensCompActionPerformed

    private void updCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updCompActionPerformed
        // TODO add your handling code here:
        V_Compras_Atualizacao.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_updCompActionPerformed

    private void listProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProdActionPerformed
        // TODO add your handling code here:
        V_Produto_Listar.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_listProdActionPerformed

    private void listFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFornActionPerformed
        // TODO add your handling code here:
        V_Fornecedor_Listar.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_listFornActionPerformed

    private void list_ItensCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_ItensCompActionPerformed
        // TODO add your handling code here:
        V_ItensCompra_Listar.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_list_ItensCompActionPerformed

    private void listCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCompActionPerformed
        // TODO add your handling code here:
        V_Compras_Listar.main(new String[0]);
        this.dispose();
    }//GEN-LAST:event_listCompActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iComp;
    private javax.swing.JButton iForn;
    private javax.swing.JButton iProd;
    private javax.swing.JButton i_ItensComp;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton listComp;
    private javax.swing.JButton listForn;
    private javax.swing.JPanel listPanel;
    private javax.swing.JButton listProd;
    private javax.swing.JButton list_ItensComp;
    private javax.swing.JButton updComp;
    private javax.swing.JButton updForn;
    private javax.swing.JButton updProd;
    private javax.swing.JButton upd_ItensComp;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
