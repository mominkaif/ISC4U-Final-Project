/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package isc4u.pkgfinal.project_kaif.david.dieter;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


/**
 *
 * @author kaifm
 */
public class Intro extends javax.swing.JFrame {

    public boolean play = true;
    
    public File s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/sega-playboicarti.wav");
    public Sound menuSound = new Sound(s, false);
    
    /**
     * Creates new form Intro
     */
    public Intro() {
        initComponents();
        background.setIcon(new ImageIcon("src/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/introBack.png"));
        menuSound.play();
        //File s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/sega-playboicarti.wav");
        //Sound sound = new Sound(s, false);
        //sound.play();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Ravie", 2, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title.setText(" Pogger.");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("WASD/Arrow keys to move.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 50));

        start.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        start.setText("PLAY.");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 767, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Enemies will kill you...");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 610, 780));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Get to the top.");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        
        menuSound.stop();
        this.setVisible(false);
        
        

        File s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/beach-trap-beat.wav");
        Sound sound1 = new Sound(s, false);
        s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/winter-trap-beat.wav");
        Sound sound2 = new Sound(s, false);
        s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/choir-type-beat.wav");
        Sound sound3 = new Sound(s, false);
        s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/Migos - Walk It Talk It ft. Drake (Instrumental) (Culture 2).wav");
        Sound sound4 = new Sound(s, false);
        s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/Plug Walk Instrumental (Best Version).wav");
        Sound sound5 = new Sound(s, false);

        playGame();
    }//GEN-LAST:event_startActionPerformed

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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //instantiate the main window
                DrawBoard windowFrame = new DrawBoard(0, null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton start;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    

    

}
