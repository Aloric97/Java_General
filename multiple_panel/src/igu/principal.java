/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leand
 */
public class principal extends javax.swing.JFrame implements ActionListener{

    panel1 panel1= new panel1();
    panel2 panel2= new panel2();
    
    
    public principal() {
        initComponents();
        
        contenedor.add(panel1);
        panel1.setVisible(true);
        panel2.setVisible(false);
        
        deshabilitarBotones();
        
        
        btn_anterior.addActionListener(this);
        btn_siguiente.addActionListener(this);
        
    }
    
    private void deshabilitarBotones(){
    
        if (panel1.isVisible()){
            btn_anterior.setEnabled(false);
            btn_siguiente.setEnabled(true);
        }else if(panel2.isVisible()){
            btn_anterior.setEnabled(true);
            btn_siguiente.setEnabled(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_anterior = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 185, 142));

        contenedor.setLayout(new java.awt.BorderLayout());

        btn_anterior.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btn_anterior.setText("atras");
        btn_anterior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_anterior.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(btn_anterior);

        btn_siguiente.setFont(new java.awt.Font("Sitka Small", 0, 13)); // NOI18N
        btn_siguiente.setText("siguiente");
        btn_siguiente.setToolTipText("");
        btn_siguiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_siguiente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(btn_siguiente);

        contenedor.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        
        if(evt.equals(btn_anterior)){
        
            panel2.setVisible(false);
            panel1.setVisible(true);
            
            contenedor.add(panel1);
            contenedor.validate();
            
            deshabilitarBotones();
            
        }else if(evt.equals(btn_siguiente)){
            
            panel2.setVisible(true);
            panel1.setVisible(false);
            
            contenedor.add(panel2);
            contenedor.validate();
            
            deshabilitarBotones();
        
        }
    }
        
}
