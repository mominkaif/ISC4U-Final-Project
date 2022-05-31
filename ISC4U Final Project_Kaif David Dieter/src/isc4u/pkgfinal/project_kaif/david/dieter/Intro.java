/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package isc4u.pkgfinal.project_kaif.david.dieter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author kaifm
 */
public class Intro extends javax.swing.JFrame {

    public DrawBoard level1;
    public DrawBoard level2;
    public DrawBoard level3;
    public DrawBoard level4;
    public DrawBoard level5;
    
    public Board board1;
    public Board board2;
    public Board board3;
    public Board board4;
    public Board board5;

    public Tile[][] map = new Tile[30][20];

    public Tile[][][] allLevels = new Tile[5][30][20];

    /**
     * Creates new form Intro
     */
    public Intro() {
        //createBoardArray method is called
        createBoardArray();
        initComponents();
        level1 = new DrawBoard(1, allLevels[0]);
        level2 = new DrawBoard(2, allLevels[1]);
        level3 = new DrawBoard(3, allLevels[2]);
        level4 = new DrawBoard(4, allLevels[3]);
        level5 = new DrawBoard(5, allLevels[4]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ravie", 2, 24)); // NOI18N
        jLabel1.setText("Welcome to Pogger!!!");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("1. You will spawn at the center of the bottom part of the screen.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("2. WASD and arrow controls for the user to move in these directions.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("3. Do not run into obstacles. These obstacles are only moving in a horizontal or vertical axis (do not change direction)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("4. Some of these obstacles are faster than others. For example, arrows are the fastest.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("5. Time your jumps in river sections so to not die in the water (only logs are safe to land on).");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Instructions: ");

        start.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        start.setText("Start Game!");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(start)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(83, 83, 83)
                .addComponent(start)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        this.setVisible(false);
        
        level1.setVisible(true);
        level2.setVisible(true);
        level3.setVisible(true);
        level4.setVisible(true);
        level5.setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables

    /**
     * This method creates 5 2D arrays (one for each level) and places them into
     * the allLevels array
     */
    private void createBoardArray() {
        int tileType = 0;
        String fileName = "";
        File f;

        //run five times for the five levels
        for (int k = 0; k < 5; k++) {
            //change file name based on the level its reading
            fileName = "src\\isc4u\\pkgfinal\\project_kaif\\david\\dieter\\Layout" + (k + 1) + ".txt";
            System.out.println(fileName); //to check if the string is creates correctly

            try {
                f = new File(fileName);
                Scanner scan = new Scanner(f);

                for (int y = 0; y < allLevels[0].length; y++) {
                    for (int x = 0; x < allLevels[0][0].length; x++) {
                        tileType = scan.nextInt();
                        if(tileType == 3){
                            allLevels[k][y][x] = new Tile(false, x * 32, y * 32, tileType);
                        }else{
                            allLevels[k][y][x] = new Tile(true, x * 32, y * 32, tileType);
                        }
                        // System.out.println(tileType);
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println("ERROR");
            }
        }
        
        for (int y = 0; y < 5; y++) {
            for (int i = 0; i < allLevels[y].length; ++i) {
                for (int j = 0; j < allLevels[y][0].length; j++) {
                    System.out.print(allLevels[y][i][j].getTexture() + " ");
                }
                System.out.println("");
            }
        }

    }
}
