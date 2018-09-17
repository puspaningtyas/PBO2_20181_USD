/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Puspaningtyas
 */
public class FrameUtama extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem tambahAntrianMenuItem;

    public FrameUtama() throws HeadlessException {
        init();
    }

    public void init() {
        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("Main Frame");
        // buat menu
        pasienMenu = new JMenu("Pasien");
        //buat exit menu item
        exitMenuItem = new JMenuItem("exit");
        // buat file menu item
        tambahPasienMenuItem = new JMenuItem("TambahPasien");
        tambahPasienMenuItem.setMnemonic(KeyEvent.VK_T);

        // buat file menu item
        tambahAntrianMenuItem = new JMenuItem("TambahAntrian");
        tambahAntrianMenuItem.setMnemonic(KeyEvent.VK_A);
        // tambah ke menu item
        pasienMenu.add(tambahAntrianMenuItem);
        pasienMenu.add(tambahPasienMenuItem);
        pasienMenu.add(exitMenuItem);
        menuBar.add(pasienMenu);
        // set menuBar
        this.setJMenuBar(menuBar);
        // action listener
        exitMenuItem.addActionListener(this);
        tambahPasienMenuItem.addActionListener(this);
        tambahAntrianMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TambahAntrianDialog test = new TambahAntrianDialog(null, true);
                test.setSize(500, 400);
                test.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == tambahPasienMenuItem) {
            TambahPasienDialog test = new TambahPasienDialog(this, "ini latihan");
            test.setSize(300, 400);
            test.setVisible(true);
//            this.add(test);
        }
//        if(e.getSource()== tambahAntrianMenuItem){
//            TambahAntrianDialog test = new TambahAntrianDialog(this, true);
//            test.setSize(500, 400);
//            test.setVisible(true);
//        }
    }

}
