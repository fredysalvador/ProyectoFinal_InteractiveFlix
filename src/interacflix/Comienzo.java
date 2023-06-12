/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interacflix;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.JOptionPane;

/**
 *
 * @author Fredy Salvador
 */
public class Comienzo extends javax.swing.JFrame {
    private final JFXPanel jfxPanel = new JFXPanel();
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaView mediaView1;
    private MediaView mediaView2;
    
    private MediaPlayer mediaPlayer3;
     private MediaView mediaView3;
     private MediaPlayer mediaPlayer4;
     private MediaView mediaView4;
     private MediaPlayer mediaPlayer5;
     private MediaView mediaView5;
      private MediaPlayer mediaPlayer6;
     private MediaView mediaView6;
     private MediaPlayer mediaPlayer7;
     private MediaView mediaView7;
    /**
     * Creates new form Comienzo
     */
    public Comienzo() {
        initComponents();
        initMediaPlayer();   
        setTitle("Java Swing Video con FX");
        setResizable(false);
        setLocationRelativeTo(null);
       this.setSize(800, 600);
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(jfxPanel, BorderLayout.CENTER);
        
        btBosqueSeleccion.setVisible(false);
        btCiudadSeleccion.setVisible(false);
        bthuirbosque.setVisible(false);
        btpeleagatobosque.setVisible(false);
        btaparecerhumildehospital.setVisible(false);
        btaparecermiedohospital.setVisible(false);
        btGoodEndingPeleaHospitalHumildad.setVisible(false);
        btBadEndingPeleaHospitalHumildad.setVisible(false);
        btpelearconmiedohuidahospital.setVisible(false);
        btarrepentirtehuidahospital.setVisible(false);
    }

        private void initMediaPlayer() {
        File file1 = new File("GatoBotas1-Escena.mp4");
        mediaPlayer1 = new MediaPlayer(
                new Media(file1.toURI().toString())
        );

        File file2 = new File("AmenazaLobo.mp4");
        mediaPlayer2 = new MediaPlayer(
                new Media(file2.toURI().toString())
        );
        
        File file3 = new File("PeleaLobo_Muerte.mp4");
        mediaPlayer3 = new MediaPlayer(
                new Media(file3.toURI().toString())
        );
        File file4 = new File("Despiertas_Muerte_Humildad.mp4");
        mediaPlayer4 = new MediaPlayer(
                new Media(file4.toURI().toString())
        );
        File file5 = new File("Ganar_Heroicamente_Gato.mp4");
        mediaPlayer5 = new MediaPlayer(
                new Media(file5.toURI().toString())
        );
        File file6 = new File("Perder_MorirHumillado_Gato.mp4");
        mediaPlayer6 = new MediaPlayer(
                new Media(file6.toURI().toString())
        );
         File file7 = new File("Hospital_Huir_Gato.mp4");
        mediaPlayer7 = new MediaPlayer(
                new Media(file7.toURI().toString())
        );
        
       
       
           

        mediaView1 = new MediaView(mediaPlayer1);
        mediaView1.setPreserveRatio(true);

        mediaView2 = new MediaView(mediaPlayer2);
        mediaView2.setPreserveRatio(true);
        
        mediaView3 = new MediaView(mediaPlayer3);
        mediaView3.setPreserveRatio(true);
        
        mediaView4 = new MediaView(mediaPlayer4);
        mediaView4.setPreserveRatio(true);
        
         mediaView5 = new MediaView(mediaPlayer5);
        mediaView5.setPreserveRatio(true);

        mediaView6 = new MediaView(mediaPlayer6);
        mediaView6.setPreserveRatio(true);
        
        mediaView7 = new MediaView(mediaPlayer7);
        mediaView7.setPreserveRatio(true);
        
        Dimension dimension = new Dimension(800, 600);
        mediaView1.setFitWidth(dimension.getWidth());
        mediaView1.setFitHeight(dimension.getHeight());
        mediaView2.setFitWidth(dimension.getWidth());
        mediaView2.setFitHeight(dimension.getHeight());
        mediaView3.setFitWidth(dimension.getWidth());
        mediaView3.setFitHeight(dimension.getHeight());
        mediaView4.setFitWidth(dimension.getWidth());
        mediaView4.setFitHeight(dimension.getHeight());
        mediaView5.setFitWidth(dimension.getWidth());
        mediaView5.setFitHeight(dimension.getHeight());
        mediaView6.setFitWidth(dimension.getWidth());
        mediaView6.setFitHeight(dimension.getHeight());
        mediaView7.setFitWidth(dimension.getWidth());
        mediaView7.setFitHeight(dimension.getHeight());
        }


    private void playVideo1() {
        jfxPanel.setScene(new Scene(new Group(mediaView1)));
        mediaPlayer1.play();
    }

    private void playVideo2() {
        jfxPanel.setScene(new Scene(new Group(mediaView2)));
        mediaPlayer2.play();
    }
    
    private void playVideo3() {
        jfxPanel.setScene(new Scene(new Group(mediaView3)));
        mediaPlayer3.play();
    }
    
      private void playVideo4() {
        jfxPanel.setScene(new Scene(new Group(mediaView4)));
        mediaPlayer4.play();
      }
      
       private void playVideo5() {
        jfxPanel.setScene(new Scene(new Group(mediaView5)));
        mediaPlayer5.play();
      }
    
        private void playVideo6() {
        jfxPanel.setScene(new Scene(new Group(mediaView6)));
        mediaPlayer6.play();
      }
       
        private void playVideo7() {
        jfxPanel.setScene(new Scene(new Group(mediaView7)));
        mediaPlayer7.play();
      }
       
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBosqueSeleccion = new javax.swing.JButton();
        btpeleagatobosque = new javax.swing.JButton();
        btaparecerhumildehospital = new javax.swing.JButton();
        btGoodEndingPeleaHospitalHumildad = new javax.swing.JButton();
        btBadEndingPeleaHospitalHumildad = new javax.swing.JButton();
        btaparecermiedohospital = new javax.swing.JButton();
        btpelearconmiedohuidahospital = new javax.swing.JButton();
        btarrepentirtehuidahospital = new javax.swing.JButton();
        bthuirbosque = new javax.swing.JButton();
        ComenzarGatoBotas = new javax.swing.JButton();
        btCiudadSeleccion = new javax.swing.JButton();
        ComenzarMarioBros = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        btBosqueSeleccion.setText("Ir al Bosque");
        btBosqueSeleccion.setMaximumSize(new java.awt.Dimension(177, 23));
        btBosqueSeleccion.setMinimumSize(new java.awt.Dimension(177, 23));
        btBosqueSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBosqueSeleccionMouseClicked(evt);
            }
        });
        btBosqueSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBosqueSeleccionActionPerformed(evt);
            }
        });
        getContentPane().add(btBosqueSeleccion);

        btpeleagatobosque.setText("Pelear");
        btpeleagatobosque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btpeleagatobosqueMouseClicked(evt);
            }
        });
        btpeleagatobosque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpeleagatobosqueActionPerformed(evt);
            }
        });
        getContentPane().add(btpeleagatobosque);

        btaparecerhumildehospital.setText("Despertar en Hospital con Humildad");
        btaparecerhumildehospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btaparecerhumildehospitalMouseClicked(evt);
            }
        });
        getContentPane().add(btaparecerhumildehospital);

        btGoodEndingPeleaHospitalHumildad.setText("Pelear con Miedo");
        btGoodEndingPeleaHospitalHumildad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btGoodEndingPeleaHospitalHumildadMouseClicked(evt);
            }
        });
        getContentPane().add(btGoodEndingPeleaHospitalHumildad);

        btBadEndingPeleaHospitalHumildad.setText("No Pelear");
        btBadEndingPeleaHospitalHumildad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBadEndingPeleaHospitalHumildadMouseClicked(evt);
            }
        });
        getContentPane().add(btBadEndingPeleaHospitalHumildad);

        btaparecermiedohospital.setText("Despertar en Hospital con Miedo");
        btaparecermiedohospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btaparecermiedohospitalMouseClicked(evt);
            }
        });
        getContentPane().add(btaparecermiedohospital);

        btpelearconmiedohuidahospital.setText("Pelear con miedo");
        getContentPane().add(btpelearconmiedohuidahospital);

        btarrepentirtehuidahospital.setText("Arrepentirte");
        getContentPane().add(btarrepentirtehuidahospital);

        bthuirbosque.setText("Huir");
        getContentPane().add(bthuirbosque);

        ComenzarGatoBotas.setText("Comenzar El Gato con botas");
        ComenzarGatoBotas.setMaximumSize(new java.awt.Dimension(177, 23));
        ComenzarGatoBotas.setMinimumSize(new java.awt.Dimension(177, 23));
        ComenzarGatoBotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComenzarGatoBotasMouseClicked(evt);
            }
        });
        ComenzarGatoBotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComenzarGatoBotasActionPerformed(evt);
            }
        });
        getContentPane().add(ComenzarGatoBotas);

        btCiudadSeleccion.setText("Ir a la Ciudad");
        getContentPane().add(btCiudadSeleccion);

        ComenzarMarioBros.setText("Comenzar Super Mario Bros");
        ComenzarMarioBros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComenzarMarioBrosMouseClicked(evt);
            }
        });
        getContentPane().add(ComenzarMarioBros);

        jLayeredPane1.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.add(jPanel1);

        getContentPane().add(jLayeredPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBosqueSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBosqueSeleccionMouseClicked
        // TODO add your handling code here:
        btBosqueSeleccion.setVisible(false);
        btCiudadSeleccion.setVisible(false);
        bthuirbosque.setVisible(true);
        btpeleagatobosque.setVisible(true);
        
        playVideo2();
    }//GEN-LAST:event_btBosqueSeleccionMouseClicked

    private void btBosqueSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBosqueSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBosqueSeleccionActionPerformed

    private void ComenzarGatoBotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComenzarGatoBotasMouseClicked
        // TODO add your handling code here:
        btBosqueSeleccion.setVisible(true);
        btCiudadSeleccion.setVisible(true);
        ComenzarGatoBotas.setVisible(false);
        ComenzarMarioBros.setVisible(false);
        
        playVideo1();
    }//GEN-LAST:event_ComenzarGatoBotasMouseClicked

    private void ComenzarGatoBotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComenzarGatoBotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComenzarGatoBotasActionPerformed

    private void ComenzarMarioBrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComenzarMarioBrosMouseClicked
        // TODO add your handling code here:
        playVideo2();
    }//GEN-LAST:event_ComenzarMarioBrosMouseClicked

    private void btpeleagatobosqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpeleagatobosqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btpeleagatobosqueActionPerformed

    private void btpeleagatobosqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpeleagatobosqueMouseClicked
        // TODO add your handling code here:
        bthuirbosque.setVisible(false);
        btpeleagatobosque.setVisible(false);
        btaparecerhumildehospital.setVisible(true);
        btaparecermiedohospital.setVisible(true);
        
        
        
        playVideo3();
        
    }//GEN-LAST:event_btpeleagatobosqueMouseClicked

    private void btaparecerhumildehospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaparecerhumildehospitalMouseClicked
        // TODO add your handling code here:
          btaparecerhumildehospital.setVisible(false);
        btaparecermiedohospital.setVisible(false);        
        btGoodEndingPeleaHospitalHumildad.setVisible(true);
        btBadEndingPeleaHospitalHumildad.setVisible(true);
        
        playVideo4();
    }//GEN-LAST:event_btaparecerhumildehospitalMouseClicked

    private void btGoodEndingPeleaHospitalHumildadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGoodEndingPeleaHospitalHumildadMouseClicked
        // TODO add your handling code here:
         btGoodEndingPeleaHospitalHumildad.setVisible(false);
        btBadEndingPeleaHospitalHumildad.setVisible(false);
        playVideo5();
        
         ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_btGoodEndingPeleaHospitalHumildadMouseClicked

    private void btBadEndingPeleaHospitalHumildadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBadEndingPeleaHospitalHumildadMouseClicked
        // TODO add your handling code here:
        btGoodEndingPeleaHospitalHumildad.setVisible(false);
        btBadEndingPeleaHospitalHumildad.setVisible(false);
        playVideo6();
        
         ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_btBadEndingPeleaHospitalHumildadMouseClicked

    private void btaparecermiedohospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaparecermiedohospitalMouseClicked
        // TODO add your handling code here:
        btaparecerhumildehospital.setVisible(false);
        btaparecermiedohospital.setVisible(false);        
        btpelearconmiedohuidahospital.setVisible(true);
        btarrepentirtehuidahospital.setVisible(true);
        
        playVideo7();
    }//GEN-LAST:event_btaparecermiedohospitalMouseClicked

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
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comienzo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comienzo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComenzarGatoBotas;
    private javax.swing.JButton ComenzarMarioBros;
    private javax.swing.JButton btBadEndingPeleaHospitalHumildad;
    private javax.swing.JButton btBosqueSeleccion;
    private javax.swing.JButton btCiudadSeleccion;
    private javax.swing.JButton btGoodEndingPeleaHospitalHumildad;
    private javax.swing.JButton btaparecerhumildehospital;
    private javax.swing.JButton btaparecermiedohospital;
    private javax.swing.JButton btarrepentirtehuidahospital;
    private javax.swing.JButton bthuirbosque;
    private javax.swing.JButton btpeleagatobosque;
    private javax.swing.JButton btpelearconmiedohuidahospital;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
