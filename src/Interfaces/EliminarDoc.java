/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.Hastable;
import EDD.MonticuloBinario;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EliminarDoc extends javax.swing.JFrame {
private static Hastable hash;
private static Cronometro c;
private static MonticuloBinario cola;

    /**
     * Creates new form Usuario
     * @param hastable
     * @param crono
     * @param monticulo
     */
    public EliminarDoc(Hastable hastable, Cronometro crono, MonticuloBinario monticulo) {
        c = crono;
        hash = hastable;
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
        jLabel3 = new javax.swing.JLabel();
        NombreDocumento = new javax.swing.JTextField();
        Aceptar1 = new javax.swing.JButton();
        Cancelar1 = new javax.swing.JButton();
        nombreUser1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Eliminar Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 260, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre del documento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel1.add(NombreDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 340, 50));

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
        jPanel1.add(nombreUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 340, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre de usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar1ActionPerformed
        Inicio v3 = new Inicio(hash, c, cola);
        v3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cancelar1ActionPerformed

    private void Aceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar1ActionPerformed
        
        if(hash.usuarioPresente(nombreUser1.getText().toLowerCase())){
            if(hash.documentoPresente(NombreDocumento.getText().toLowerCase(), nombreUser1.getText().toLowerCase())){
                System.out.println("Hola");
                hash.eliminar_documento(nombreUser1.getText().toLowerCase(), NombreDocumento.getText().toLowerCase() );
                JOptionPane.showMessageDialog(null, "El documento ha sido eliminado con exito");
                System.out.println("\n");
                //hash.imprimir();
                //hash.documentoPresente(NombreDocumento.getText().toLowerCase(), nombreUser1.getText().toLowerCase());
                Inicio v3 = new Inicio(hash, c, cola);
                       v3.setVisible(true);
                       this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El documento no ha sido encontrado!!! ");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra en el sistema!!! ");
        }
    }//GEN-LAST:event_Aceptar1ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarDoc(hash, c, cola).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar1;
    private javax.swing.JButton Cancelar1;
    private javax.swing.JTextField NombreDocumento;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreUser1;
    // End of variables declaration//GEN-END:variables
}
