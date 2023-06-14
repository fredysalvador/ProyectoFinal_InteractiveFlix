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
     private MediaPlayer mediaPlayer8;
     private MediaView mediaView8;
     private MediaPlayer mediaPlayer9;
     private MediaView mediaView9;
     private MediaPlayer mediaPlayer10;
     private MediaView mediaView10;
     private MediaPlayer mediaPlayer11;
     private MediaView mediaView11;
     private MediaPlayer mediaPlayer12;
     private MediaView mediaView12;
     private MediaPlayer mediaPlayer13;
     private MediaView mediaView13;
      private MediaPlayer mediaPlayer14;
     private MediaView mediaView14;
       private MediaPlayer mediaPlayer15;
     private MediaView mediaView15;
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
        btdespertarenhospitalMotivacion.setVisible(false);
        btdespertarhospitaldesmotivado.setVisible(false);
        btPelearMotivado.setVisible(false);
        btPelearRendirse.setVisible(false);
        bthuirperro.setVisible(false);
        btquedarseperro.setVisible(false);
        btMasVidas.setVisible(false);
        btpelearconperro.setVisible(false);
        
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
          File file8 = new File("Pelea_Huilliendomiedoarbol_Gato.mp4");
        mediaPlayer8 = new MediaPlayer(
                new Media(file8.toURI().toString())
        );
        
           File file9 = new File("Huir_MiedoCueva_Gato.mp4");
        mediaPlayer9 = new MediaPlayer(
                new Media(file9.toURI().toString())
        );
        
         File file10 = new File("PenultimaMuerte_Gato_Huir.mp4");
        mediaPlayer10 = new MediaPlayer(
                new Media(file10.toURI().toString())
        );
        
         File file11 = new File("GatoCristal_Motivado.mp4");
        mediaPlayer11 = new MediaPlayer(
                new Media(file11.toURI().toString())
        );
       
         File file12 = new File("VividorDigno.mp4");
        mediaPlayer12 = new MediaPlayer(
                new Media(file12.toURI().toString())
        );
       
         File file13 = new File("finalsinopeleabueno.mp4");
        mediaPlayer13 = new MediaPlayer(
                new Media(file13.toURI().toString())
        );
       
        File file14 = new File("depriimidocasavieja.mp4");
        mediaPlayer14 = new MediaPlayer(
                new Media(file14.toURI().toString())
        );
       
         File file15 = new File("lamuerte4kenestrella.mp4");
        mediaPlayer15 = new MediaPlayer(
                new Media(file15.toURI().toString())
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
        
        mediaView8 = new MediaView(mediaPlayer8);
        mediaView8.setPreserveRatio(true);
        
        mediaView9 = new MediaView(mediaPlayer9);
        mediaView9.setPreserveRatio(true);
        
        mediaView10 = new MediaView(mediaPlayer10);
        mediaView10.setPreserveRatio(true);
        
        mediaView11 = new MediaView(mediaPlayer11);
        mediaView11.setPreserveRatio(true);
        
        mediaView12 = new MediaView(mediaPlayer12);
        mediaView12.setPreserveRatio(true);
        
        mediaView13 = new MediaView(mediaPlayer13);
        mediaView13.setPreserveRatio(true);
        
        mediaView14 = new MediaView(mediaPlayer14);
        mediaView14.setPreserveRatio(true);
        
        mediaView15 = new MediaView(mediaPlayer15);
        mediaView15.setPreserveRatio(true);
        
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
          mediaView8.setFitWidth(dimension.getWidth());
        mediaView8.setFitHeight(dimension.getHeight());
         mediaView9.setFitWidth(dimension.getWidth());
        mediaView9.setFitHeight(dimension.getHeight());
        mediaView10.setFitWidth(dimension.getWidth());
        mediaView10.setFitHeight(dimension.getHeight());
        mediaView11.setFitWidth(dimension.getWidth());
        mediaView11.setFitHeight(dimension.getHeight());
        mediaView12.setFitWidth(dimension.getWidth());
        mediaView12.setFitHeight(dimension.getHeight());
        mediaView13.setFitWidth(dimension.getWidth());
        mediaView13.setFitHeight(dimension.getHeight());
         mediaView14.setFitWidth(dimension.getWidth());
        mediaView14.setFitHeight(dimension.getHeight());
        mediaView15.setFitWidth(dimension.getWidth());
        mediaView15.setFitHeight(dimension.getHeight());
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
        
        private void playVideo8() {
        jfxPanel.setScene(new Scene(new Group(mediaView8)));
        mediaPlayer8.play();
      }
      
        private void playVideo9() {
        jfxPanel.setScene(new Scene(new Group(mediaView9)));
        mediaPlayer9.play();
      }
        private void playVideo10() {
        jfxPanel.setScene(new Scene(new Group(mediaView10)));
        mediaPlayer10.play();
      }
        
        private void playVideo11() {
        jfxPanel.setScene(new Scene(new Group(mediaView11)));
        mediaPlayer11.play();
      }
        
        private void playVideo12() {
        jfxPanel.setScene(new Scene(new Group(mediaView12)));
        mediaPlayer12.play();
      }
        
        private void playVideo13() {
        jfxPanel.setScene(new Scene(new Group(mediaView13)));
        mediaPlayer13.play();
      }
        
        private void playVideo14() {
        jfxPanel.setScene(new Scene(new Group(mediaView14)));
        mediaPlayer14.play();
      }
        
        private void playVideo15() {
        jfxPanel.setScene(new Scene(new Group(mediaView15)));
        mediaPlayer15.play();
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
        btdespertarenhospitalMotivacion = new javax.swing.JButton();
        btPelearMotivado = new javax.swing.JButton();
        btPelearRendirse = new javax.swing.JButton();
        btdespertarhospitaldesmotivado = new javax.swing.JButton();
        bthuirperro = new javax.swing.JButton();
        btMasVidas = new javax.swing.JButton();
        btpelearconperro = new javax.swing.JButton();
        btquedarseperro = new javax.swing.JButton();
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
        btpelearconmiedohuidahospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btpelearconmiedohuidahospitalMouseClicked(evt);
            }
        });
        getContentPane().add(btpelearconmiedohuidahospital);

        btarrepentirtehuidahospital.setText("Arrepentirte");
        btarrepentirtehuidahospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btarrepentirtehuidahospitalMouseClicked(evt);
            }
        });
        getContentPane().add(btarrepentirtehuidahospital);

        bthuirbosque.setText("Huir");
        bthuirbosque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bthuirbosqueMouseClicked(evt);
            }
        });
        getContentPane().add(bthuirbosque);

        btdespertarenhospitalMotivacion.setText("Despertar Motivado en Hospital");
        btdespertarenhospitalMotivacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btdespertarenhospitalMotivacionMouseClicked(evt);
            }
        });
        getContentPane().add(btdespertarenhospitalMotivacion);

        btPelearMotivado.setText("Pelear");
        btPelearMotivado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPelearMotivadoMouseClicked(evt);
            }
        });
        btPelearMotivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPelearMotivadoActionPerformed(evt);
            }
        });
        getContentPane().add(btPelearMotivado);

        btPelearRendirse.setText("Rendirse");
        btPelearRendirse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPelearRendirseMouseClicked(evt);
            }
        });
        btPelearRendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPelearRendirseActionPerformed(evt);
            }
        });
        getContentPane().add(btPelearRendirse);

        btdespertarhospitaldesmotivado.setText("Despertar Desmotivado en Hospital");
        btdespertarhospitaldesmotivado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btdespertarhospitaldesmotivadoMouseClicked(evt);
            }
        });
        getContentPane().add(btdespertarhospitaldesmotivado);

        bthuirperro.setText("Huir con Perro");
        bthuirperro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bthuirperroMouseClicked(evt);
            }
        });
        getContentPane().add(bthuirperro);

        btMasVidas.setText("Obtener mas vidas");
        getContentPane().add(btMasVidas);

        btpelearconperro.setText("Pelear con Valentia");
        getContentPane().add(btpelearconperro);

        btquedarseperro.setText("Quedarse con Perro");
        getContentPane().add(btquedarseperro);

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

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0));

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

    private void btpelearconmiedohuidahospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpelearconmiedohuidahospitalMouseClicked
        // TODO add your handling code here:
        btpelearconmiedohuidahospital.setVisible(false);
        btarrepentirtehuidahospital.setVisible(false);
        playVideo8();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);        
                
    }//GEN-LAST:event_btpelearconmiedohuidahospitalMouseClicked

    private void btarrepentirtehuidahospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btarrepentirtehuidahospitalMouseClicked
        // TODO add your handling code here:
         btpelearconmiedohuidahospital.setVisible(false);
        btarrepentirtehuidahospital.setVisible(false);
        playVideo9();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);  
      
    }//GEN-LAST:event_btarrepentirtehuidahospitalMouseClicked

    private void bthuirbosqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthuirbosqueMouseClicked
        // TODO add your handling code here:
        bthuirbosque.setVisible(false);
        btpeleagatobosque.setVisible(false);
        btdespertarenhospitalMotivacion.setVisible(true);
        btdespertarhospitaldesmotivado.setVisible(true);
        playVideo10();
    }//GEN-LAST:event_bthuirbosqueMouseClicked

    private void btdespertarenhospitalMotivacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdespertarenhospitalMotivacionMouseClicked
        // TODO add your handling code here:
        
        btdespertarenhospitalMotivacion.setVisible(false);
        btdespertarhospitaldesmotivado.setVisible(false); 
        btPelearMotivado.setVisible(true);
        btPelearRendirse.setVisible(true);
        
        playVideo11(); 
    }//GEN-LAST:event_btdespertarenhospitalMotivacionMouseClicked

    private void btPelearRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPelearRendirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPelearRendirseActionPerformed

    private void btPelearMotivadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPelearMotivadoMouseClicked

         btPelearMotivado.setVisible(false);
        btPelearRendirse.setVisible(false);
        playVideo12();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);  
        // TODO add your handling code here:
    }//GEN-LAST:event_btPelearMotivadoMouseClicked

    private void btPelearRendirseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPelearRendirseMouseClicked

          btPelearMotivado.setVisible(false);
        btPelearRendirse.setVisible(false);
        playVideo13(); 
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);  
// TODO add your handling code here:
    }//GEN-LAST:event_btPelearRendirseMouseClicked

    private void btPelearMotivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPelearMotivadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPelearMotivadoActionPerformed

    private void btdespertarhospitaldesmotivadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdespertarhospitaldesmotivadoMouseClicked
        // TODO add your handling code here:
         btdespertarenhospitalMotivacion.setVisible(false);
        btdespertarhospitaldesmotivado.setVisible(false); 
        bthuirperro.setVisible(true);
        btquedarseperro.setVisible(true);
        
        
        playVideo14();
        
        
    }//GEN-LAST:event_btdespertarhospitaldesmotivadoMouseClicked

    private void bthuirperroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthuirperroMouseClicked
        // TODO add your handling code here:
         bthuirperro.setVisible(false);
        btquedarseperro.setVisible(false);
        btMasVidas.setVisible(true);
        btpelearconperro.setVisible(true);
        playVideo15();
    }//GEN-LAST:event_bthuirperroMouseClicked

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
    private javax.swing.JButton btMasVidas;
    private javax.swing.JButton btPelearMotivado;
    private javax.swing.JButton btPelearRendirse;
    private javax.swing.JButton btaparecerhumildehospital;
    private javax.swing.JButton btaparecermiedohospital;
    private javax.swing.JButton btarrepentirtehuidahospital;
    private javax.swing.JButton btdespertarenhospitalMotivacion;
    private javax.swing.JButton btdespertarhospitaldesmotivado;
    private javax.swing.JButton bthuirbosque;
    private javax.swing.JButton bthuirperro;
    private javax.swing.JButton btpeleagatobosque;
    private javax.swing.JButton btpelearconmiedohuidahospital;
    private javax.swing.JButton btpelearconperro;
    private javax.swing.JButton btquedarseperro;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
