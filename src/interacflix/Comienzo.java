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
import javafx.util.Duration;

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

    private Duration ultimaPosicion;

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

        btregresar1.setVisible(false);
        btregresar2.setVisible(false);
        btregresar3.setVisible(false);
        btregresar4.setVisible(false);
        btregresar5.setVisible(false);
        btregresar6.setVisible(false);
        btregresar7.setVisible(false);
        btregresar8.setVisible(false);
        btregresar9.setVisible(false);
        btregresar10.setVisible(false);
        btregresar11.setVisible(false);
        btregresar12.setVisible(false);
        btregresar13.setVisible(false);
        btregresar14.setVisible(false);
        btregresar15.setVisible(false);
        btregresar16.setVisible(false);
        btregresar17.setVisible(false);
        btregresar18.setVisible(false);
        btregresar19.setVisible(false);
        btregresar20.setVisible(false);
        btregresar21.setVisible(false);
        btregresar22.setVisible(false);
        btregresar23.setVisible(false);
        btregresar24.setVisible(false);
        btregresar25.setVisible(false);
        btregresar26.setVisible(false);
        btregresar27.setVisible(false);
        btregresar28.setVisible(false);
        btregresar29.setVisible(false);
        btregresar30.setVisible(false);
        btregresar31.setVisible(false);
        btregresar32.setVisible(false);
        btregresar33.setVisible(false);
        btregresar34.setVisible(false);

        vtavancemos1.setVisible(false);
        vtavancemos2.setVisible(false);
        vtavancemos3.setVisible(false);
        vtavancemos4.setVisible(false);
        vtavancemos5.setVisible(false);
        vtavancemos6.setVisible(false);
        vtavancemos7.setVisible(false);
        vtavancemos8.setVisible(false);
        vtavancemos9.setVisible(false);
        vtavancemos10.setVisible(false);
        vtavancemos11.setVisible(false);
        vtavancemos12.setVisible(false);
        vtavancemos13.setVisible(false);
        vtavancemos14.setVisible(false);
        vtavancemos15.setVisible(false);
        vtavancemos16.setVisible(false);
        vtavancemos17.setVisible(false);
        vtavancemos18.setVisible(false);
        vtavancemos19.setVisible(false);
        vtavancemos20.setVisible(false);
        vtavancemos21.setVisible(false);
        vtavancemos22.setVisible(false);
        vtavancemos23.setVisible(false);
        vtavancemos24.setVisible(false);
        vtavancemos25.setVisible(false);
        vtavancemos26.setVisible(false);
        vtavancemos27.setVisible(false);
        vtavancemos28.setVisible(false);
        vtavancemos29.setVisible(false);
        vtavancemos30.setVisible(false);
        vtavancemos31.setVisible(false);
        vtavancemos32.setVisible(false);
        vtavancemos33.setVisible(false);
        vtavancemos34.setVisible(false);

        btinicio1.setVisible(false);
        btiniciar2.setVisible(false);
        btiniciar3.setVisible(false);
        btiniciar4.setVisible(false);
        btiniciar5.setVisible(false);
        btiniciar6.setVisible(false);
        btiniciar7.setVisible(false);
        btiniciar8.setVisible(false);
        btiniciar9.setVisible(false);
        btiniciar10.setVisible(false);
        btiniciar11.setVisible(false);
        btiniciar12.setVisible(false);
        btiniciar13.setVisible(false);
        btiniciar14.setVisible(false);
        btiniciar15.setVisible(false);
        btiniciar16.setVisible(false);
        btiniciar17.setVisible(false);
        btiniciar18.setVisible(false);
        btiniciar19.setVisible(false);
        btiniciar20.setVisible(false);
        btiniciar21.setVisible(false);
        btiniciar22.setVisible(false);
        btiniciar23.setVisible(false);
        btiniciar24.setVisible(false);
        btiniciar25.setVisible(false);
        btiniciar26.setVisible(false);
        btiniciar27.setVisible(false);
        btiniciar28.setVisible(false);
        btiniciar29.setVisible(false);
        btiniciar30.setVisible(false);
        btiniciar31.setVisible(false);
        btiniciar32.setVisible(false);
        btiniciar33.setVisible(false);
        btiniciar34.setVisible(false);

        btcontinuar1.setVisible(false);
        btcontinua2.setVisible(false);
        btcontinua3.setVisible(false);
        btcontinua4.setVisible(false);
        btcontinua5.setVisible(false);
        btcontinua6.setVisible(false);
        btcontinua7.setVisible(false);
        btcontinua8.setVisible(false);
        btcontinua9.setVisible(false);
        btcontinua10.setVisible(false);
        btcontinua11.setVisible(false);
        btcontinua12.setVisible(false);
        btcontinua13.setVisible(false);
        btcontinua14.setVisible(false);
        btcontinua15.setVisible(false);
        btcontinua16.setVisible(false);
        btcontinua17.setVisible(false);
        btcontinua18.setVisible(false);
        btcontinua19.setVisible(false);
        btcontinua20.setVisible(false);
        btcontinua21.setVisible(false);
        btcontinua22.setVisible(false);
        btcontinua23.setVisible(false);
        btcontinua24.setVisible(false);
        btcontinua25.setVisible(false);
        btcontinua26.setVisible(false);
        btcontinua27.setVisible(false);
        btcontinua28.setVisible(false);
        btcontinua29.setVisible(false);
        btcontinua30.setVisible(false);
        btcontinua31.setVisible(false);
        btcontinua32.setVisible(false);
        btcontinua33.setVisible(false);
        btcontinua34.setVisible(false);

        btparado1.setVisible(false);
        btparar2.setVisible(false);
        btparar3.setVisible(false);
        btparar4.setVisible(false);
        btparar5.setVisible(false);
        btparar6.setVisible(false);
        btparar7.setVisible(false);
        btparar8.setVisible(false);
        btparar9.setVisible(false);
        btparar10.setVisible(false);
        btparar11.setVisible(false);
        btparar12.setVisible(false);
        btparar13.setVisible(false);
        btparar14.setVisible(false);
        btparar15.setVisible(false);
        btparar16.setVisible(false);
        btparar17.setVisible(false);
        btparar18.setVisible(false);
        btparar19.setVisible(false);
        btparar20.setVisible(false);
        btparar21.setVisible(false);
        btparar22.setVisible(false);
        btparar23.setVisible(false);
        btparar24.setVisible(false);
        btparar25.setVisible(false);
        btparar26.setVisible(false);
        btparar27.setVisible(false);
        btparar28.setVisible(false);
        btparar29.setVisible(false);
        btparar30.setVisible(false);
        btparar31.setVisible(false);
        btparar32.setVisible(false);
        btparar33.setVisible(false);
        btparar34.setVisible(false);

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

    private void stopAllVideos() {
        MediaPlayer[] mediaPlayers = {
            mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5,
            mediaPlayer6, mediaPlayer7, mediaPlayer8, mediaPlayer9, mediaPlayer10,
            mediaPlayer11, mediaPlayer12, mediaPlayer13, mediaPlayer14, mediaPlayer15,
            mediaPlayer16, mediaPlayer17, mediaPlayer18, mediaPlayer19, mediaPlayer20,
            mediaPlayer21, mediaPlayer22, mediaPlayer23, mediaPlayer24, mediaPlayer25,
            mediaPlayer26, mediaPlayer27, mediaPlayer28, mediaPlayer29, mediaPlayer30,
            mediaPlayer31, mediaPlayer32, mediaPlayer33, mediaPlayer34
        };

        for (MediaPlayer mediaPlayer : mediaPlayers) {
            if (mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
                mediaPlayer.stop();
            }
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
        btAyudarAmigos = new javax.swing.JButton();
        btArriesgarVida = new javax.swing.JButton();
        btAbandonarVidas = new javax.swing.JButton();
        btconseguirlaestrella = new javax.swing.JButton();
        btabandonarybuscaramigos = new javax.swing.JButton();
        btcumplirdeseo = new javax.swing.JButton();
        ComenzarMarioBros = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btregresar1 = new javax.swing.JButton();
        vtavancemos1 = new javax.swing.JButton();
        btinicio1 = new javax.swing.JButton();
        btcontinuar1 = new javax.swing.JButton();
        btparado1 = new javax.swing.JButton();
        btregresar2 = new javax.swing.JButton();
        btregresar3 = new javax.swing.JButton();
        btregresar4 = new javax.swing.JButton();
        btregresar5 = new javax.swing.JButton();
        btregresar6 = new javax.swing.JButton();
        btregresar7 = new javax.swing.JButton();
        btregresar8 = new javax.swing.JButton();
        btregresar9 = new javax.swing.JButton();
        btregresar10 = new javax.swing.JButton();
        btregresar11 = new javax.swing.JButton();
        btregresar12 = new javax.swing.JButton();
        btregresar13 = new javax.swing.JButton();
        btregresar14 = new javax.swing.JButton();
        btregresar15 = new javax.swing.JButton();
        btregresar16 = new javax.swing.JButton();
        btregresar17 = new javax.swing.JButton();
        btregresar18 = new javax.swing.JButton();
        btregresar19 = new javax.swing.JButton();
        btregresar20 = new javax.swing.JButton();
        btregresar21 = new javax.swing.JButton();
        btregresar22 = new javax.swing.JButton();
        btregresar23 = new javax.swing.JButton();
        btregresar24 = new javax.swing.JButton();
        btregresar25 = new javax.swing.JButton();
        btregresar26 = new javax.swing.JButton();
        btregresar27 = new javax.swing.JButton();
        btregresar28 = new javax.swing.JButton();
        btregresar29 = new javax.swing.JButton();
        btregresar30 = new javax.swing.JButton();
        btregresar31 = new javax.swing.JButton();
        btregresar32 = new javax.swing.JButton();
        btregresar33 = new javax.swing.JButton();
        btregresar34 = new javax.swing.JButton();
        vtavancemos2 = new javax.swing.JButton();
        vtavancemos3 = new javax.swing.JButton();
        vtavancemos4 = new javax.swing.JButton();
        vtavancemos5 = new javax.swing.JButton();
        vtavancemos6 = new javax.swing.JButton();
        vtavancemos7 = new javax.swing.JButton();
        vtavancemos8 = new javax.swing.JButton();
        vtavancemos9 = new javax.swing.JButton();
        vtavancemos10 = new javax.swing.JButton();
        vtavancemos11 = new javax.swing.JButton();
        vtavancemos12 = new javax.swing.JButton();
        vtavancemos13 = new javax.swing.JButton();
        vtavancemos14 = new javax.swing.JButton();
        vtavancemos15 = new javax.swing.JButton();
        vtavancemos16 = new javax.swing.JButton();
        vtavancemos17 = new javax.swing.JButton();
        vtavancemos18 = new javax.swing.JButton();
        vtavancemos19 = new javax.swing.JButton();
        vtavancemos20 = new javax.swing.JButton();
        vtavancemos21 = new javax.swing.JButton();
        vtavancemos22 = new javax.swing.JButton();
        vtavancemos23 = new javax.swing.JButton();
        vtavancemos24 = new javax.swing.JButton();
        vtavancemos25 = new javax.swing.JButton();
        vtavancemos26 = new javax.swing.JButton();
        vtavancemos27 = new javax.swing.JButton();
        vtavancemos28 = new javax.swing.JButton();
        vtavancemos29 = new javax.swing.JButton();
        vtavancemos30 = new javax.swing.JButton();
        vtavancemos31 = new javax.swing.JButton();
        vtavancemos32 = new javax.swing.JButton();
        vtavancemos33 = new javax.swing.JButton();
        vtavancemos34 = new javax.swing.JButton();
        btiniciar2 = new javax.swing.JButton();
        btiniciar3 = new javax.swing.JButton();
        btiniciar4 = new javax.swing.JButton();
        btiniciar5 = new javax.swing.JButton();
        btiniciar6 = new javax.swing.JButton();
        btiniciar7 = new javax.swing.JButton();
        btiniciar8 = new javax.swing.JButton();
        btiniciar9 = new javax.swing.JButton();
        btiniciar10 = new javax.swing.JButton();
        btiniciar11 = new javax.swing.JButton();
        btiniciar12 = new javax.swing.JButton();
        btiniciar13 = new javax.swing.JButton();
        btiniciar14 = new javax.swing.JButton();
        btiniciar15 = new javax.swing.JButton();
        btiniciar16 = new javax.swing.JButton();
        btiniciar17 = new javax.swing.JButton();
        btiniciar18 = new javax.swing.JButton();
        btiniciar19 = new javax.swing.JButton();
        btiniciar20 = new javax.swing.JButton();
        btiniciar21 = new javax.swing.JButton();
        btiniciar22 = new javax.swing.JButton();
        btiniciar23 = new javax.swing.JButton();
        btiniciar24 = new javax.swing.JButton();
        btiniciar25 = new javax.swing.JButton();
        btiniciar26 = new javax.swing.JButton();
        btiniciar27 = new javax.swing.JButton();
        btiniciar28 = new javax.swing.JButton();
        btiniciar29 = new javax.swing.JButton();
        btiniciar30 = new javax.swing.JButton();
        btiniciar31 = new javax.swing.JButton();
        btiniciar32 = new javax.swing.JButton();
        btiniciar33 = new javax.swing.JButton();
        btiniciar34 = new javax.swing.JButton();
        btcontinua2 = new javax.swing.JButton();
        btcontinua3 = new javax.swing.JButton();
        btcontinua4 = new javax.swing.JButton();
        btcontinua5 = new javax.swing.JButton();
        btcontinua6 = new javax.swing.JButton();
        btcontinua7 = new javax.swing.JButton();
        btcontinua8 = new javax.swing.JButton();
        btcontinua9 = new javax.swing.JButton();
        btcontinua10 = new javax.swing.JButton();
        btcontinua11 = new javax.swing.JButton();
        btcontinua12 = new javax.swing.JButton();
        btcontinua13 = new javax.swing.JButton();
        btcontinua14 = new javax.swing.JButton();
        btcontinua15 = new javax.swing.JButton();
        btcontinua16 = new javax.swing.JButton();
        btcontinua17 = new javax.swing.JButton();
        btcontinua18 = new javax.swing.JButton();
        btcontinua19 = new javax.swing.JButton();
        btcontinua20 = new javax.swing.JButton();
        btcontinua21 = new javax.swing.JButton();
        btcontinua22 = new javax.swing.JButton();
        btcontinua23 = new javax.swing.JButton();
        btcontinua24 = new javax.swing.JButton();
        btcontinua25 = new javax.swing.JButton();
        btcontinua26 = new javax.swing.JButton();
        btcontinua27 = new javax.swing.JButton();
        btcontinua28 = new javax.swing.JButton();
        btcontinua29 = new javax.swing.JButton();
        btcontinua30 = new javax.swing.JButton();
        btcontinua31 = new javax.swing.JButton();
        btcontinua32 = new javax.swing.JButton();
        btcontinua33 = new javax.swing.JButton();
        btcontinua34 = new javax.swing.JButton();
        btparar2 = new javax.swing.JButton();
        btparar3 = new javax.swing.JButton();
        btparar4 = new javax.swing.JButton();
        btparar5 = new javax.swing.JButton();
        btparar6 = new javax.swing.JButton();
        btparar7 = new javax.swing.JButton();
        btparar8 = new javax.swing.JButton();
        btparar9 = new javax.swing.JButton();
        btparar10 = new javax.swing.JButton();
        btparar11 = new javax.swing.JButton();
        btparar12 = new javax.swing.JButton();
        btparar13 = new javax.swing.JButton();
        btparar14 = new javax.swing.JButton();
        btparar15 = new javax.swing.JButton();
        btparar16 = new javax.swing.JButton();
        btparar17 = new javax.swing.JButton();
        btparar18 = new javax.swing.JButton();
        btparar19 = new javax.swing.JButton();
        btparar20 = new javax.swing.JButton();
        btparar21 = new javax.swing.JButton();
        btparar22 = new javax.swing.JButton();
        btparar23 = new javax.swing.JButton();
        btparar24 = new javax.swing.JButton();
        btparar25 = new javax.swing.JButton();
        btparar26 = new javax.swing.JButton();
        btparar27 = new javax.swing.JButton();
        btparar28 = new javax.swing.JButton();
        btparar29 = new javax.swing.JButton();
        btparar30 = new javax.swing.JButton();
        btparar31 = new javax.swing.JButton();
        btparar32 = new javax.swing.JButton();
        btparar33 = new javax.swing.JButton();
        btparar34 = new javax.swing.JButton();

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

        btregresar1.setText("Regresar Video");
        btregresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar1MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar1);

        vtavancemos1.setText("Avanzar Video");
        vtavancemos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos11MouseClicked1(evt);
            }
        });
        vtavancemos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtavancemos1ActionPerformed(evt);
            }
        });
        getContentPane().add(vtavancemos1);

        btinicio1.setText("Regresar Decision");
        btinicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btinicio11MouseClicked(evt);
            }
        });
        getContentPane().add(btinicio1);

        btcontinuar1.setText("Continuar Video");
        btcontinuar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinuar11MouseClicked(evt);
            }
        });
        btcontinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcontinuar11ActionPerformed(evt);
            }
        });
        getContentPane().add(btcontinuar1);

        btparado1.setText("Parar Video");
        btparado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparado11MouseClicked(evt);
            }
        });
        getContentPane().add(btparado1);

        btregresar2.setText("Regresar Video");
        btregresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar2MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar2);

        btregresar3.setText("Regresar Video");
        btregresar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar3MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar3);

        btregresar4.setText("Regresar Video");
        btregresar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar4MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar4);

        btregresar5.setText("Regresar Video");
        btregresar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar5MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar5);

        btregresar6.setText("Regresar Video");
        btregresar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar6MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar6);

        btregresar7.setText("Regresar Video");
        btregresar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar7MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar7);

        btregresar8.setText("Regresar Video");
        btregresar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar8MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar8);

        btregresar9.setText("Regresar Video");
        btregresar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar9MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar9);

        btregresar10.setText("Regresar Video");
        btregresar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar10MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar10);

        btregresar11.setText("Regresar Video");
        btregresar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar11MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar11);

        btregresar12.setText("Regresar Video");
        btregresar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar12MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar12);

        btregresar13.setText("Regresar Video");
        btregresar13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar13MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar13);

        btregresar14.setText("Regresar Video");
        btregresar14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar14MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar14);

        btregresar15.setText("Regresar Video");
        btregresar15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar15MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar15);

        btregresar16.setText("Regresar Video");
        btregresar16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar16MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar16);

        btregresar17.setText("Regresar Video");
        btregresar17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar17MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar17);

        btregresar18.setText("Regresar Video");
        btregresar18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar18MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar18);

        btregresar19.setText("Regresar Video");
        btregresar19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar19MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar19);

        btregresar20.setText("Regresar Video");
        btregresar20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar20MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar20);

        btregresar21.setText("Regresar Video");
        btregresar21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar21MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar21);

        btregresar22.setText("Regresar Video");
        btregresar22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar22MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar22);

        btregresar23.setText("Regresar Video");
        btregresar23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar23MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar23);

        btregresar24.setText("Regresar Video");
        btregresar24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar24MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar24);

        btregresar25.setText("Regresar Video");
        btregresar25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar25MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar25);

        btregresar26.setText("Regresar Video");
        btregresar26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar26MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar26);

        btregresar27.setText("Regresar Video");
        btregresar27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar27MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar27);

        btregresar28.setText("Regresar Video");
        btregresar28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar28MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar28);

        btregresar29.setText("Regresar Video");
        btregresar29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar29MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar29);

        btregresar30.setText("Regresar Video");
        btregresar30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar30MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar30);

        btregresar31.setText("Regresar Video");
        btregresar31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar31MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar31);

        btregresar32.setText("Regresar Video");
        btregresar32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar32MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar32);

        btregresar33.setText("Regresar Video");
        btregresar33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar33MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar33);

        btregresar34.setText("Regresar Video");
        btregresar34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btregresar34MouseClicked(evt);
            }
        });
        getContentPane().add(btregresar34);

        vtavancemos2.setText("Avanzar Video");
        vtavancemos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos2MouseClicked(evt);
            }
        });
        vtavancemos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtavancemos2ActionPerformed(evt);
            }
        });
        getContentPane().add(vtavancemos2);

        vtavancemos3.setText("Avanzar Video");
        vtavancemos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos3MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos3);

        vtavancemos4.setText("Avanzar Video");
        vtavancemos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos4MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos4);

        vtavancemos5.setText("Avanzar Video");
        vtavancemos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos5MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos5);

        vtavancemos6.setText("Avanzar Video");
        vtavancemos6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos6MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos6);

        vtavancemos7.setText("Avanzar Video");
        vtavancemos7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos7MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos7);

        vtavancemos8.setText("Avanzar Video");
        vtavancemos8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos8MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos8);

        vtavancemos9.setText("Avanzar Video");
        vtavancemos9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos9MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos9);

        vtavancemos10.setText("Avanzar Video");
        vtavancemos10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos10MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos10);

        vtavancemos11.setText("Avanzar Video");
        vtavancemos11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos11MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos11);

        vtavancemos12.setText("Avanzar Video");
        vtavancemos12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos12MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos12);

        vtavancemos13.setText("Avanzar Video");
        vtavancemos13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos13MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos13);

        vtavancemos14.setText("Avanzar Video");
        vtavancemos14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos14MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos14);

        vtavancemos15.setText("Avanzar Video");
        vtavancemos15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos15MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos15);

        vtavancemos16.setText("Avanzar Video");
        vtavancemos16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos16MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos16);

        vtavancemos17.setText("Avanzar Video");
        vtavancemos17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos17MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos17);

        vtavancemos18.setText("Avanzar Video");
        vtavancemos18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos18MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos18);

        vtavancemos19.setText("Avanzar Video");
        vtavancemos19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos19MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos19);

        vtavancemos20.setText("Avanzar Video");
        vtavancemos20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos20MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos20);

        vtavancemos21.setText("Avanzar Video");
        vtavancemos21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos21MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos21);

        vtavancemos22.setText("Avanzar Video");
        vtavancemos22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos22MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos22);

        vtavancemos23.setText("Avanzar Video");
        vtavancemos23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos23MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos23);

        vtavancemos24.setText("Avanzar Video");
        vtavancemos24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos24MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos24);

        vtavancemos25.setText("Avanzar Video");
        vtavancemos25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos25MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos25);

        vtavancemos26.setText("Avanzar Video");
        vtavancemos26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos26MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos26);

        vtavancemos27.setText("Avanzar Video");
        vtavancemos27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos27MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos27);

        vtavancemos28.setText("Avanzar Video");
        vtavancemos28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos28MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos28);

        vtavancemos29.setText("Avanzar Video");
        vtavancemos29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos29MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos29);

        vtavancemos30.setText("Avanzar Video");
        vtavancemos30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos30MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos30);

        vtavancemos31.setText("Avanzar Video");
        vtavancemos31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos31MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos31);

        vtavancemos32.setText("Avanzar Video");
        vtavancemos32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos32MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos32);

        vtavancemos33.setText("Avanzar Video");
        vtavancemos33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos33MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos33);

        vtavancemos34.setText("Avanzar Video");
        vtavancemos34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtavancemos34MouseClicked(evt);
            }
        });
        getContentPane().add(vtavancemos34);

        btiniciar2.setText("Regresar Decision");
        btiniciar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar2MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar2);

        btiniciar3.setText("Regresar Decision");
        btiniciar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar3MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar3);

        btiniciar4.setText("Regresar Decision");
        btiniciar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar4MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar4);

        btiniciar5.setText("Regresar Decision");
        btiniciar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar5MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar5);

        btiniciar6.setText("Regresar Decision");
        btiniciar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar6MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar6);

        btiniciar7.setText("Regresar Decision");
        btiniciar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar7MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar7);

        btiniciar8.setText("Regresar Decision");
        btiniciar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar8MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar8);

        btiniciar9.setText("Regresar Decision");
        btiniciar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar9MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar9);

        btiniciar10.setText("Regresar Decision");
        btiniciar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar10MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar10);

        btiniciar11.setText("Regresar Decision");
        btiniciar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar11MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar11);

        btiniciar12.setText("Regresar Decision");
        btiniciar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar12MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar12);

        btiniciar13.setText("Regresar Decision");
        btiniciar13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar13MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar13);

        btiniciar14.setText("Regresar Decision");
        btiniciar14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar14MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar14);

        btiniciar15.setText("Regresar Decision");
        btiniciar15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar15MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar15);

        btiniciar16.setText("Regresar Decision");
        btiniciar16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar16MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar16);

        btiniciar17.setText("Regresar Decision");
        btiniciar17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar17MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar17);

        btiniciar18.setText("Regresar Decision");
        btiniciar18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar18MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar18);

        btiniciar19.setText("Regresar Decision");
        btiniciar19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar19MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar19);

        btiniciar20.setText("Regresar Decision");
        btiniciar20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar20MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar20);

        btiniciar21.setText("Regresar Decision");
        btiniciar21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar21MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar21);

        btiniciar22.setText("Regresar Decision");
        btiniciar22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar22MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar22);

        btiniciar23.setText("Regresar Decision");
        btiniciar23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar23MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar23);

        btiniciar24.setText("Regresar Decision");
        btiniciar24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar24MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar24);

        btiniciar25.setText("Regresar Decision");
        btiniciar25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar25MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar25);

        btiniciar26.setText("Regresar Decision");
        btiniciar26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar26MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar26);

        btiniciar27.setText("Regresar Decision");
        btiniciar27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar27MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar27);

        btiniciar28.setText("Regresar Decision");
        btiniciar28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar28MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar28);

        btiniciar29.setText("Regresar Decision");
        btiniciar29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar29MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar29);

        btiniciar30.setText("Regresar Decision");
        btiniciar30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar30MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar30);

        btiniciar31.setText("Regresar Decision");
        btiniciar31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar31MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar31);

        btiniciar32.setText("Regresar Decision");
        btiniciar32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar32MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar32);

        btiniciar33.setText("Regresar Decision");
        btiniciar33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar33MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar33);

        btiniciar34.setText("Regresar Decision");
        btiniciar34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btiniciar34MouseClicked(evt);
            }
        });
        getContentPane().add(btiniciar34);

        btcontinua2.setText("Continuar Video");
        btcontinua2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua2MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua2);

        btcontinua3.setText("Continuar Video");
        btcontinua3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua3MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua3);

        btcontinua4.setText("Continuar Video");
        btcontinua4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua4MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua4);

        btcontinua5.setText("Continuar Video");
        btcontinua5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua5MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua5);

        btcontinua6.setText("Continuar Video");
        btcontinua6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua6MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua6);

        btcontinua7.setText("Continuar Video");
        btcontinua7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua7MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua7);

        btcontinua8.setText("Continuar Video");
        btcontinua8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua8MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua8);

        btcontinua9.setText("Continuar Video");
        btcontinua9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua9MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua9);

        btcontinua10.setText("Continuar Video");
        btcontinua10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua10MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua10);

        btcontinua11.setText("Continuar Video");
        btcontinua11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua11MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua11);

        btcontinua12.setText("Continuar Video");
        btcontinua12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua12MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua12);

        btcontinua13.setText("Continuar Video");
        btcontinua13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua13MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua13);

        btcontinua14.setText("Continuar Video");
        btcontinua14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua14MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua14);

        btcontinua15.setText("Continuar Video");
        btcontinua15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua15MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua15);

        btcontinua16.setText("Continuar Video");
        btcontinua16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua16MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua16);

        btcontinua17.setText("Continuar Video");
        btcontinua17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua17MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua17);

        btcontinua18.setText("Continuar Video");
        btcontinua18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua18MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua18);

        btcontinua19.setText("Continuar Video");
        btcontinua19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua19MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua19);

        btcontinua20.setText("Continuar Video");
        btcontinua20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua20MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua20);

        btcontinua21.setText("Continuar Video");
        btcontinua21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua21MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua21);

        btcontinua22.setText("Continuar Video");
        btcontinua22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua22MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua22);

        btcontinua23.setText("Continuar Video");
        btcontinua23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua23MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua23);

        btcontinua24.setText("Continuar Video");
        btcontinua24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua24MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua24);

        btcontinua25.setText("Continuar Video");
        btcontinua25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua25MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua25);

        btcontinua26.setText("Continuar Video");
        btcontinua26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua26MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua26);

        btcontinua27.setText("Continuar Video");
        btcontinua27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua27MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua27);

        btcontinua28.setText("Continuar Video");
        btcontinua28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua28MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua28);

        btcontinua29.setText("Continuar Video");
        btcontinua29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua29MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua29);

        btcontinua30.setText("Continuar Video");
        btcontinua30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua30MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua30);

        btcontinua31.setText("Continuar Video");
        btcontinua31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua31MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua31);

        btcontinua32.setText("Continuar Video");
        btcontinua32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua32MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua32);

        btcontinua33.setText("Continuar Video");
        btcontinua33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua33MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua33);

        btcontinua34.setText("Continuar Video");
        btcontinua34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btcontinua34MouseClicked(evt);
            }
        });
        getContentPane().add(btcontinua34);

        btparar2.setText("Parar Video");
        btparar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar2MouseClicked(evt);
            }
        });
        getContentPane().add(btparar2);

        btparar3.setText("Parar Video");
        btparar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar3MouseClicked(evt);
            }
        });
        btparar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btparar3ActionPerformed(evt);
            }
        });
        getContentPane().add(btparar3);

        btparar4.setText("Parar Video");
        btparar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar4MouseClicked(evt);
            }
        });
        getContentPane().add(btparar4);

        btparar5.setText("Parar Video");
        btparar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar5MouseClicked(evt);
            }
        });
        getContentPane().add(btparar5);

        btparar6.setText("Parar Video");
        btparar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar6MouseClicked(evt);
            }
        });
        getContentPane().add(btparar6);

        btparar7.setText("Parar Video");
        btparar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar7MouseClicked(evt);
            }
        });
        getContentPane().add(btparar7);

        btparar8.setText("Parar Video");
        btparar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar8MouseClicked(evt);
            }
        });
        getContentPane().add(btparar8);

        btparar9.setText("Parar Video");
        btparar9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar9MouseClicked(evt);
            }
        });
        getContentPane().add(btparar9);

        btparar10.setText("Parar Video");
        btparar10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar10MouseClicked(evt);
            }
        });
        getContentPane().add(btparar10);

        btparar11.setText("Parar Video");
        btparar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar11MouseClicked(evt);
            }
        });
        getContentPane().add(btparar11);

        btparar12.setText("Parar Video");
        btparar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar12MouseClicked(evt);
            }
        });
        getContentPane().add(btparar12);

        btparar13.setText("Parar Video");
        btparar13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar13MouseClicked(evt);
            }
        });
        getContentPane().add(btparar13);

        btparar14.setText("Parar Video");
        btparar14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar14MouseClicked(evt);
            }
        });
        getContentPane().add(btparar14);

        btparar15.setText("Parar Video");
        btparar15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar15MouseClicked(evt);
            }
        });
        getContentPane().add(btparar15);

        btparar16.setText("Parar Video");
        btparar16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar16MouseClicked(evt);
            }
        });
        getContentPane().add(btparar16);

        btparar17.setText("Parar Video");
        btparar17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar17MouseClicked(evt);
            }
        });
        getContentPane().add(btparar17);

        btparar18.setText("Parar Video");
        btparar18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar18MouseClicked(evt);
            }
        });
        getContentPane().add(btparar18);

        btparar19.setText("Parar Video");
        btparar19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar19MouseClicked(evt);
            }
        });
        getContentPane().add(btparar19);

        btparar20.setText("Parar Video");
        btparar20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar20MouseClicked(evt);
            }
        });
        getContentPane().add(btparar20);

        btparar21.setText("Parar Video");
        btparar21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar21MouseClicked(evt);
            }
        });
        getContentPane().add(btparar21);

        btparar22.setText("Parar Video");
        btparar22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar22MouseClicked(evt);
            }
        });
        getContentPane().add(btparar22);

        btparar23.setText("Parar Video");
        btparar23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar23MouseClicked(evt);
            }
        });
        getContentPane().add(btparar23);

        btparar24.setText("Parar Video");
        btparar24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar24MouseClicked(evt);
            }
        });
        getContentPane().add(btparar24);

        btparar25.setText("Parar Video");
        btparar25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar25MouseClicked(evt);
            }
        });
        getContentPane().add(btparar25);

        btparar26.setText("Parar Video");
        btparar26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar26MouseClicked(evt);
            }
        });
        getContentPane().add(btparar26);

        btparar27.setText("Parar Video");
        btparar27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar27MouseClicked(evt);
            }
        });
        getContentPane().add(btparar27);

        btparar28.setText("Parar Video");
        btparar28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar28MouseClicked(evt);
            }
        });
        getContentPane().add(btparar28);

        btparar29.setText("Parar Video");
        btparar29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar29MouseClicked(evt);
            }
        });
        getContentPane().add(btparar29);

        btparar30.setText("Parar Video");
        btparar30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar30MouseClicked(evt);
            }
        });
        getContentPane().add(btparar30);

        btparar31.setText("Parar Video");
        btparar31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar31MouseClicked(evt);
            }
        });
        getContentPane().add(btparar31);

        btparar32.setText("Parar Video");
        btparar32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar32MouseClicked(evt);
            }
        });
        getContentPane().add(btparar32);

        btparar33.setText("Parar Video");
        btparar33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar33MouseClicked(evt);
            }
        });
        getContentPane().add(btparar33);

        btparar34.setText("Parar Video");
        btparar34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btparar34MouseClicked(evt);
            }
        });
        getContentPane().add(btparar34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBosqueSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBosqueSeleccionMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btBosqueSeleccion.setVisible(false);
        btCiudadSeleccion.setVisible(false);
        btpeleagatobosque.setVisible(true);
        bthuirbosque.setVisible(true);

        playVideo2();

        btregresar1.setVisible(false);
        vtavancemos1.setVisible(false);
        btinicio1.setVisible(false);
        btcontinuar1.setVisible(false);
        btparado1.setVisible(false);

        btregresar2.setVisible(true);
        vtavancemos2.setVisible(true);
        btiniciar2.setVisible(true);
        btcontinua2.setVisible(true);
        btparar2.setVisible(true);

    }//GEN-LAST:event_btBosqueSeleccionMouseClicked

    private void btBosqueSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBosqueSeleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBosqueSeleccionActionPerformed

    private void ComenzarGatoBotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComenzarGatoBotasMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btBosqueSeleccion.setVisible(true);
        btCiudadSeleccion.setVisible(true);
        ComenzarGatoBotas.setVisible(false);
        ComenzarMarioBros.setVisible(false);

        btregresar1.setVisible(true);
        vtavancemos1.setVisible(true);
        btinicio1.setVisible(true);
        btcontinuar1.setVisible(true);
        btparado1.setVisible(true);

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
        stopAllVideos();
        bthuirbosque.setVisible(false);
        btpeleagatobosque.setVisible(false);
        btaparecerhumildehospital.setVisible(true);
        btaparecermiedohospital.setVisible(true);

        playVideo3();
        
        btregresar2.setVisible(false);
        vtavancemos2.setVisible(false);
        btiniciar2.setVisible(false);
        btcontinua2.setVisible(false);
        btparar2.setVisible(false);
        
        btregresar3.setVisible(true);
        vtavancemos3.setVisible(true);
        btiniciar3.setVisible(true);
        btcontinua3.setVisible(true);
        btparar3.setVisible(true);

    }//GEN-LAST:event_btpeleagatobosqueMouseClicked

    private void btaparecerhumildehospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaparecerhumildehospitalMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btaparecerhumildehospital.setVisible(false);
        btaparecermiedohospital.setVisible(false);
        btGoodEndingPeleaHospitalHumildad.setVisible(true);
        btBadEndingPeleaHospitalHumildad.setVisible(true);

        playVideo4();
        
        
        btregresar3.setVisible(false);
        vtavancemos3.setVisible(false);
        btiniciar3.setVisible(false);
        btcontinua3.setVisible(false);
        btparar3.setVisible(false);
        
        btregresar4.setVisible(true);
        vtavancemos4.setVisible(true);
        btiniciar4.setVisible(true);
        btcontinua4.setVisible(true);
        btparar4.setVisible(true);
    }//GEN-LAST:event_btaparecerhumildehospitalMouseClicked

    private void btGoodEndingPeleaHospitalHumildadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGoodEndingPeleaHospitalHumildadMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btGoodEndingPeleaHospitalHumildad.setVisible(false);
        btBadEndingPeleaHospitalHumildad.setVisible(false);
        playVideo5();

        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar4.setVisible(false);
        vtavancemos4.setVisible(false);
        btiniciar4.setVisible(false);
        btcontinua4.setVisible(false);
        btparar4.setVisible(false);
        
    }//GEN-LAST:event_btGoodEndingPeleaHospitalHumildadMouseClicked

    private void btBadEndingPeleaHospitalHumildadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBadEndingPeleaHospitalHumildadMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btGoodEndingPeleaHospitalHumildad.setVisible(false);
        btBadEndingPeleaHospitalHumildad.setVisible(false);
        playVideo6();
        
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar4.setVisible(false);
        vtavancemos4.setVisible(false);
        btiniciar4.setVisible(false);
        btcontinua4.setVisible(false);
        btparar4.setVisible(false);
    }//GEN-LAST:event_btBadEndingPeleaHospitalHumildadMouseClicked

    private void btaparecermiedohospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaparecermiedohospitalMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btaparecerhumildehospital.setVisible(false);
        btaparecermiedohospital.setVisible(false);
        btpelearconmiedohuidahospital.setVisible(true);
        btarrepentirtehuidahospital.setVisible(true);

        playVideo7();
        
        btregresar3.setVisible(false);
        vtavancemos3.setVisible(false);
        btiniciar3.setVisible(false);
        btcontinua3.setVisible(false);
        btparar3.setVisible(false);
        
        btregresar7.setVisible(true);
        vtavancemos7.setVisible(true);
        btiniciar7.setVisible(true);
        btcontinua7.setVisible(true);
        btparar7.setVisible(true);
        
    }//GEN-LAST:event_btaparecermiedohospitalMouseClicked

    private void btpelearconmiedohuidahospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpelearconmiedohuidahospitalMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btpelearconmiedohuidahospital.setVisible(false);
        btarrepentirtehuidahospital.setVisible(false);
        playVideo8();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        
         btregresar7.setVisible(false);
        vtavancemos7.setVisible(false);
        btiniciar7.setVisible(false);
        btcontinua7.setVisible(false);
        btparar7.setVisible(false);
        
        btregresar8.setVisible(true);
        vtavancemos8.setVisible(true);
        btiniciar8.setVisible(true);
        btcontinua8.setVisible(true);
        btparar8.setVisible(true);
        
        

    }//GEN-LAST:event_btpelearconmiedohuidahospitalMouseClicked

    private void btarrepentirtehuidahospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btarrepentirtehuidahospitalMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btpelearconmiedohuidahospital.setVisible(false);
        btarrepentirtehuidahospital.setVisible(false);
        playVideo9();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
         btregresar7.setVisible(false);
        vtavancemos7.setVisible(false);
        btiniciar7.setVisible(false);
        btcontinua7.setVisible(false);
        btparar7.setVisible(false);
        
         btregresar9.setVisible(true);
        vtavancemos9.setVisible(true);
        btiniciar9.setVisible(true);
        btcontinua9.setVisible(true);
        btparar9.setVisible(true);
        
        
        
        

    }//GEN-LAST:event_btarrepentirtehuidahospitalMouseClicked

    private void bthuirbosqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthuirbosqueMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        bthuirbosque.setVisible(false);
        btpeleagatobosque.setVisible(false);
        btdespertarenhospitalMotivacion.setVisible(true);
        btdespertarhospitaldesmotivado.setVisible(true);
        playVideo10();
        
        btregresar2.setVisible(false);
        vtavancemos2.setVisible(false);
        btiniciar2.setVisible(false);
        btcontinua2.setVisible(false);
        btparar2.setVisible(false);
        
        btregresar10.setVisible(true);
        vtavancemos10.setVisible(true);
        btiniciar10.setVisible(true);
        btcontinua10.setVisible(true);
        btparar10.setVisible(true);
        
        
    }//GEN-LAST:event_bthuirbosqueMouseClicked

    private void btdespertarenhospitalMotivacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdespertarenhospitalMotivacionMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btdespertarenhospitalMotivacion.setVisible(false);
        btdespertarhospitaldesmotivado.setVisible(false);
        btPelearMotivado.setVisible(true);
        btPelearRendirse.setVisible(true);

        playVideo11();
        
        btregresar10.setVisible(false);
        vtavancemos10.setVisible(false);
        btiniciar10.setVisible(false);
        btcontinua10.setVisible(false);
        btparar10.setVisible(false);
        
        btregresar11.setVisible(true);
        vtavancemos11.setVisible(true);
        btiniciar11.setVisible(true);
        btcontinua11.setVisible(true);
        btparar11.setVisible(true);
    }//GEN-LAST:event_btdespertarenhospitalMotivacionMouseClicked

    private void btPelearRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPelearRendirseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPelearRendirseActionPerformed

    private void btPelearMotivadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPelearMotivadoMouseClicked
        stopAllVideos();
        btPelearMotivado.setVisible(false);
        btPelearRendirse.setVisible(false);
        playVideo12();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar11.setVisible(false);
        vtavancemos11.setVisible(false);
        btiniciar11.setVisible(false);
        btcontinua11.setVisible(false);
        btparar11.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btPelearMotivadoMouseClicked

    private void btPelearRendirseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPelearRendirseMouseClicked
        stopAllVideos();
        btPelearMotivado.setVisible(false);
        btPelearRendirse.setVisible(false);
        playVideo13();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar11.setVisible(false);
        vtavancemos11.setVisible(false);
        btiniciar11.setVisible(false);
        btcontinua11.setVisible(false);
        btparar11.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_btPelearRendirseMouseClicked

    private void btPelearMotivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPelearMotivadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPelearMotivadoActionPerformed

    private void btdespertarhospitaldesmotivadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdespertarhospitaldesmotivadoMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btdespertarenhospitalMotivacion.setVisible(false);
        btdespertarhospitaldesmotivado.setVisible(false);
        bthuirperro.setVisible(true);
        btquedarseperro.setVisible(true);

        playVideo14();
        
        
        btregresar10.setVisible(false);
        vtavancemos10.setVisible(false);
        btiniciar10.setVisible(false);
        btcontinua10.setVisible(false);
        btparar10.setVisible(false);
        
        btregresar14.setVisible(true);
        vtavancemos14.setVisible(true);
        btiniciar14.setVisible(true);
        btcontinua14.setVisible(true);
        btparar14.setVisible(true); 


    }//GEN-LAST:event_btdespertarhospitaldesmotivadoMouseClicked

    private void bthuirperroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthuirperroMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        bthuirperro.setVisible(false);
        btquedarseperro.setVisible(false);
        btMasVidas.setVisible(true);
        btpelearconperro.setVisible(true);
        playVideo15();
        
         btregresar14.setVisible(true);
        vtavancemos14.setVisible(true);
        btiniciar14.setVisible(true);
        btcontinua14.setVisible(true);
        btparar14.setVisible(true); 
        
        btregresar15.setVisible(true);
        vtavancemos15.setVisible(true);
        btiniciar15.setVisible(true);
        btcontinua15.setVisible(true);
        btparar15.setVisible(true); 
        
        
    }//GEN-LAST:event_bthuirperroMouseClicked

    private void btMasVidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMasVidasMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btMasVidas.setVisible(false);
        btpelearconperro.setVisible(false);
        playVideo16();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
         btregresar15.setVisible(false);
        vtavancemos15.setVisible(false);
        btiniciar15.setVisible(false);
        btcontinua15.setVisible(false);
        btparar15.setVisible(false);
              
        
    }//GEN-LAST:event_btMasVidasMouseClicked

    private void btpelearconperroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btpelearconperroMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btMasVidas.setVisible(false);
        btpelearconperro.setVisible(false);
        playVideo17();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
         btregresar15.setVisible(false);
        vtavancemos15.setVisible(false);
        btiniciar15.setVisible(false);
        btcontinua15.setVisible(false);
        btparar15.setVisible(false);
        
    }//GEN-LAST:event_btpelearconperroMouseClicked

    private void bthuirconososMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthuirconososMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        bthuirconosos.setVisible(false);
        btEsperarOso.setVisible(false);
        playVideo19();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar18.setVisible(false);
        vtavancemos18.setVisible(false);
        btiniciar18.setVisible(false);
        btcontinua18.setVisible(false);
        btparar18.setVisible(false); 
        
    }//GEN-LAST:event_bthuirconososMouseClicked

    private void btEsperarOsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEsperarOsoMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        bthuirconosos.setVisible(false);
        btEsperarOso.setVisible(false);
        playVideo20();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar18.setVisible(false);
        vtavancemos18.setVisible(false);
        btiniciar18.setVisible(false);
        btcontinua18.setVisible(false);
        btparar18.setVisible(false); 
        
    }//GEN-LAST:event_btEsperarOsoMouseClicked

    private void btquedarseperroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btquedarseperroMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        bthuirperro.setVisible(false);
        btquedarseperro.setVisible(false);
        bthuirconosos.setVisible(true);
        btEsperarOso.setVisible(true);
        playVideo18();
        
         btregresar14.setVisible(false);
        vtavancemos14.setVisible(false);
        btiniciar14.setVisible(false);
        btcontinua14.setVisible(false);
        btparar14.setVisible(false); 
        
        btregresar18.setVisible(true);
        vtavancemos18.setVisible(true);
        btiniciar18.setVisible(true);
        btcontinua18.setVisible(true);
        btparar18.setVisible(true); 
        
    }//GEN-LAST:event_btquedarseperroMouseClicked

    private void bthuirconososActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthuirconososActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bthuirconososActionPerformed

    private void btburlarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btburlarseMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btburlarse.setVisible(false);
        btirgolemtranquilamente.setVisible(false);
        btbuscarsolucionultimavida.setVisible(true);
        btignorarultimavida.setVisible(true);

        playVideo22();

        btregresar21.setVisible(false);
        vtavancemos21.setVisible(false);
        btiniciar21.setVisible(false);
        btcontinua21.setVisible(false);
        btparar21.setVisible(false);
        
        btregresar22.setVisible(true);
        vtavancemos22.setVisible(true);
        btiniciar22.setVisible(true);
        btcontinua22.setVisible(true);
        btparar22.setVisible(true);
        
        
        
    }//GEN-LAST:event_btburlarseMouseClicked

    private void btbuscarsolucionultimavidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarsolucionultimavidaMouseClicked

        // TODO add your handling code here:
        stopAllVideos();
        btbuscarsolucionultimavida.setVisible(false);
        btignorarultimavida.setVisible(false);
        BuscarLoboDecidido.setVisible(true);
        AyudarAGenteDecidido.setVisible(true);

        playVideo23();

        btregresar22.setVisible(false);
        vtavancemos22.setVisible(false);
        btiniciar22.setVisible(false);
        btcontinua22.setVisible(false);
        btparar22.setVisible(false);
        
        btregresar23.setVisible(true);
        vtavancemos23.setVisible(true);
        btiniciar23.setVisible(true);
        btcontinua23.setVisible(true);
        btparar23.setVisible(true);

    }//GEN-LAST:event_btbuscarsolucionultimavidaMouseClicked

    private void btburlarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btburlarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btburlarseActionPerformed

    private void btignorarultimavidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btignorarultimavidaMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btbuscarsolucionultimavida.setVisible(false);
        btignorarultimavida.setVisible(false);
        PelearMuerteIgnorada.setVisible(true);
        RendirsemuerteIgnorada.setVisible(true);
        playVideo25();
        
        btregresar22.setVisible(false);
        vtavancemos22.setVisible(false);
        btiniciar22.setVisible(false);
        btcontinua22.setVisible(false);
        btparar22.setVisible(false);
        
        btregresar25.setVisible(true);
        vtavancemos25.setVisible(true);
        btiniciar25.setVisible(true);
        btcontinua25.setVisible(true);
        btparar25.setVisible(true);
        
    }//GEN-LAST:event_btignorarultimavidaMouseClicked

    private void btCiudadSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCiudadSeleccionMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btBosqueSeleccion.setVisible(false);
        btCiudadSeleccion.setVisible(false);
        btburlarse.setVisible(true);
        btirgolemtranquilamente.setVisible(true);
        playVideo21();
        
        btregresar1.setVisible(false);
        vtavancemos1.setVisible(false);
        btinicio1.setVisible(false);
        btcontinuar1.setVisible(false);
        btparado1.setVisible(false);
        
        btregresar21.setVisible(true);
        vtavancemos21.setVisible(true);
        btiniciar21.setVisible(true);
        btcontinua21.setVisible(true);
        btparar21.setVisible(true);

    }//GEN-LAST:event_btCiudadSeleccionMouseClicked

    private void AyudarAGenteDecididoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudarAGenteDecididoMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        BuscarLoboDecidido.setVisible(false);
        AyudarAGenteDecidido.setVisible(false);
        playVideo24();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar23.setVisible(false);
        vtavancemos23.setVisible(false);
        btiniciar23.setVisible(false);
        btcontinua23.setVisible(false);
        btparar23.setVisible(false);
        
    }//GEN-LAST:event_AyudarAGenteDecididoMouseClicked

    private void BuscarLoboDecididoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarLoboDecididoMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        BuscarLoboDecidido.setVisible(false);
        AyudarAGenteDecidido.setVisible(false);
        playVideo23();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);

        btregresar23.setVisible(false);
        vtavancemos23.setVisible(false);
        btiniciar23.setVisible(false);
        btcontinua23.setVisible(false);
        btparar23.setVisible(false);

    }//GEN-LAST:event_BuscarLoboDecididoMouseClicked

    private void BuscarLoboDecididoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarLoboDecididoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarLoboDecididoActionPerformed

    private void PelearMuerteIgnoradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PelearMuerteIgnoradaMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        PelearMuerteIgnorada.setVisible(false);
        RendirsemuerteIgnorada.setVisible(false);
        playVideo27();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar25.setVisible(false);
        vtavancemos25.setVisible(false);
        btiniciar25.setVisible(false);
        btcontinua25.setVisible(false);
        btparar25.setVisible(false);
        
    }//GEN-LAST:event_PelearMuerteIgnoradaMouseClicked

    private void RendirsemuerteIgnoradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RendirsemuerteIgnoradaMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        PelearMuerteIgnorada.setVisible(false);
        RendirsemuerteIgnorada.setVisible(false);
        playVideo26();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar25.setVisible(false);
        vtavancemos25.setVisible(false);
        btiniciar25.setVisible(false);
        btcontinua25.setVisible(false);
        btparar25.setVisible(false);
        
    }//GEN-LAST:event_RendirsemuerteIgnoradaMouseClicked

    private void btirgolemtranquilamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btirgolemtranquilamenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btirgolemtranquilamenteActionPerformed

    private void PelearMuerteIgnoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelearMuerteIgnoradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PelearMuerteIgnoradaActionPerformed

    private void btirgolemtranquilamenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btirgolemtranquilamenteMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btburlarse.setVisible(false);
        btirgolemtranquilamente.setVisible(false);
        playVideo28();
        btAyudarAmigos.setVisible(true);
        btconseguirlaestrella.setVisible(true);
        
        btregresar21.setVisible(false);
        vtavancemos21.setVisible(false);
        btiniciar21.setVisible(false);
        btcontinua21.setVisible(false);
        btparar21.setVisible(false);
        
        btregresar28.setVisible(true);
        vtavancemos28.setVisible(true);
        btiniciar28.setVisible(true);
        btcontinua28.setVisible(true);
        btparar28.setVisible(true);
        

    }//GEN-LAST:event_btirgolemtranquilamenteMouseClicked

    private void btAyudarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAyudarAmigosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btAyudarAmigosActionPerformed

    private void btAyudarAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAyudarAmigosMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btAyudarAmigos.setVisible(false);
        btconseguirlaestrella.setVisible(false);
        btArriesgarVida.setVisible(true);
        btAbandonarVidas.setVisible(true);
        playVideo29();
        
        btregresar28.setVisible(false);
        vtavancemos28.setVisible(false);
        btiniciar28.setVisible(false);
        btcontinua28.setVisible(false);
        btparar28.setVisible(false);
        
        btregresar29.setVisible(true);
        vtavancemos29.setVisible(true);
        btiniciar29.setVisible(true);
        btcontinua29.setVisible(true);
        btparar29.setVisible(true);
        
        
        //velaralucionacnioens.mp4
        
        
    }//GEN-LAST:event_btAyudarAmigosMouseClicked

    private void btAbandonarVidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAbandonarVidasMouseClicked
        // TODO add your handling code here:   
        stopAllVideos();
        btArriesgarVida.setVisible(false);
        btAbandonarVidas.setVisible(false);
        playVideo30();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar29.setVisible(false);
        vtavancemos29.setVisible(false);
        btiniciar29.setVisible(false);
        btcontinua29.setVisible(false);
        btparar29.setVisible(false);
        

    }//GEN-LAST:event_btAbandonarVidasMouseClicked

    private void btArriesgarVidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btArriesgarVidaMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btArriesgarVida.setVisible(false);
        btAbandonarVidas.setVisible(false);
        playVideo31();
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        
        btregresar29.setVisible(false);
        vtavancemos29.setVisible(false);
        btiniciar29.setVisible(false);
        btcontinua29.setVisible(false);
        btparar29.setVisible(false);
        
    }//GEN-LAST:event_btArriesgarVidaMouseClicked

    private void btabandonarybuscaramigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btabandonarybuscaramigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btabandonarybuscaramigosActionPerformed

    private void btcumplirdeseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcumplirdeseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcumplirdeseoActionPerformed

    private void btconseguirlaestrellaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btconseguirlaestrellaMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btAyudarAmigos.setVisible(false);
        btconseguirlaestrella.setVisible(false);
        btabandonarybuscaramigos.setVisible(true);
        btcumplirdeseo.setVisible(true);
        playVideo32();
        
        btregresar28.setVisible(false);
        vtavancemos28.setVisible(false);
        btiniciar28.setVisible(false);
        btcontinua28.setVisible(false);
        btparar28.setVisible(false);
        
        btregresar32.setVisible(true);
        vtavancemos32.setVisible(true);
        btiniciar32.setVisible(true);
        btcontinua32.setVisible(true);
        btparar32.setVisible(true);

    }//GEN-LAST:event_btconseguirlaestrellaMouseClicked

    private void btabandonarybuscaramigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btabandonarybuscaramigosMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btabandonarybuscaramigos.setVisible(false);
        btcumplirdeseo.setVisible(false);
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        playVideo33();
        
        btregresar32.setVisible(false);
        vtavancemos32.setVisible(false);
        btiniciar32.setVisible(false);
        btcontinua32.setVisible(false);
        btparar32.setVisible(false);
    }//GEN-LAST:event_btabandonarybuscaramigosMouseClicked

    private void btcumplirdeseoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcumplirdeseoMouseClicked
        // TODO add your handling code here:
        stopAllVideos();
        btabandonarybuscaramigos.setVisible(false);
        btcumplirdeseo.setVisible(false);
        ComenzarGatoBotas.setVisible(true);
        ComenzarMarioBros.setVisible(true);
        playVideo34();
        
        btregresar32.setVisible(false);
        vtavancemos32.setVisible(false);
        btiniciar32.setVisible(false);
        btcontinua32.setVisible(false);
        btparar32.setVisible(false);
    }//GEN-LAST:event_btcumplirdeseoMouseClicked

    private void btregresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar1MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer1.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer1.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar1MouseClicked

    private void vtavancemos11MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos11MouseClicked1
        // TODO add your handling code here:
        double currentTime = mediaPlayer1.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer1.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos11MouseClicked1

    private void btinicio11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btinicio11MouseClicked
        // TODO add your handling code here:
        mediaPlayer1.seek(mediaPlayer1.getStartTime());
        mediaPlayer1.play();
    }//GEN-LAST:event_btinicio11MouseClicked

    private void btcontinuar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinuar11MouseClicked
        /*     // TODO add your handling code here:
     mediaPlayer1.pause();

// Guardar la posición actual del video
Duration currentPosition = mediaPlayer1.getCurrentTime();

// Para continuar la reproducción desde donde se detuvo
mediaPlayer1.play();
mediaPlayer1.seek(currentPosition); */
        mediaPlayer1.seek(ultimaPosicion);
        mediaPlayer1.play();
    }//GEN-LAST:event_btcontinuar11MouseClicked

    private void btparado11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparado11MouseClicked
        // TODO add your handling code here:
        mediaPlayer1.pause();
        ultimaPosicion = mediaPlayer1.getCurrentTime();
    }//GEN-LAST:event_btparado11MouseClicked

    private void btcontinuar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcontinuar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btcontinuar11ActionPerformed

    private void btregresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar2MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer2.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer2.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar2MouseClicked

    private void btregresar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar3MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer3.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer3.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar3MouseClicked

    private void btregresar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar4MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer4.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer4.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar4MouseClicked

    private void btregresar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar5MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer5.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer5.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar5MouseClicked

    private void btregresar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar6MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer6.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer6.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar6MouseClicked

    private void btregresar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar7MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer7.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer7.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar7MouseClicked

    private void btregresar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar8MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer8.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer8.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar8MouseClicked

    private void btregresar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar9MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer9.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer9.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar9MouseClicked

    private void btregresar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar10MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer10.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer10.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar10MouseClicked

    private void btregresar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar11MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer11.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer11.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar11MouseClicked

    private void btregresar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar12MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer12.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer12.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar12MouseClicked

    private void btregresar13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar13MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer13.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer13.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar13MouseClicked

    private void btregresar14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar14MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer14.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer14.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar14MouseClicked

    private void btregresar15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar15MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer15.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer15.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar15MouseClicked

    private void btregresar16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar16MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer16.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer16.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar16MouseClicked

    private void btregresar17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar17MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer17.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer17.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar17MouseClicked

    private void btregresar18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar18MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer18.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer18.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar18MouseClicked

    private void btregresar19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar19MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer19.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer19.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar19MouseClicked

    private void btregresar20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar20MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer20.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer20.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar20MouseClicked

    private void btregresar21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar21MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer21.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer21.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar21MouseClicked

    private void btregresar22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar22MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer22.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer22.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar22MouseClicked

    private void btregresar23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar23MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer23.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer23.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar23MouseClicked

    private void btregresar24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar24MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer24.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer24.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar24MouseClicked

    private void btregresar25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar25MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer25.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer25.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar25MouseClicked

    private void btregresar26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar26MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer26.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer26.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar26MouseClicked

    private void btregresar27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar27MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer27.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer27.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar27MouseClicked

    private void btregresar28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar28MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer28.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer28.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar28MouseClicked

    private void btregresar29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar29MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer29.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer29.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar29MouseClicked

    private void btregresar30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar30MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer30.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer30.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar30MouseClicked

    private void btregresar31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar31MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer31.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer31.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar31MouseClicked

    private void btregresar32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar32MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer32.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer32.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar32MouseClicked

    private void btregresar33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar33MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer33.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer33.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar33MouseClicked

    private void btregresar34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btregresar34MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        double currentTime = mediaPlayer34.getCurrentTime().toSeconds();
        double newTime = currentTime - 1.0;
        mediaPlayer34.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_btregresar34MouseClicked

    private void vtavancemos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtavancemos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtavancemos1ActionPerformed

    private void vtavancemos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos3MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer3.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer3.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos3MouseClicked

    private void vtavancemos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos4MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer4.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer4.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos4MouseClicked

    private void vtavancemos5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos5MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer5.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer5.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos5MouseClicked

    private void vtavancemos6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos6MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer6.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer6.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos6MouseClicked

    private void vtavancemos7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos7MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer7.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer7.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos7MouseClicked

    private void vtavancemos8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos8MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer8.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer8.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos8MouseClicked

    private void vtavancemos9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos9MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer9.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer9.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos9MouseClicked

    private void vtavancemos10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos10MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer10.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer10.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos10MouseClicked

    private void vtavancemos11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos11MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer11.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer11.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos11MouseClicked

    private void vtavancemos12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos12MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer12.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer12.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos12MouseClicked

    private void vtavancemos13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos13MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer13.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer13.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos13MouseClicked

    private void vtavancemos14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos14MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer14.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer14.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos14MouseClicked

    private void vtavancemos15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos15MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer15.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer15.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos15MouseClicked

    private void vtavancemos16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos16MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer16.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer16.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos16MouseClicked

    private void vtavancemos17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos17MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer17.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer17.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos17MouseClicked

    private void vtavancemos18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos18MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer18.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer18.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos18MouseClicked

    private void vtavancemos19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos19MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer19.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer19.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos19MouseClicked

    private void vtavancemos20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos20MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer20.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer20.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos20MouseClicked

    private void vtavancemos21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos21MouseClicked
        // TODO add your handling code here:}
        double currentTime = mediaPlayer21.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer21.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos21MouseClicked

    private void vtavancemos22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos22MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer22.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer22.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos22MouseClicked

    private void vtavancemos23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos23MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer23.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer23.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos23MouseClicked

    private void vtavancemos24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos24MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer24.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer24.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos24MouseClicked

    private void vtavancemos25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos25MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer25.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer25.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos25MouseClicked

    private void vtavancemos26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos26MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer26.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer26.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos26MouseClicked

    private void vtavancemos27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos27MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer27.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer27.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos27MouseClicked

    private void vtavancemos28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos28MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer28.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer28.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos28MouseClicked

    private void vtavancemos29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos29MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer29.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer29.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos29MouseClicked

    private void vtavancemos30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos30MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer30.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer30.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos30MouseClicked

    private void vtavancemos31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos31MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer31.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer31.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos31MouseClicked

    private void vtavancemos32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos32MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer32.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer32.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos32MouseClicked

    private void vtavancemos33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos33MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer33.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer33.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos33MouseClicked

    private void vtavancemos34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos34MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer34.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer34.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos34MouseClicked

    private void btiniciar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar2MouseClicked
        // TODO add your handling code here:
        mediaPlayer2.seek(mediaPlayer2.getStartTime());
        mediaPlayer2.play();
    }//GEN-LAST:event_btiniciar2MouseClicked

    private void btiniciar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar3MouseClicked
        // TODO add your handling code here:
        mediaPlayer3.seek(mediaPlayer3.getStartTime());
        mediaPlayer3.play();
    }//GEN-LAST:event_btiniciar3MouseClicked

    private void btiniciar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar4MouseClicked
        // TODO add your handling code here:
        mediaPlayer4.seek(mediaPlayer4.getStartTime());
        mediaPlayer4.play();
    }//GEN-LAST:event_btiniciar4MouseClicked

    private void btiniciar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar5MouseClicked
        // TODO add your handling code here:
        mediaPlayer5.seek(mediaPlayer5.getStartTime());
        mediaPlayer5.play();
    }//GEN-LAST:event_btiniciar5MouseClicked

    private void btiniciar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar6MouseClicked
        // TODO add your handling code here:
        mediaPlayer6.seek(mediaPlayer6.getStartTime());
        mediaPlayer6.play();
    }//GEN-LAST:event_btiniciar6MouseClicked

    private void btiniciar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar7MouseClicked
        // TODO add your handling code here:
        mediaPlayer7.seek(mediaPlayer7.getStartTime());
        mediaPlayer7.play();
    }//GEN-LAST:event_btiniciar7MouseClicked

    private void btiniciar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar8MouseClicked
        // TODO add your handling code here:
        mediaPlayer8.seek(mediaPlayer8.getStartTime());
        mediaPlayer8.play();
    }//GEN-LAST:event_btiniciar8MouseClicked

    private void btiniciar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar9MouseClicked
        // TODO add your handling code here:
        mediaPlayer9.seek(mediaPlayer9.getStartTime());
        mediaPlayer9.play();
    }//GEN-LAST:event_btiniciar9MouseClicked

    private void btiniciar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar10MouseClicked
        // TODO add your handling code here:
        mediaPlayer10.seek(mediaPlayer10.getStartTime());
        mediaPlayer10.play();
    }//GEN-LAST:event_btiniciar10MouseClicked

    private void btiniciar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar11MouseClicked
        // TODO add your handling code here:
        mediaPlayer11.seek(mediaPlayer11.getStartTime());
        mediaPlayer11.play();
    }//GEN-LAST:event_btiniciar11MouseClicked

    private void btiniciar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar12MouseClicked
        // TODO add your handling code here:
        mediaPlayer12.seek(mediaPlayer12.getStartTime());
        mediaPlayer12.play();
    }//GEN-LAST:event_btiniciar12MouseClicked

    private void btiniciar13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar13MouseClicked
        // TODO add your handling code here:
        mediaPlayer13.seek(mediaPlayer13.getStartTime());
        mediaPlayer13.play();
    }//GEN-LAST:event_btiniciar13MouseClicked

    private void btiniciar14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar14MouseClicked
        // TODO add your handling code here:
        mediaPlayer14.seek(mediaPlayer14.getStartTime());
        mediaPlayer14.play();
    }//GEN-LAST:event_btiniciar14MouseClicked

    private void btiniciar15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar15MouseClicked
        // TODO add your handling code here:
        mediaPlayer15.seek(mediaPlayer15.getStartTime());
        mediaPlayer15.play();
    }//GEN-LAST:event_btiniciar15MouseClicked

    private void btiniciar16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar16MouseClicked
        // TODO add your handling code here:
        mediaPlayer16.seek(mediaPlayer16.getStartTime());
        mediaPlayer16.play();
    }//GEN-LAST:event_btiniciar16MouseClicked

    private void btiniciar17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar17MouseClicked
        // TODO add your handling code here:
        mediaPlayer17.seek(mediaPlayer17.getStartTime());
        mediaPlayer17.play();
    }//GEN-LAST:event_btiniciar17MouseClicked

    private void btiniciar18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar18MouseClicked
        // TODO add your handling code here:
        mediaPlayer18.seek(mediaPlayer18.getStartTime());
        mediaPlayer18.play();
    }//GEN-LAST:event_btiniciar18MouseClicked

    private void btiniciar19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar19MouseClicked
        // TODO add your handling code here:
        mediaPlayer19.seek(mediaPlayer19.getStartTime());
        mediaPlayer19.play();
    }//GEN-LAST:event_btiniciar19MouseClicked

    private void btiniciar20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar20MouseClicked
        // TODO add your handling code here:
        mediaPlayer20.seek(mediaPlayer20.getStartTime());
        mediaPlayer20.play();
    }//GEN-LAST:event_btiniciar20MouseClicked

    private void btiniciar21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar21MouseClicked
        // TODO add your handling code here:
        mediaPlayer21.seek(mediaPlayer21.getStartTime());
        mediaPlayer21.play();
    }//GEN-LAST:event_btiniciar21MouseClicked

    private void btiniciar22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar22MouseClicked
        // TODO add your handling code here:
        mediaPlayer22.seek(mediaPlayer22.getStartTime());
        mediaPlayer22.play();
    }//GEN-LAST:event_btiniciar22MouseClicked

    private void btiniciar23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar23MouseClicked
        // TODO add your handling code here:
        mediaPlayer23.seek(mediaPlayer23.getStartTime());
        mediaPlayer23.play();
    }//GEN-LAST:event_btiniciar23MouseClicked

    private void btiniciar24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar24MouseClicked
        // TODO add your handling code here:
        mediaPlayer24.seek(mediaPlayer24.getStartTime());
        mediaPlayer24.play();
    }//GEN-LAST:event_btiniciar24MouseClicked

    private void btiniciar25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar25MouseClicked
        // TODO add your handling code here:
        mediaPlayer25.seek(mediaPlayer25.getStartTime());
        mediaPlayer25.play();
    }//GEN-LAST:event_btiniciar25MouseClicked

    private void btiniciar26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar26MouseClicked
        // TODO add your handling code here:
        mediaPlayer26.seek(mediaPlayer26.getStartTime());
        mediaPlayer26.play();
    }//GEN-LAST:event_btiniciar26MouseClicked

    private void btiniciar27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar27MouseClicked
        // TODO add your handling code here:
        mediaPlayer27.seek(mediaPlayer27.getStartTime());
        mediaPlayer27.play();
    }//GEN-LAST:event_btiniciar27MouseClicked

    private void btiniciar28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar28MouseClicked
        // TODO add your handling code here:
        mediaPlayer28.seek(mediaPlayer28.getStartTime());
        mediaPlayer28.play();
    }//GEN-LAST:event_btiniciar28MouseClicked

    private void btiniciar29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar29MouseClicked
        // TODO add your handling code here:
        mediaPlayer29.seek(mediaPlayer29.getStartTime());
        mediaPlayer29.play();
    }//GEN-LAST:event_btiniciar29MouseClicked

    private void btiniciar30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar30MouseClicked
        // TODO add your handling code here:
        mediaPlayer30.seek(mediaPlayer30.getStartTime());
        mediaPlayer30.play();
    }//GEN-LAST:event_btiniciar30MouseClicked

    private void btiniciar31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar31MouseClicked
        // TODO add your handling code here:
        mediaPlayer31.seek(mediaPlayer31.getStartTime());
        mediaPlayer31.play();
    }//GEN-LAST:event_btiniciar31MouseClicked

    private void btiniciar32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar32MouseClicked
        // TODO add your handling code here:
        mediaPlayer32.seek(mediaPlayer32.getStartTime());
        mediaPlayer32.play();
    }//GEN-LAST:event_btiniciar32MouseClicked

    private void btiniciar33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar33MouseClicked
        // TODO add your handling code here:
        mediaPlayer33.seek(mediaPlayer33.getStartTime());
        mediaPlayer33.play();
    }//GEN-LAST:event_btiniciar33MouseClicked

    private void btiniciar34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btiniciar34MouseClicked
        // TODO add your handling code here
        mediaPlayer34.seek(mediaPlayer34.getStartTime());
        mediaPlayer34.play();
    }//GEN-LAST:event_btiniciar34MouseClicked

    private void vtavancemos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtavancemos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtavancemos2ActionPerformed

    private void vtavancemos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtavancemos2MouseClicked
        // TODO add your handling code here:
        double currentTime = mediaPlayer1.getCurrentTime().toSeconds();
        double newTime = currentTime + 1.0;
        mediaPlayer1.seek(Duration.seconds(newTime));
    }//GEN-LAST:event_vtavancemos2MouseClicked

    private void btcontinua2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua2MouseClicked
        // TODO add your handling code here:
        mediaPlayer2.seek(ultimaPosicion);
        mediaPlayer2.play();
    }//GEN-LAST:event_btcontinua2MouseClicked

    private void btcontinua3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua3MouseClicked
        // TODO add your handling code here:
        mediaPlayer3.seek(ultimaPosicion);
        mediaPlayer3.play();
    }//GEN-LAST:event_btcontinua3MouseClicked

    private void btcontinua4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua4MouseClicked
        // TODO add your handling code here:
        mediaPlayer4.seek(ultimaPosicion);
        mediaPlayer4.play();
    }//GEN-LAST:event_btcontinua4MouseClicked

    private void btcontinua5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua5MouseClicked
        // TODO add your handling code here:
        mediaPlayer5.seek(ultimaPosicion);
        mediaPlayer5.play();
    }//GEN-LAST:event_btcontinua5MouseClicked

    private void btcontinua6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua6MouseClicked
        // TODO add your handling code here:
        mediaPlayer6.seek(ultimaPosicion);
        mediaPlayer6.play();
    }//GEN-LAST:event_btcontinua6MouseClicked

    private void btcontinua7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua7MouseClicked
        // TODO add your handling code here:
        mediaPlayer7.seek(ultimaPosicion);
        mediaPlayer7.play();
    }//GEN-LAST:event_btcontinua7MouseClicked

    private void btcontinua8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua8MouseClicked
        // TODO add your handling code here:
        mediaPlayer8.seek(ultimaPosicion);
        mediaPlayer8.play();
    }//GEN-LAST:event_btcontinua8MouseClicked

    private void btcontinua9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua9MouseClicked
        // TODO add your handling code here:
        mediaPlayer9.seek(ultimaPosicion);
        mediaPlayer9.play();
    }//GEN-LAST:event_btcontinua9MouseClicked

    private void btcontinua10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua10MouseClicked
        // TODO add your handling code here:
        mediaPlayer10.seek(ultimaPosicion);
        mediaPlayer10.play();
    }//GEN-LAST:event_btcontinua10MouseClicked

    private void btcontinua11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua11MouseClicked
        // TODO add your handling code here:
        mediaPlayer11.seek(ultimaPosicion);
        mediaPlayer11.play();
    }//GEN-LAST:event_btcontinua11MouseClicked

    private void btcontinua12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua12MouseClicked
        // TODO add your handling code here:
        mediaPlayer12.seek(ultimaPosicion);
        mediaPlayer12.play();
    }//GEN-LAST:event_btcontinua12MouseClicked

    private void btcontinua13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua13MouseClicked
        // TODO add your handling code here:
        mediaPlayer13.seek(ultimaPosicion);
        mediaPlayer13.play();
    }//GEN-LAST:event_btcontinua13MouseClicked

    private void btcontinua14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua14MouseClicked
        // TODO add your handling code here:
        mediaPlayer14.seek(ultimaPosicion);
        mediaPlayer14.play();
    }//GEN-LAST:event_btcontinua14MouseClicked

    private void btcontinua15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua15MouseClicked
        // TODO add your handling code here:
        mediaPlayer15.seek(ultimaPosicion);
        mediaPlayer15.play();
    }//GEN-LAST:event_btcontinua15MouseClicked

    private void btcontinua16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua16MouseClicked
        // TODO add your handling code here:
        mediaPlayer16.seek(ultimaPosicion);
        mediaPlayer16.play();
    }//GEN-LAST:event_btcontinua16MouseClicked

    private void btcontinua17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua17MouseClicked
        // TODO add your handling code here:
        mediaPlayer17.seek(ultimaPosicion);
        mediaPlayer17.play();
    }//GEN-LAST:event_btcontinua17MouseClicked

    private void btcontinua18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua18MouseClicked
        // TODO add your handling code here:
        mediaPlayer18.seek(ultimaPosicion);
        mediaPlayer18.play();
    }//GEN-LAST:event_btcontinua18MouseClicked

    private void btcontinua19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua19MouseClicked
        // TODO add your handling code here:
        mediaPlayer19.seek(ultimaPosicion);
        mediaPlayer19.play();
    }//GEN-LAST:event_btcontinua19MouseClicked

    private void btcontinua20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua20MouseClicked
        // TODO add your handling code here:
        mediaPlayer20.seek(ultimaPosicion);
        mediaPlayer20.play();
    }//GEN-LAST:event_btcontinua20MouseClicked

    private void btcontinua21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua21MouseClicked
        // TODO add your handling code here:
        mediaPlayer21.seek(ultimaPosicion);
        mediaPlayer21.play();
    }//GEN-LAST:event_btcontinua21MouseClicked

    private void btcontinua22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua22MouseClicked
        // TODO add your handling code here:
        mediaPlayer22.seek(ultimaPosicion);
        mediaPlayer22.play();
    }//GEN-LAST:event_btcontinua22MouseClicked

    private void btcontinua23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua23MouseClicked
        // TODO add your handling code here:
        mediaPlayer23.seek(ultimaPosicion);
        mediaPlayer23.play();
    }//GEN-LAST:event_btcontinua23MouseClicked

    private void btcontinua24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua24MouseClicked
        // TODO add your handling code here:
        mediaPlayer24.seek(ultimaPosicion);
        mediaPlayer24.play();
    }//GEN-LAST:event_btcontinua24MouseClicked

    private void btcontinua25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua25MouseClicked
        // TODO add your handling code here:
        mediaPlayer25.seek(ultimaPosicion);
        mediaPlayer25.play();
    }//GEN-LAST:event_btcontinua25MouseClicked

    private void btcontinua26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua26MouseClicked
        // TODO add your handling code here:
        mediaPlayer26.seek(ultimaPosicion);
        mediaPlayer26.play();
    }//GEN-LAST:event_btcontinua26MouseClicked

    private void btcontinua27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua27MouseClicked
        // TODO add your handling code here:
        mediaPlayer27.seek(ultimaPosicion);
        mediaPlayer27.play();
    }//GEN-LAST:event_btcontinua27MouseClicked

    private void btcontinua28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua28MouseClicked
        // TODO add your handling code here:
        mediaPlayer28.seek(ultimaPosicion);
        mediaPlayer28.play();
    }//GEN-LAST:event_btcontinua28MouseClicked

    private void btcontinua29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua29MouseClicked
        // TODO add your handling code here:
        mediaPlayer29.seek(ultimaPosicion);
        mediaPlayer29.play();
    }//GEN-LAST:event_btcontinua29MouseClicked

    private void btcontinua30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua30MouseClicked
        // TODO add your handling code here:
        mediaPlayer30.seek(ultimaPosicion);
        mediaPlayer30.play();
    }//GEN-LAST:event_btcontinua30MouseClicked

    private void btcontinua31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua31MouseClicked
        // TODO add your handling code here:
        mediaPlayer31.seek(ultimaPosicion);
        mediaPlayer31.play();
    }//GEN-LAST:event_btcontinua31MouseClicked

    private void btcontinua32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua32MouseClicked
        // TODO add your handling code here:
        mediaPlayer32.seek(ultimaPosicion);
        mediaPlayer32.play();
    }//GEN-LAST:event_btcontinua32MouseClicked

    private void btcontinua33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua33MouseClicked
        // TODO add your handling code here:
        mediaPlayer33.seek(ultimaPosicion);
        mediaPlayer33.play();
    }//GEN-LAST:event_btcontinua33MouseClicked

    private void btcontinua34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btcontinua34MouseClicked
        // TODO add your handling code here:
        mediaPlayer34.seek(ultimaPosicion);
        mediaPlayer34.play();
    }//GEN-LAST:event_btcontinua34MouseClicked

    private void btparar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar2MouseClicked
        // TODO add your handling code here:
        mediaPlayer2.pause();
        ultimaPosicion = mediaPlayer2.getCurrentTime();
    }//GEN-LAST:event_btparar2MouseClicked

    private void btparar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar3MouseClicked
        // TODO add your handling code here:
        mediaPlayer3.pause();
        ultimaPosicion = mediaPlayer3.getCurrentTime();
    }//GEN-LAST:event_btparar3MouseClicked

    private void btparar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar4MouseClicked
        // TODO add your handling code here:
        mediaPlayer4.pause();
        ultimaPosicion = mediaPlayer4.getCurrentTime();
    }//GEN-LAST:event_btparar4MouseClicked

    private void btparar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar5MouseClicked
        // TODO add your handling code here:
        mediaPlayer5.pause();
        ultimaPosicion = mediaPlayer5.getCurrentTime();
    }//GEN-LAST:event_btparar5MouseClicked

    private void btparar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar6MouseClicked
        // TODO add your handling code here:
        mediaPlayer6.pause();
        ultimaPosicion = mediaPlayer6.getCurrentTime();
    }//GEN-LAST:event_btparar6MouseClicked

    private void btparar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar7MouseClicked
        // TODO add your handling code here:
        mediaPlayer7.pause();
        ultimaPosicion = mediaPlayer7.getCurrentTime();
    }//GEN-LAST:event_btparar7MouseClicked

    private void btparar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar8MouseClicked
        // TODO add your handling code here:
        mediaPlayer8.pause();
        ultimaPosicion = mediaPlayer8.getCurrentTime();
    }//GEN-LAST:event_btparar8MouseClicked

    private void btparar9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar9MouseClicked
        // TODO add your handling code here:
        mediaPlayer9.pause();
        ultimaPosicion = mediaPlayer9.getCurrentTime();
    }//GEN-LAST:event_btparar9MouseClicked

    private void btparar10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar10MouseClicked
        // TODO add your handling code here:
        mediaPlayer10.pause();
        ultimaPosicion = mediaPlayer10.getCurrentTime();
    }//GEN-LAST:event_btparar10MouseClicked

    private void btparar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar11MouseClicked
        // TODO add your handling code here:
        mediaPlayer11.pause();
        ultimaPosicion = mediaPlayer11.getCurrentTime();
    }//GEN-LAST:event_btparar11MouseClicked

    private void btparar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar12MouseClicked
        // TODO add your handling code here:
        mediaPlayer12.pause();
        ultimaPosicion = mediaPlayer12.getCurrentTime();
    }//GEN-LAST:event_btparar12MouseClicked

    private void btparar13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar13MouseClicked
        // TODO add your handling code here:
        mediaPlayer13.pause();
        ultimaPosicion = mediaPlayer13.getCurrentTime();
    }//GEN-LAST:event_btparar13MouseClicked

    private void btparar14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar14MouseClicked
        // TODO add your handling code here:
        mediaPlayer14.pause();
        ultimaPosicion = mediaPlayer14.getCurrentTime();
    }//GEN-LAST:event_btparar14MouseClicked

    private void btparar15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar15MouseClicked
        // TODO add your handling code here:
        mediaPlayer15.pause();
        ultimaPosicion = mediaPlayer15.getCurrentTime();
    }//GEN-LAST:event_btparar15MouseClicked

    private void btparar16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar16MouseClicked
        // TODO add your handling code here:
        mediaPlayer16.pause();
        ultimaPosicion = mediaPlayer16.getCurrentTime();
    }//GEN-LAST:event_btparar16MouseClicked

    private void btparar17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar17MouseClicked
        // TODO add your handling code here:
        mediaPlayer17.pause();
        ultimaPosicion = mediaPlayer17.getCurrentTime();
    }//GEN-LAST:event_btparar17MouseClicked

    private void btparar18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar18MouseClicked
        // TODO add your handling code here:
        mediaPlayer18.pause();
        ultimaPosicion = mediaPlayer18.getCurrentTime();
    }//GEN-LAST:event_btparar18MouseClicked

    private void btparar19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar19MouseClicked
        // TODO add your handling code here:
        mediaPlayer19.pause();
        ultimaPosicion = mediaPlayer19.getCurrentTime();
    }//GEN-LAST:event_btparar19MouseClicked

    private void btparar20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar20MouseClicked
        // TODO add your handling code here:
        mediaPlayer20.pause();
        ultimaPosicion = mediaPlayer20.getCurrentTime();
    }//GEN-LAST:event_btparar20MouseClicked

    private void btparar21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar21MouseClicked
        // TODO add your handling code here:
        mediaPlayer21.pause();
        ultimaPosicion = mediaPlayer21.getCurrentTime();
    }//GEN-LAST:event_btparar21MouseClicked

    private void btparar22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar22MouseClicked
        // TODO add your handling code here:
        mediaPlayer22.pause();
        ultimaPosicion = mediaPlayer22.getCurrentTime();
    }//GEN-LAST:event_btparar22MouseClicked

    private void btparar23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar23MouseClicked
        // TODO add your handling code here:
        mediaPlayer23.pause();
        ultimaPosicion = mediaPlayer23.getCurrentTime();
    }//GEN-LAST:event_btparar23MouseClicked

    private void btparar24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar24MouseClicked
        // TODO add your handling code here:
        mediaPlayer24.pause();
        ultimaPosicion = mediaPlayer24.getCurrentTime();
    }//GEN-LAST:event_btparar24MouseClicked

    private void btparar25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar25MouseClicked
        // TODO add your handling code here:
        mediaPlayer25.pause();
        ultimaPosicion = mediaPlayer25.getCurrentTime();
    }//GEN-LAST:event_btparar25MouseClicked

    private void btparar26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar26MouseClicked
        // TODO add your handling code here:
        mediaPlayer26.pause();
        ultimaPosicion = mediaPlayer26.getCurrentTime();
    }//GEN-LAST:event_btparar26MouseClicked

    private void btparar27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar27MouseClicked
        // TODO add your handling code here:
        mediaPlayer27.pause();
        ultimaPosicion = mediaPlayer27.getCurrentTime();
    }//GEN-LAST:event_btparar27MouseClicked

    private void btparar28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar28MouseClicked
        // TODO add your handling code here:
        mediaPlayer28.pause();
        ultimaPosicion = mediaPlayer28.getCurrentTime();
    }//GEN-LAST:event_btparar28MouseClicked

    private void btparar29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar29MouseClicked
        // TODO add your handling code here:
        mediaPlayer29.pause();
        ultimaPosicion = mediaPlayer29.getCurrentTime();
    }//GEN-LAST:event_btparar29MouseClicked

    private void btparar30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar30MouseClicked
        // TODO add your handling code here:
        mediaPlayer30.pause();
        ultimaPosicion = mediaPlayer30.getCurrentTime();
    }//GEN-LAST:event_btparar30MouseClicked

    private void btparar31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar31MouseClicked
        // TODO add your handling code here:
        mediaPlayer31.pause();
        ultimaPosicion = mediaPlayer31.getCurrentTime();
    }//GEN-LAST:event_btparar31MouseClicked

    private void btparar32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar32MouseClicked
        // TODO add your handling code here:
        mediaPlayer32.pause();
        ultimaPosicion = mediaPlayer32.getCurrentTime();
    }//GEN-LAST:event_btparar32MouseClicked

    private void btparar33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar33MouseClicked
        // TODO add your handling code here:
        mediaPlayer33.pause();
        ultimaPosicion = mediaPlayer33.getCurrentTime();
    }//GEN-LAST:event_btparar33MouseClicked

    private void btparar34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btparar34MouseClicked
        // TODO add your handling code here:
        mediaPlayer34.pause();
        ultimaPosicion = mediaPlayer34.getCurrentTime();
    }//GEN-LAST:event_btparar34MouseClicked

    private void btparar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btparar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btparar3ActionPerformed

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
    private javax.swing.JButton btcontinua10;
    private javax.swing.JButton btcontinua11;
    private javax.swing.JButton btcontinua12;
    private javax.swing.JButton btcontinua13;
    private javax.swing.JButton btcontinua14;
    private javax.swing.JButton btcontinua15;
    private javax.swing.JButton btcontinua16;
    private javax.swing.JButton btcontinua17;
    private javax.swing.JButton btcontinua18;
    private javax.swing.JButton btcontinua19;
    private javax.swing.JButton btcontinua2;
    private javax.swing.JButton btcontinua20;
    private javax.swing.JButton btcontinua21;
    private javax.swing.JButton btcontinua22;
    private javax.swing.JButton btcontinua23;
    private javax.swing.JButton btcontinua24;
    private javax.swing.JButton btcontinua25;
    private javax.swing.JButton btcontinua26;
    private javax.swing.JButton btcontinua27;
    private javax.swing.JButton btcontinua28;
    private javax.swing.JButton btcontinua29;
    private javax.swing.JButton btcontinua3;
    private javax.swing.JButton btcontinua30;
    private javax.swing.JButton btcontinua31;
    private javax.swing.JButton btcontinua32;
    private javax.swing.JButton btcontinua33;
    private javax.swing.JButton btcontinua34;
    private javax.swing.JButton btcontinua4;
    private javax.swing.JButton btcontinua5;
    private javax.swing.JButton btcontinua6;
    private javax.swing.JButton btcontinua7;
    private javax.swing.JButton btcontinua8;
    private javax.swing.JButton btcontinua9;
    private javax.swing.JButton btcontinuar1;
    private javax.swing.JButton btcumplirdeseo;
    private javax.swing.JButton btdespertarenhospitalMotivacion;
    private javax.swing.JButton btdespertarhospitaldesmotivado;
    private javax.swing.JButton bthuirbosque;
    private javax.swing.JButton bthuirconosos;
    private javax.swing.JButton bthuirperro;
    private javax.swing.JButton btignorarultimavida;
    private javax.swing.JButton btiniciar10;
    private javax.swing.JButton btiniciar11;
    private javax.swing.JButton btiniciar12;
    private javax.swing.JButton btiniciar13;
    private javax.swing.JButton btiniciar14;
    private javax.swing.JButton btiniciar15;
    private javax.swing.JButton btiniciar16;
    private javax.swing.JButton btiniciar17;
    private javax.swing.JButton btiniciar18;
    private javax.swing.JButton btiniciar19;
    private javax.swing.JButton btiniciar2;
    private javax.swing.JButton btiniciar20;
    private javax.swing.JButton btiniciar21;
    private javax.swing.JButton btiniciar22;
    private javax.swing.JButton btiniciar23;
    private javax.swing.JButton btiniciar24;
    private javax.swing.JButton btiniciar25;
    private javax.swing.JButton btiniciar26;
    private javax.swing.JButton btiniciar27;
    private javax.swing.JButton btiniciar28;
    private javax.swing.JButton btiniciar29;
    private javax.swing.JButton btiniciar3;
    private javax.swing.JButton btiniciar30;
    private javax.swing.JButton btiniciar31;
    private javax.swing.JButton btiniciar32;
    private javax.swing.JButton btiniciar33;
    private javax.swing.JButton btiniciar34;
    private javax.swing.JButton btiniciar4;
    private javax.swing.JButton btiniciar5;
    private javax.swing.JButton btiniciar6;
    private javax.swing.JButton btiniciar7;
    private javax.swing.JButton btiniciar8;
    private javax.swing.JButton btiniciar9;
    private javax.swing.JButton btinicio1;
    private javax.swing.JButton btirgolemtranquilamente;
    private javax.swing.JButton btparado1;
    private javax.swing.JButton btparar10;
    private javax.swing.JButton btparar11;
    private javax.swing.JButton btparar12;
    private javax.swing.JButton btparar13;
    private javax.swing.JButton btparar14;
    private javax.swing.JButton btparar15;
    private javax.swing.JButton btparar16;
    private javax.swing.JButton btparar17;
    private javax.swing.JButton btparar18;
    private javax.swing.JButton btparar19;
    private javax.swing.JButton btparar2;
    private javax.swing.JButton btparar20;
    private javax.swing.JButton btparar21;
    private javax.swing.JButton btparar22;
    private javax.swing.JButton btparar23;
    private javax.swing.JButton btparar24;
    private javax.swing.JButton btparar25;
    private javax.swing.JButton btparar26;
    private javax.swing.JButton btparar27;
    private javax.swing.JButton btparar28;
    private javax.swing.JButton btparar29;
    private javax.swing.JButton btparar3;
    private javax.swing.JButton btparar30;
    private javax.swing.JButton btparar31;
    private javax.swing.JButton btparar32;
    private javax.swing.JButton btparar33;
    private javax.swing.JButton btparar34;
    private javax.swing.JButton btparar4;
    private javax.swing.JButton btparar5;
    private javax.swing.JButton btparar6;
    private javax.swing.JButton btparar7;
    private javax.swing.JButton btparar8;
    private javax.swing.JButton btparar9;
    private javax.swing.JButton btpeleagatobosque;
    private javax.swing.JButton btpelearconmiedohuidahospital;
    private javax.swing.JButton btpelearconperro;
    private javax.swing.JButton btquedarseperro;
    private javax.swing.JButton btregresar1;
    private javax.swing.JButton btregresar10;
    private javax.swing.JButton btregresar11;
    private javax.swing.JButton btregresar12;
    private javax.swing.JButton btregresar13;
    private javax.swing.JButton btregresar14;
    private javax.swing.JButton btregresar15;
    private javax.swing.JButton btregresar16;
    private javax.swing.JButton btregresar17;
    private javax.swing.JButton btregresar18;
    private javax.swing.JButton btregresar19;
    private javax.swing.JButton btregresar2;
    private javax.swing.JButton btregresar20;
    private javax.swing.JButton btregresar21;
    private javax.swing.JButton btregresar22;
    private javax.swing.JButton btregresar23;
    private javax.swing.JButton btregresar24;
    private javax.swing.JButton btregresar25;
    private javax.swing.JButton btregresar26;
    private javax.swing.JButton btregresar27;
    private javax.swing.JButton btregresar28;
    private javax.swing.JButton btregresar29;
    private javax.swing.JButton btregresar3;
    private javax.swing.JButton btregresar30;
    private javax.swing.JButton btregresar31;
    private javax.swing.JButton btregresar32;
    private javax.swing.JButton btregresar33;
    private javax.swing.JButton btregresar34;
    private javax.swing.JButton btregresar4;
    private javax.swing.JButton btregresar5;
    private javax.swing.JButton btregresar6;
    private javax.swing.JButton btregresar7;
    private javax.swing.JButton btregresar8;
    private javax.swing.JButton btregresar9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton vtavancemos1;
    private javax.swing.JButton vtavancemos10;
    private javax.swing.JButton vtavancemos11;
    private javax.swing.JButton vtavancemos12;
    private javax.swing.JButton vtavancemos13;
    private javax.swing.JButton vtavancemos14;
    private javax.swing.JButton vtavancemos15;
    private javax.swing.JButton vtavancemos16;
    private javax.swing.JButton vtavancemos17;
    private javax.swing.JButton vtavancemos18;
    private javax.swing.JButton vtavancemos19;
    private javax.swing.JButton vtavancemos2;
    private javax.swing.JButton vtavancemos20;
    private javax.swing.JButton vtavancemos21;
    private javax.swing.JButton vtavancemos22;
    private javax.swing.JButton vtavancemos23;
    private javax.swing.JButton vtavancemos24;
    private javax.swing.JButton vtavancemos25;
    private javax.swing.JButton vtavancemos26;
    private javax.swing.JButton vtavancemos27;
    private javax.swing.JButton vtavancemos28;
    private javax.swing.JButton vtavancemos29;
    private javax.swing.JButton vtavancemos3;
    private javax.swing.JButton vtavancemos30;
    private javax.swing.JButton vtavancemos31;
    private javax.swing.JButton vtavancemos32;
    private javax.swing.JButton vtavancemos33;
    private javax.swing.JButton vtavancemos34;
    private javax.swing.JButton vtavancemos4;
    private javax.swing.JButton vtavancemos5;
    private javax.swing.JButton vtavancemos6;
    private javax.swing.JButton vtavancemos7;
    private javax.swing.JButton vtavancemos8;
    private javax.swing.JButton vtavancemos9;
    // End of variables declaration//GEN-END:variables

}
