/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;

/**
 *
 * @author Jenny
 */
public class gui extends javax.swing.JFrame {
    
    logica radio;
    DecimalFormat df;
    /**
     * Creates new form gui
     */
    public gui() {
        initComponents();
        radio = new logica();
        df = new DecimalFormat("####0.00");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        adelanteEmisora = new javax.swing.JButton();
        emisoraActual = new javax.swing.JTextField();
        masNum = new javax.swing.JButton();
        btnGUI = new javax.swing.JTextField();
        select = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        am = new javax.swing.JButton();
        fm = new javax.swing.JButton();
        encendido = new javax.swing.JButton();
        apagado = new javax.swing.JButton();
        frecuen = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adelanteEmisora.setText(">>");
        adelanteEmisora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteEmisoraActionPerformed(evt);
            }
        });

        emisoraActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emisoraActualActionPerformed(evt);
            }
        });

        masNum.setText(">>");
        masNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masNumActionPerformed(evt);
            }
        });

        btnGUI.setText("1");

        select.setText("Seleccionar");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        am.setText("AM");
        am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amActionPerformed(evt);
            }
        });

        fm.setText("FM");
        fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmActionPerformed(evt);
            }
        });

        encendido.setText("ON");
        encendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encendidoActionPerformed(evt);
            }
        });

        apagado.setText("OFF");
        apagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagadoActionPerformed(evt);
            }
        });

        frecuen.setText("frecuencia");
        frecuen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecuenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(frecuen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encendido, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fm, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(apagado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(masNum))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emisoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(adelanteEmisora)))
                                .addGap(0, 80, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(am)
                    .addComponent(fm)
                    .addComponent(encendido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apagado)
                    .addComponent(emisoraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adelanteEmisora))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(masNum)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frecuen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adelanteEmisoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteEmisoraActionPerformed
        radio.setEmisora(Double.parseDouble(emisoraActual.getText()));
        emisoraActual.setText(Double.toString(radio.getEmisora()));
    }//GEN-LAST:event_adelanteEmisoraActionPerformed

    private void masNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masNumActionPerformed
        String str;
        str=Integer.toUnsignedString(Integer.parseInt(btnGUI.getText())+1);
        btnGUI.setText(str);
        if(Integer.parseInt(btnGUI.getText())>12){
            btnGUI.setText(Integer.toUnsignedString(1));
        }
    }//GEN-LAST:event_masNumActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        emisoraActual.setText(Double.toString(radio.selectEmisora(Integer.parseInt(btnGUI.getText()))));
    }//GEN-LAST:event_selectActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        radio.saveEmisora(Integer.parseInt(btnGUI.getText()), Double.parseDouble(emisoraActual.getText()));
    }//GEN-LAST:event_guardarActionPerformed

    private void fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmActionPerformed
        radio.setFrecuencia(true);
        frecuen.setText("FM");
        emisoraActual.setText("87.9");
        
    }//GEN-LAST:event_fmActionPerformed

    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
        radio.setFrecuencia(false);
        frecuen.setText("AM");
        emisoraActual.setText("530");
       
    }//GEN-LAST:event_amActionPerformed

    private void frecuenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecuenActionPerformed
       
       
    }//GEN-LAST:event_frecuenActionPerformed

    private void apagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagadoActionPerformed
        am.setEnabled(false);
        fm.setEnabled(false);
        guardar.setEnabled(false);
        masNum.setEnabled(false);
        select.setEnabled(false);
        adelanteEmisora.setEnabled(false);
        emisoraActual.setText("");
        frecuen.setText("");
        btnGUI.setText("");
        
    }//GEN-LAST:event_apagadoActionPerformed

    private void emisoraActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emisoraActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emisoraActualActionPerformed

    private void encendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encendidoActionPerformed
        am.setEnabled(true);
        fm.setEnabled(true);
        guardar.setEnabled(true);
        masNum.setEnabled(true);
        select.setEnabled(true);
        adelanteEmisora.setEnabled(true);
        emisoraActual.setText("");
        frecuen.setText("Frecuencia");
        btnGUI.setText("1");
    }//GEN-LAST:event_encendidoActionPerformed

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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelanteEmisora;
    private javax.swing.JButton am;
    private javax.swing.JButton apagado;
    private javax.swing.JTextField btnGUI;
    private javax.swing.JTextField emisoraActual;
    private javax.swing.JButton encendido;
    private javax.swing.JButton fm;
    private javax.swing.JTextField frecuen;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton masNum;
    private javax.swing.JButton select;
    // End of variables declaration//GEN-END:variables
}
