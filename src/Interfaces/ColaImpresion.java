/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Hastable;
import EDD.MonticuloBinario;

/**
 *
 * @author gabri
 */
public class ColaImpresion extends javax.swing.JFrame {
private static Hastable hash;
private static Cronometro cro;
private static MonticuloBinario cola;

    /**
     * Creates new form Usuario
     * @param hastable
     * @param crono
     * @param monticulo
     */
    public ColaImpresion( Hastable hastable, Cronometro crono, MonticuloBinario monticulo) {
        hash = hastable;
        cro = crono;
        cola = monticulo;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Aceptar1 = new javax.swing.JButton();
        Cancelar1 = new javax.swing.JButton();
        liberarImpresora = new javax.swing.JButton();
        imprimirDoc = new javax.swing.JButton();
        eliminarDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Cola de impresion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 330, 50));

        Aceptar1.setText("Aceptar");
        Aceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Aceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 322, 110, 50));

        Cancelar1.setText("Cancelar");
        Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 322, 120, 50));

        liberarImpresora.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        liberarImpresora.setText("Liberar impresora");
        liberarImpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liberarImpresoraActionPerformed(evt);
            }
        });
        jPanel1.add(liberarImpresora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 210, -1));

        imprimirDoc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        imprimirDoc.setText("Imprimir documento");
        imprimirDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirDocActionPerformed(evt);
            }
        });
        jPanel1.add(imprimirDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        eliminarDoc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eliminarDoc.setText("Eliminar documento");
        eliminarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDocActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        Inicio v3 = new Inicio(hash, cro, cola);
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cancelar1ActionPerformed

    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed
        Inicio v3 = new Inicio(hash, cro, cola);
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Aceptar1ActionPerformed

    private void imprimirDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirDocActionPerformed
        ImprimirDoc c = new ImprimirDoc(hash, cro);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imprimirDocActionPerformed

    private void eliminarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDocActionPerformed
        EliminarDocCola c = new EliminarDocCola(hash, cro, cola);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarDocActionPerformed

    private void liberarImpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liberarImpresoraActionPerformed
        // TODO add your handling code here:
        liberarImpresora c = new liberarImpresora(hash, cro, cola);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_liberarImpresoraActionPerformed

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
            java.util.logging.Logger.getLogger(ColaImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColaImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColaImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColaImpresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ColaImpresion(hash, cro, cola).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar1;
    private javax.swing.JButton Cancelar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton eliminarDoc;
    private javax.swing.JButton imprimirDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton liberarImpresora;
    // End of variables declaration//GEN-END:variables
}
