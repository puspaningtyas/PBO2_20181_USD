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
public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem fileMenuItem;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("Main Frame");
        // buat menu
        fileMenu = new JMenu("File");
        //buat exit menu item
        exitMenuItem = new JMenuItem("exit");
        // buat file menu item
        fileMenuItem = new JMenuItem("New");
        fileMenuItem.setMnemonic(KeyEvent.VK_N);
        // tambah ke menu item
        fileMenu.add(fileMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        // set menuBar
        this.setJMenuBar(menuBar);
        // action listener
        exitMenuItem.addActionListener(this);
        fileMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == fileMenuItem) {
            LatihanDialog test = new LatihanDialog(this,"ini latihan");
            test.setSize(300, 400);
            test.setVisible(true);
//            this.add(test);
        }
    }

}
