/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCanvas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import modelCanvas.Bola;

/**
 *
 * @author user only
 */
public class CanvasFrame extends JFrame {

    private BolaPanel bolaPanel;
    private JLabel perintahlabel;
    private JTextField perintahText;
    private JButton okButton;

    private JMenuBar menuBar;
    private JMenu gameMenu;
    private JMenuItem exitMenuItem;

    public CanvasFrame() {
        init();
    }

    public void init() {
        this.setSize(500, 300);
        this.setLayout(new BorderLayout());
        this.setTitle("My Game");

        // set menu Bar
        menuBar = new JMenuBar();
        gameMenu = new JMenu("Game");
        exitMenuItem = new JMenuItem("Exit");
        gameMenu.add(exitMenuItem);
        menuBar.add(gameMenu);
        setJMenuBar(menuBar);
        
        //action perform for exitMenuItem
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        );

        // panel center
        bolaPanel = new BolaPanel();

        // panel selatan
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());

        this.perintahlabel = new JLabel("Perintah");
        southPanel.add(perintahlabel);

        this.perintahText = new JTextField(20);
        southPanel.add(perintahText);

        this.okButton = new JButton("OK");
        southPanel.add(okButton);

        // buat obyek Bola
        Bola bola1 = new Bola(20, 20, 30, Color.RED);
        Bola bola2 = new Bola(20, 50, 30, Color.BLUE);
        Bola bola3 = new Bola(60, 50, 30, Color.CYAN);

        // buat list bola
        ArrayList<Bola> listBola = new ArrayList<Bola>();
        listBola.add(bola1);
        listBola.add(bola2);
        listBola.add(bola3);

        // set list bola di bolaPanel
        this.bolaPanel.setListBola(listBola);

        // set logo panel
        this.okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pindah();
            }

        });

        // get contentpane & add bolaPanel and southPanel to container
        Container cp = this.getContentPane();
        cp.add(bolaPanel, BorderLayout.CENTER);
        cp.add(southPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    private void pindah() {
        ArrayList<Bola> daftarSementara = this.bolaPanel.getListBola();
        for (int i = 0; i < daftarSementara.size(); i++) {
            daftarSementara.get(i).setPosisiX(
                    daftarSementara.get(i).getPosisiX() + 20);
        }
        this.bolaPanel.setListBola(daftarSementara);
        this.bolaPanel.gambarUlang();
    }
}
