/* Intro Class
 */
package isc4u.pkgfinal.project_kaif.david.dieter;

import static isc4u.pkgfinal.project_kaif.david.dieter.DrawBoard.allBoards;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author kaifm
 */
public class Intro extends javax.swing.JFrame {

    private boolean play = true;

    private File s = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/Sounds/sega-playboicarti.wav");
    private Sound menuSound = new Sound(s, true);

    /**
     * Creates new form Intro
     */
    public Intro() {
        initComponents();
        background.setIcon(new ImageIcon("src/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/introBack.png"));
        menuSound.play();
        setLocationRelativeTo(null);
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
        title.setText(" Pogger");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("WASD/Arrow keys to move.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 50));

        start.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        start.setText("PLAY");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        createBoardArray();
        System.out.println("loaded array");

        DrawBoard.loadGame();
        //DrawBoard.playGame();
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
    
    
    /**
     * create board array method
     * loads the board array
     */
    private void createBoardArray() {
        for (int i = 0; i < allBoards.length; i++) {
            allBoards[i] = new Board(null, null, null);
            setTiles(i);
            setSound(i);
            setEnemies(i);
            setPlatforms(i);
        }
    }
    /**
     * setTiles method
     * reads from a data file to set the tile map of each board
     * @param level - level being read
     */
    public void setTiles(int level) {
        Image tile;
        int tileType;

        //change file name based on the level its reading
        String fileName = "src/isc4u/pkgfinal/project_kaif/david/dieter/Layout" + (level+1) + ".txt";
        System.out.println(fileName); //to check if the right file is being read

        try {
            //first: getting tiles for the board
            Tile[][] map = new Tile[30][20];
            File f = new File(fileName);
            Scanner scan = new Scanner(f);
            for (int y = 0; y < 30; y++) {
                for (int x = 0; x < 20; x++) {

                    tileType = scan.nextInt();
                    //sets Image object to the tile image attribute
                    tile = new ImageIcon(this.getClass().getResource("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/" + tileType + ".png")).getImage();
                    if (tileType == 3) {//checks if the tile is water
                        map[y][x] = new Tile(false, x, y, tile);
                    } else {
                        map[y][x] = new Tile(true, x, y, tile);
                    }
                }
            }

            //making board object
            allBoards[level].setTileMap(map);
        } catch (FileNotFoundException ex) {
            System.out.println("couldn't do the thing");
        }

    }
    /**
     * setSound method
     * reads from a data file to set the sound of each board
     * @param level - level being read
     */
    public void setSound(int level) {
        try {
            //second: getting sounds for the board
            File f = new File("src/isc4u/pkgfinal/project_kaif/david/dieter/boardsounds.txt");
            Scanner soundScan = new Scanner(f);
            File g = new File(soundScan.nextLine());
            Sound s = new Sound(g, true);
            allBoards[level].setSoundtrack(s);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    /**
     * setEnemies method
     * reads from a data file to add enemies from a data file to a board's entity list
     * @param level - level being read
     */
    private void setEnemies(int level) {
        try {
            Scanner scanner = new Scanner("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/Enemies" + level+1 + ".txt");
            while (scanner.hasNextLine()) {
                String enemyName = scanner.nextLine();
                //for a ghost enemy

                Image icon = new ImageIcon(this.getClass().getResource("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/" + enemyName + ".png")).getImage();
                int x = Integer.parseInt(scanner.nextLine());
                int y = Integer.parseInt(scanner.nextLine());
                int xSpeed = Integer.parseInt(scanner.nextLine());
                int ySpeed = Integer.parseInt(scanner.nextLine());
                Enemy enemy = new Enemy(icon, x, y, xSpeed, ySpeed);

                allBoards[level].addEntity(enemy);
            }

        } catch (Exception e) {
            System.out.println("Error!" + e);
        }
    }
    /**
     * setPlatforms method
     * reads from a data file to add platforms from a data file to a board's entity list
     * @param level - level being read
     */
    private void setPlatforms(int level) {
        try {
            Scanner scanner = new Scanner("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/Platforms" + level + ".txt");

            while (scanner.hasNextLine()) {
                String platformName = scanner.nextLine();
                Image icon = new ImageIcon(this.getClass().getResource("/isc4u/pkgfinal/project_kaif/david/dieter/Tiles/" + platformName + ".png")).getImage();
                int x = Integer.parseInt(scanner.nextLine());
                int y = Integer.parseInt(scanner.nextLine());
                int xSpeed = Integer.parseInt(scanner.nextLine());
                int ySpeed = Integer.parseInt(scanner.nextLine());
                Platform platform = new Platform(icon, x, y, xSpeed, ySpeed);

                allBoards[level].addEntity(platform);
            }
        } catch (Exception e) {
            System.out.println("Error!" + e);
        }
    }

}
