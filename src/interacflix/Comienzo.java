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
    private MediaPlayer mediaPlayer16;
    private MediaView mediaView16;
    private MediaPlayer mediaPlayer17;
    private MediaView mediaView17;
    private MediaPlayer mediaPlayer18;
    private MediaView mediaView18;
    private MediaPlayer mediaPlayer19;
    private MediaView mediaView19;
    private MediaPlayer mediaPlayer20;
    private MediaView mediaView20;
    private MediaPlayer mediaPlayer21;
    private MediaView mediaView21;
    private MediaPlayer mediaPlayer22;
    private MediaView mediaView22;
    private MediaPlayer mediaPlayer23;
    private MediaView mediaView23;
    private MediaPlayer mediaPlayer24;
    private MediaView mediaView24;
    private MediaPlayer mediaPlayer25;
    private MediaView mediaView25;
    private MediaPlayer mediaPlayer26;
    private MediaView mediaView26;
    private MediaPlayer mediaPlayer27;
    private MediaView mediaView27;
    private MediaPlayer mediaPlayer28;
    private MediaView mediaView28;
    private MediaPlayer mediaPlayer29;
    private MediaView mediaView29;
    private MediaPlayer mediaPlayer30;
    private MediaView mediaView30;
    private MediaPlayer mediaPlayer31;
    private MediaView mediaView31;
    private MediaPlayer mediaPlayer32;
    private MediaView mediaView32;
    private MediaPlayer mediaPlayer33;
    private MediaView mediaView33;
    private MediaPlayer mediaPlayer34;
    private MediaView mediaView34;

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
        bthuirconosos.setVisible(false);
        btEsperarOso.setVisible(false);
        btburlarse.setVisible(false);
        btirgolemtranquilamente.setVisible(false);
        btbuscarsolucionultimavida.setVisible(false);
        btignorarultimavida.setVisible(false);
        BuscarLoboDecidido.setVisible(false);
        AyudarAGenteDecidido.setVisible(false);

        PelearMuerteIgnorada.setVisible(false);
        RendirsemuerteIgnorada.setVisible(false);
        btAyudarAmigos.setVisible(false);
        btconseguirlaestrella.setVisible(false);

        btArriesgarVida.setVisible(false);
        btAbandonarVidas.setVisible(false);

         btabandonarybuscaramigos.setVisible(false);
        btcumplirdeseo.setVisible(false);
        
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

        File file16 = new File("goodfinaldeseo.mp4");
        mediaPlayer16 = new MediaPlayer(
                new Media(file16.toURI().toString())
        );

        File file17 = new File("sobreviramenazado.mp4");
        mediaPlayer17 = new MediaPlayer(
                new Media(file17.toURI().toString())
        );

        File file18 = new File("EntranOsosCasa.mp4");
        mediaPlayer18 = new MediaPlayer(
                new Media(file18.toURI().toString())
        );

        File file19 = new File("finalfelizamor.mp4");
        mediaPlayer19 = new MediaPlayer(
                new Media(file19.toURI().toString())
        );

        File file20 = new File("gatohablaconosos.mp4");
        mediaPlayer20 = new MediaPlayer(
                new Media(file20.toURI().toString())
        );

        File file21 = new File("ciudadpeleagigante.mp4");
        mediaPlayer21 = new MediaPlayer(
                new Media(file21.toURI().toString())
        );

        File file22 = new File("muertecampana.mp4");
        mediaPlayer22 = new MediaPlayer(
                new Media(file22.toURI().toString())
        );

        File file23 = new File("muertecrystal.mp4");
        mediaPlayer23 = new MediaPlayer(
                new Media(file23.toURI().toString())
        );

        File file24 = new File("ayudargente.mp4");
        mediaPlayer24 = new MediaPlayer(
                new Media(file24.toURI().toString())
        );

        File file25 = new File("loboencuentraignorado.mp4");
        mediaPlayer25 = new MediaPlayer(
                new Media(file25.toURI().toString())
        );

        File file26 = new File("muerteperro.mp4");
        mediaPlayer26 = new MediaPlayer(
                new Media(file26.toURI().toString())
        );

        File file27 = new File("muerteexceso.mp4");
        mediaPlayer27 = new MediaPlayer(
                new Media(file27.toURI().toString())
        );

        File file28 = new File("salvaramigos.mp4");
        mediaPlayer28 = new MediaPlayer(
                new Media(file28.toURI().toString())
        );

        File file29 = new File("velaralucionacnioens.mp4");
        mediaPlayer29 = new MediaPlayer(
                new Media(file29.toURI().toString())
        );

        File file30 = new File("abandonaramigosmuerte.mp4");
        mediaPlayer30 = new MediaPlayer(
                new Media(file30.toURI().toString())
        );

        File file31 = new File("victoriatroz.mp4");
        mediaPlayer31 = new MediaPlayer(
                new Media(file31.toURI().toString())
        );
        File file32 = new File("UltimaOportunidad.mp4");
        mediaPlayer32 = new MediaPlayer(
                new Media(file32.toURI().toString())
        );
        File file33 = new File("finalfelizperrokitty.mp4");
        mediaPlayer33 = new MediaPlayer(
                new Media(file33.toURI().toString())
        );
        File file34 = new File("traicionsolo.mp4");
        mediaPlayer34 = new MediaPlayer(
                new Media(file34.toURI().toString())
        );

        //salvaramigos.mp4
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

        mediaView16 = new MediaView(mediaPlayer16);
        mediaView16.setPreserveRatio(true);

        mediaView17 = new MediaView(mediaPlayer17);
        mediaView17.setPreserveRatio(true);

        mediaView18 = new MediaView(mediaPlayer18);
        mediaView18.setPreserveRatio(true);

        mediaView19 = new MediaView(mediaPlayer19);
        mediaView19.setPreserveRatio(true);

        mediaView20 = new MediaView(mediaPlayer20);
        mediaView20.setPreserveRatio(true);

        mediaView21 = new MediaView(mediaPlayer21);
        mediaView21.setPreserveRatio(true);

        mediaView22 = new MediaView(mediaPlayer22);
        mediaView22.setPreserveRatio(true);

        mediaView23 = new MediaView(mediaPlayer23);
        mediaView23.setPreserveRatio(true);

        mediaView24 = new MediaView(mediaPlayer24);
        mediaView24.setPreserveRatio(true);

        mediaView25 = new MediaView(mediaPlayer25);
        mediaView25.setPreserveRatio(true);

        mediaView26 = new MediaView(mediaPlayer26);
        mediaView26.setPreserveRatio(true);

        mediaView27 = new MediaView(mediaPlayer27);
        mediaView27.setPreserveRatio(true);

        mediaView28 = new MediaView(mediaPlayer28);
        mediaView28.setPreserveRatio(true);

        mediaView29 = new MediaView(mediaPlayer29);
        mediaView29.setPreserveRatio(true);

        mediaView30 = new MediaView(mediaPlayer30);
        mediaView30.setPreserveRatio(true);

        mediaView31 = new MediaView(mediaPlayer31);
        mediaView31.setPreserveRatio(true);

        mediaView32 = new MediaView(mediaPlayer32);
        mediaView32.setPreserveRatio(true);

        mediaView33 = new MediaView(mediaPlayer33);
        mediaView33.setPreserveRatio(true);

        mediaView34 = new MediaView(mediaPlayer34);
        mediaView34.setPreserveRatio(true);

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
        mediaView16.setFitWidth(dimension.getWidth());
        mediaView16.setFitHeight(dimension.getHeight());
        mediaView17.setFitWidth(dimension.getWidth());
        mediaView17.setFitHeight(dimension.getHeight());
        mediaView18.setFitWidth(dimension.getWidth());
        mediaView18.setFitHeight(dimension.getHeight());
        mediaView19.setFitWidth(dimension.getWidth());
        mediaView19.setFitHeight(dimension.getHeight());
        mediaView20.setFitWidth(dimension.getWidth());
        mediaView20.setFitHeight(dimension.getHeight());
        mediaView21.setFitWidth(dimension.getWidth());
        mediaView21.setFitHeight(dimension.getHeight());
        mediaView22.setFitWidth(dimension.getWidth());
        mediaView22.setFitHeight(dimension.getHeight());
        mediaView23.setFitWidth(dimension.getWidth());
        mediaView23.setFitHeight(dimension.getHeight());
        mediaView24.setFitWidth(dimension.getWidth());
        mediaView24.setFitHeight(dimension.getHeight());
        mediaView25.setFitWidth(dimension.getWidth());
        mediaView25.setFitHeight(dimension.getHeight());
        mediaView26.setFitWidth(dimension.getWidth());
        mediaView26.setFitHeight(dimension.getHeight());
        mediaView27.setFitWidth(dimension.getWidth());
        mediaView27.setFitHeight(dimension.getHeight());
        mediaView28.setFitWidth(dimension.getWidth());
        mediaView28.setFitHeight(dimension.getHeight());
        mediaView29.setFitWidth(dimension.getWidth());
        mediaView29.setFitHeight(dimension.getHeight());
        mediaView30.setFitWidth(dimension.getWidth());
        mediaView30.setFitHeight(dimension.getHeight());
        mediaView31.setFitWidth(dimension.getWidth());
        mediaView31.setFitHeight(dimension.getHeight());
        mediaView32.setFitWidth(dimension.getWidth());
        mediaView32.setFitHeight(dimension.getHeight());
        mediaView33.setFitWidth(dimension.getWidth());
        mediaView33.setFitHeight(dimension.getHeight());
        mediaView34.setFitWidth(dimension.getWidth());
        mediaView34.setFitHeight(dimension.getHeight());
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

    private void playVideo16() {
        jfxPanel.setScene(new Scene(new Group(mediaView16)));
        mediaPlayer16.play();
    }

    private void playVideo17() {
        jfxPanel.setScene(new Scene(new Group(mediaView17)));
        mediaPlayer17.play();
    }

    private void playVideo18() {
        jfxPanel.setScene(new Scene(new Group(mediaView18)));
        mediaPlayer18.play();
    }

    private void playVideo19() {
        jfxPanel.setScene(new Scene(new Group(mediaView19)));
        mediaPlayer19.play();
    }

    private void playVideo20() {
        jfxPanel.setScene(new Scene(new Group(mediaView20)));
        mediaPlayer20.play();
    }

    private void playVideo21() {
        jfxPanel.setScene(new Scene(new Group(mediaView21)));
        mediaPlayer21.play();
    }

    private void playVideo22() {
        jfxPanel.setScene(new Scene(new Group(mediaView22)));
        mediaPlayer22.play();
    }

    private void playVideo23() {
        jfxPanel.setScene(new Scene(new Group(mediaView23)));
        mediaPlayer23.play();
    }

    private void playVideo24() {
        jfxPanel.setScene(new Scene(new Group(mediaView24)));
        mediaPlayer24.play();
    }

    private void playVideo25() {
        jfxPanel.setScene(new Scene(new Group(mediaView25)));
        mediaPlayer25.play();
    }

    private void playVideo26() {
        jfxPanel.setScene(new Scene(new Group(mediaView26)));
        mediaPlayer26.play();
    }

    private void playVideo27() {
        jfxPanel.setScene(new Scene(new Group(mediaView27)));
        mediaPlayer27.play();
    }

    private void playVideo28() {
        jfxPanel.setScene(new Scene(new Group(mediaView28)));
        mediaPlayer28.play();
    }

    private void playVideo29() {
        jfxPanel.setScene(new Scene(new Group(mediaView29)));
        mediaPlayer29.play();
    }

    private void playVideo30() {
        jfxPanel.setScene(new Scene(new Group(mediaView30)));
        mediaPlayer30.play();
    }

    private void playVideo31() {
        jfxPanel.setScene(new Scene(new Group(mediaView31)));
        mediaPlayer31.play();
    }

    private void playVideo32() {
        jfxPanel.setScene(new Scene(new Group(mediaView32)));
        mediaPlayer32.play();
    }

    private void playVideo33() {
        jfxPanel.setScene(new Scene(new Group(mediaView33)));
        mediaPlayer33.play();
    }

    private void playVideo34() {
        jfxPanel.setScene(new Scene(new Group(mediaView34)));
        mediaPlayer34.play();
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
        bthuirconosos = new javax.swing.JButton();
        btEsperarOso = new javax.swing.JButton();
        ComenzarGatoBotas = new javax.swing.JButton();
        btCiudadSeleccion = new javax.swing.JButton();
        btburlarse = new javax.swing.JButton();
        btbuscarsolucionultimavida = new javax.swing.JButton();
        BuscarLoboDecidido = new javax.swing.JButton();
        AyudarAGenteDecidido = new javax.swing.JButton();
        btignorarultimavida = new javax.swing.JButton();
        PelearMuerteIgnorada = new javax.swing.JButton();
        RendirsemuerteIgnorada = new javax.swing.JButton();
        btirgolemtranquilamente = new javax.swing.JButton();
        ComenzarMarioBros = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btAyudarAmigos = new javax.swing.JButton();
        btArriesgarVida = new javax.swing.JButton();
        btAbandonarVidas = new javax.swing.JButton();
        btconseguirlaestrella = new javax.swing.JButton();
        btabandonarybuscaramigos = new javax.swing.JButton();
        btcumplirdeseo = new javax.swing.JButton();

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
        btMasVidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btMasVidasMouseClicked(evt);
            }
        });
        getContentPane().add(btMasVidas);

        btpelearconperro.setText("Pelear con Valentia");
        btpelearconperro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btpelearconperroMouseClicked(evt);
            }
        });
        getContentPane().add(btpelearconperro);

        btquedarseperro.setText("Quedarse con Perro");
        btquedarseperro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btquedarseperroMouseClicked(evt);
            }
        });
        getContentPane().add(btquedarseperro);

        bthuirconosos.setText("Huir");
        bthuirconosos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bthuirconososMouseClicked(evt);
            }
        });
        bthuirconosos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthuirconososActionPerformed(evt);
            }
        });
        getContentPane().add(bthuirconosos);

        btEsperarOso.setText("Esperar");
        btEsperarOso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEsperarOsoMouseClicked(evt);
            }
        });
        getContentPane().add(btEsperarOso);

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
        btCiudadSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCiudadSeleccionMouseClicked(evt);
            }
        });
        getContentPane().add(btCiudadSeleccion);

        btburlarse.setText("Burlarse");
        btburlarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btburlarseMouseClicked(evt);
            }
        });
        btburlarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btburlarseActionPerformed(evt);
            }
        });
        getContentPane().add(btburlarse);

        btbuscarsolucionultimavida.setText("Buscar Solucion");
        btbuscarsolucionultimavida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbuscarsolucionultimavidaMouseClicked(evt);
            }
        });
        getContentPane().add(btbuscarsolucionultimavida);

        BuscarLoboDecidido.setText("Buscar al Lobo");
        BuscarLoboDecidido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarLoboDecididoMouseClicked(evt);
            }
        });
        BuscarLoboDecidido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarLoboDecididoActionPerformed(evt);
            }
        });
        getContentPane().add(BuscarLoboDecidido);

        AyudarAGenteDecidido.setText("Ayudar a Gente");
        AyudarAGenteDecidido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudarAGenteDecididoMouseClicked(evt);
            }
        });
        getContentPane().add(AyudarAGenteDecidido);

        btignorarultimavida.setText("Ignorar");
        btignorarultimavida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btignorarultimavidaMouseClicked(evt);
            }
        });
        getContentPane().add(btignorarultimavida);

        PelearMuerteIgnorada.setText("Pelear");
        PelearMuerteIgnorada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PelearMuerteIgnoradaMouseClicked(evt);
            }
        });
        PelearMuerteIgnorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelearMuerteIgnoradaActionPerformed(evt);
            }
        });
        getContentPane().add(PelearMuerteIgnorada);

        RendirsemuerteIgnorada.setText("Rendirse");
        RendirsemuerteIgnorada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RendirsemuerteIgnoradaMouseClicked(evt);
            }
        });
        getContentPane().add(RendirsemuerteIgnorada);

        btirgolemtranquilamente.setText("Irse Tranquilmente");
        btirgolemtranquilamente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btirgolemtranquilamenteMouseClicked(evt);
            }
        });
        btirgolemtranquilamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btirgolemtranquilamenteActionPerformed(evt);
            }
        });
        getContentPane().add(btirgolemtranquilamente);

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

        btAyudarAmigos.setText("Ayudar Amigos");
        btAyudarAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAyudarAmigosMouseClicked(evt);
            }
        });
        btAyudarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAyudarAmigosActionPerformed(evt);
            }
        });
        getContentPane().add(btAyudarAmigos);

        btArriesgarVida.setText("Arriesgar Vida");
        btArriesgarVida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btArriesgarVidaMouseClicked(evt);
            }
        });
        getContentPane().add(btArriesgarVida);

        btAbandonarVidas.setText("Abandonar Compañeros");
        btAbandonarVidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAbandonarVidasMouseClicked(evt);
            }
        });
        getContentPane().add(btAbandonarVidas);

        btconseguirlaestrella.setText("Conseguir la Estrella");
        btconseguirlaestrella.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btconseguirlaestrellaMouseClicked(evt);
            }
        });
        getContentPane().add(btconseguirlaestrella);

        btabandonarybuscaramigos.setText("Abandonar el Deseo y Ayudar a tus Amigos");
        btabandonarybuscaramigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btabandonarybuscaramigosMouseClicked(evt);
            }
        });
        btabandonarybuscaramigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btabandonarybuscaramigosActionPerformed(evt);
            }
        });
        getContentPane().add(btabandonarybuscaramigos);

        btcumplirdeseo.setText("Cumplir tu Deseo");
        btcumplirdeseo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcumplirdeseoMouseClicked(evt);
            }
        });
        btcumplirdeseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcumplirdeseoActionPerformed(evt);
            }
        });
        getContentPane().add(btcumplirdeseo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBosqueSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBosqueSeleccionMouseClicked
        // TODO add your handling code here:
        btBosqueSeleccion.setVisible(false);
        btCiudadSeleccion.setVisible(false);
        btburlarse.setVisible(true);
        btirgolemtranquilamente.setVisible(true);

        playVideo21();
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

    private void btMasVidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMasVidasMouseClicked
        // TODO add your handling code here:
        btMasVidas.setVisible(false);
        btpelearconperro.setVisible(false);
        playVideo16();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_btMasVidasMouseClicked

    private void btpelearconperroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpelearconperroMouseClicked
        // TODO add your handling code here:
        btMasVidas.setVisible(false);
        btpelearconperro.setVisible(false);
        playVideo17();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_btpelearconperroMouseClicked

    private void bthuirconososMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthuirconososMouseClicked
        // TODO add your handling code here:
        bthuirconosos.setVisible(false);
        btEsperarOso.setVisible(false);
        playVideo19();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_bthuirconososMouseClicked

    private void btEsperarOsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEsperarOsoMouseClicked
        // TODO add your handling code here:
        bthuirconosos.setVisible(false);
        btEsperarOso.setVisible(false);
        playVideo20();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_btEsperarOsoMouseClicked

    private void btquedarseperroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btquedarseperroMouseClicked
        // TODO add your handling code here:
        bthuirperro.setVisible(false);
        btquedarseperro.setVisible(false);
        bthuirconosos.setVisible(true);
        btEsperarOso.setVisible(true);
        playVideo18();
    }//GEN-LAST:event_btquedarseperroMouseClicked

    private void bthuirconososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthuirconososActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bthuirconososActionPerformed

    private void btburlarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btburlarseMouseClicked
        // TODO add your handling code here:

        btburlarse.setVisible(false);
        btirgolemtranquilamente.setVisible(false);
        btbuscarsolucionultimavida.setVisible(true);
        btignorarultimavida.setVisible(true);

        playVideo22();

    }//GEN-LAST:event_btburlarseMouseClicked

    private void btbuscarsolucionultimavidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarsolucionultimavidaMouseClicked
        // TODO add your handling code here:
        btbuscarsolucionultimavida.setVisible(false);
        btignorarultimavida.setVisible(false);
        BuscarLoboDecidido.setVisible(true);
        AyudarAGenteDecidido.setVisible(true);

        playVideo23();


    }//GEN-LAST:event_btbuscarsolucionultimavidaMouseClicked

    private void btburlarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btburlarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btburlarseActionPerformed

    private void btignorarultimavidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btignorarultimavidaMouseClicked
        // TODO add your handling code here:
        btbuscarsolucionultimavida.setVisible(false);
        btignorarultimavida.setVisible(false);
        PelearMuerteIgnorada.setVisible(true);
        RendirsemuerteIgnorada.setVisible(true);
        playVideo25();
    }//GEN-LAST:event_btignorarultimavidaMouseClicked

    private void btCiudadSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCiudadSeleccionMouseClicked
        // TODO add your handling code here:
        btBosqueSeleccion.setVisible(false);
        btCiudadSeleccion.setVisible(false);
        btburlarse.setVisible(true);
        btirgolemtranquilamente.setVisible(true);
        playVideo21();

    }//GEN-LAST:event_btCiudadSeleccionMouseClicked

    private void AyudarAGenteDecididoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudarAGenteDecididoMouseClicked
        // TODO add your handling code here:
        BuscarLoboDecidido.setVisible(false);
        AyudarAGenteDecidido.setVisible(false);
        playVideo24();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_AyudarAGenteDecididoMouseClicked

    private void BuscarLoboDecididoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarLoboDecididoMouseClicked
        // TODO add your handling code here:

        BuscarLoboDecidido.setVisible(false);
        AyudarAGenteDecidido.setVisible(false);
        playVideo23();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);


    }//GEN-LAST:event_BuscarLoboDecididoMouseClicked

    private void BuscarLoboDecididoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLoboDecididoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarLoboDecididoActionPerformed

    private void PelearMuerteIgnoradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PelearMuerteIgnoradaMouseClicked
        // TODO add your handling code here:
        PelearMuerteIgnorada.setVisible(false);
        RendirsemuerteIgnorada.setVisible(false);
        playVideo27();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_PelearMuerteIgnoradaMouseClicked

    private void RendirsemuerteIgnoradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RendirsemuerteIgnoradaMouseClicked
        // TODO add your handling code here:
        PelearMuerteIgnorada.setVisible(false);
        RendirsemuerteIgnorada.setVisible(false);
        playVideo26();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_RendirsemuerteIgnoradaMouseClicked

    private void btirgolemtranquilamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btirgolemtranquilamenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btirgolemtranquilamenteActionPerformed

    private void PelearMuerteIgnoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelearMuerteIgnoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PelearMuerteIgnoradaActionPerformed

    private void btirgolemtranquilamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btirgolemtranquilamenteMouseClicked
        // TODO add your handling code here:
        btburlarse.setVisible(false);
        btirgolemtranquilamente.setVisible(false);
        playVideo28();
        btAyudarAmigos.setVisible(true);
        btconseguirlaestrella.setVisible(true);

    }//GEN-LAST:event_btirgolemtranquilamenteMouseClicked

    private void btAyudarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAyudarAmigosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btAyudarAmigosActionPerformed

    private void btAyudarAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAyudarAmigosMouseClicked
        // TODO add your handling code here:

        btAyudarAmigos.setVisible(false);
        btconseguirlaestrella.setVisible(false);
        btArriesgarVida.setVisible(true);
        btAbandonarVidas.setVisible(true);
        playVideo29();
        //velaralucionacnioens.mp4
    }//GEN-LAST:event_btAyudarAmigosMouseClicked

    private void btAbandonarVidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbandonarVidasMouseClicked
        // TODO add your handling code here:   
        btArriesgarVida.setVisible(false);
        btAbandonarVidas.setVisible(false);
        playVideo30();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);

    }//GEN-LAST:event_btAbandonarVidasMouseClicked

    private void btArriesgarVidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btArriesgarVidaMouseClicked
        // TODO add your handling code here:
        btArriesgarVida.setVisible(false);
        btAbandonarVidas.setVisible(false);
        playVideo31();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
    }//GEN-LAST:event_btArriesgarVidaMouseClicked

    private void btabandonarybuscaramigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabandonarybuscaramigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btabandonarybuscaramigosActionPerformed

    private void btcumplirdeseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcumplirdeseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcumplirdeseoActionPerformed

    private void btconseguirlaestrellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btconseguirlaestrellaMouseClicked
        // TODO add your handling code here:

        btAyudarAmigos.setVisible(false);
        btconseguirlaestrella.setVisible(false);
        btabandonarybuscaramigos.setVisible(true);
        btcumplirdeseo.setVisible(true);
        playVideo32();

    }//GEN-LAST:event_btconseguirlaestrellaMouseClicked

    private void btabandonarybuscaramigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btabandonarybuscaramigosMouseClicked
        // TODO add your handling code here:
        btabandonarybuscaramigos.setVisible(false);
        btcumplirdeseo.setVisible(false);
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        playVideo33();
    }//GEN-LAST:event_btabandonarybuscaramigosMouseClicked

    private void btcumplirdeseoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcumplirdeseoMouseClicked
        // TODO add your handling code here:
        btabandonarybuscaramigos.setVisible(false);
        btcumplirdeseo.setVisible(false);
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        playVideo34();
    }//GEN-LAST:event_btcumplirdeseoMouseClicked

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
    private javax.swing.JButton AyudarAGenteDecidido;
    private javax.swing.JButton BuscarLoboDecidido;
    private javax.swing.JButton ComenzarGatoBotas;
    private javax.swing.JButton ComenzarMarioBros;
    private javax.swing.JButton PelearMuerteIgnorada;
    private javax.swing.JButton RendirsemuerteIgnorada;
    private javax.swing.JButton btAbandonarVidas;
    private javax.swing.JButton btArriesgarVida;
    private javax.swing.JButton btAyudarAmigos;
    private javax.swing.JButton btBadEndingPeleaHospitalHumildad;
    private javax.swing.JButton btBosqueSeleccion;
    private javax.swing.JButton btCiudadSeleccion;
    private javax.swing.JButton btEsperarOso;
    private javax.swing.JButton btGoodEndingPeleaHospitalHumildad;
    private javax.swing.JButton btMasVidas;
    private javax.swing.JButton btPelearMotivado;
    private javax.swing.JButton btPelearRendirse;
    private javax.swing.JButton btabandonarybuscaramigos;
    private javax.swing.JButton btaparecerhumildehospital;
    private javax.swing.JButton btaparecermiedohospital;
    private javax.swing.JButton btarrepentirtehuidahospital;
    private javax.swing.JButton btburlarse;
    private javax.swing.JButton btbuscarsolucionultimavida;
    private javax.swing.JButton btconseguirlaestrella;
    private javax.swing.JButton btcumplirdeseo;
    private javax.swing.JButton btdespertarenhospitalMotivacion;
    private javax.swing.JButton btdespertarhospitaldesmotivado;
    private javax.swing.JButton bthuirbosque;
    private javax.swing.JButton bthuirconosos;
    private javax.swing.JButton bthuirperro;
    private javax.swing.JButton btignorarultimavida;
    private javax.swing.JButton btirgolemtranquilamente;
    private javax.swing.JButton btpeleagatobosque;
    private javax.swing.JButton btpelearconmiedohuidahospital;
    private javax.swing.JButton btpelearconperro;
    private javax.swing.JButton btquedarseperro;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
