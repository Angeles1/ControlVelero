
import java.awt.Image;
import javax.swing.ImageIcon;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Entrar
 */
public class Velero extends javax.swing.JFrame {

    /**
     * Creates new form Velero
     */
    public Velero() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @return 
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Controles = new javax.swing.JPanel();
        Vela = new javax.swing.JSlider();
        Timon = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        Lienzo = new panelGrafico();
        Autor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controles de un Velero");
        setBackground(new java.awt.Color(153, 153, 255));
        setIconImage(new javax.swing.ImageIcon("src\\Iconos\\1.png").getImage() );

        Controles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        Vela.setMaximum(90);
        Vela.setMinimum(-90);
        Vela.setToolTipText("Orientación de la vela respecto al eje horizontal");
        Vela.setValue(0);
        Vela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control Vela", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Vela.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VelaStateChanged(evt);
            }
        });
        Vela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VelaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VelaMouseEntered(evt);
            }
        });

        Timon.setMaximum(90);
        Timon.setMinimum(-90);
        Timon.setToolTipText("Orientación del Timón respecto al eje horizontal");
        Timon.setValue(0);
        Timon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control Timón", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        Timon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TimonStateChanged(evt);
            }
        });
        Timon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TimonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TimonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout ControlesLayout = new javax.swing.GroupLayout(Controles);
        Controles.setLayout(ControlesLayout);
        ControlesLayout.setHorizontalGroup(
            ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Timon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ControlesLayout.setVerticalGroup(
            ControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Vela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Timon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout LienzoLayout = new javax.swing.GroupLayout(Lienzo);
        Lienzo.setLayout(LienzoLayout);
        LienzoLayout.setHorizontalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );
        LienzoLayout.setVerticalGroup(
            LienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Autor.setText("Hecho por Ángeles Fuentes Expósito para DIU.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Controles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Autor)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Controles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Autor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VelaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VelaStateChanged
        // TODO add your handling code here:
        Lienzo.anguloVela = Vela.getValue()*Math.PI/180.0;
        Lienzo.repaint();
    }//GEN-LAST:event_VelaStateChanged

    private void TimonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TimonStateChanged
        Lienzo.anguloTimon=Timon.getValue()*Math.PI/180.0;
        Lienzo.repaint();

    }//GEN-LAST:event_TimonStateChanged

    private void TimonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimonMouseEntered
        
        Lienzo.focusTimon=true;
        Lienzo.repaint();
    }//GEN-LAST:event_TimonMouseEntered

    private void TimonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimonMouseExited
        // TODO add your handling code here:
        Lienzo.focusTimon=false;
        Lienzo.repaint();
    }//GEN-LAST:event_TimonMouseExited

    private void VelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VelaMouseEntered
        // TODO add your handling code here:
        Lienzo.focusVela=true;
        Lienzo.repaint();
    }//GEN-LAST:event_VelaMouseEntered

    private void VelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VelaMouseExited
        // TODO add your handling code here:
        Lienzo.focusVela=false;
        Lienzo.repaint();
    }//GEN-LAST:event_VelaMouseExited

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
            java.util.logging.Logger.getLogger(Velero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Velero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Velero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Velero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Velero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JPanel Controles;
    private panelGrafico Lienzo;
    private javax.swing.JSlider Timon;
    private javax.swing.JSlider Vela;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
