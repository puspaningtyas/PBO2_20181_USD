/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Pasien;
import model.RumahSakit;

/**
 *
 * @author Puspaningtyas
 */
public class TambahPasienDialog extends JDialog implements ActionListener {

    private JLabel namaLabel;
    private JTextField namaText;
    
    private JLabel jenisKelaminLabel;
    private JRadioButton lelakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private JLabel noRMLabel;
    private JTextField noRMText;
    private JButton tambahButton;

    private RumahSakit rs = new RumahSakit();
    
    public TambahPasienDialog() {
        init();
    }

    public TambahPasienDialog(String title) {
        this.setTitle(title);
        init();
    }

    public TambahPasienDialog(Frame owner, String title) {
        super(owner, title);
        init();
    }
    
    

    /**
     * Fungsi inisialisasi atribut
     */
    public void init() {
        this.setLayout(null);
        // label nama
        noRMLabel = new JLabel("NoRM");
        // pengaturan posisi label : posisi 50,250, lebar 50, tinggi 10
        noRMLabel.setBounds(50, 50, 150, 20);
        noRMLabel.setFont(new Font(null,Font.PLAIN,18));
        this.add(noRMLabel);
        
        noRMText = new JTextField(50);
        noRMText.setBounds(150, 50, 150, 20);
        noRMText.setFont(new Font(null,Font.PLAIN,18));
        this.add(noRMText);
        
        // label nama
        namaLabel = new JLabel("Nama");
        // pengaturan posisi label : posisi 50,250, lebar 50, tinggi 10
        namaLabel.setBounds(50, 80, 150, 20);
        namaLabel.setFont(new Font(null,Font.PLAIN,18));
        this.add(namaLabel);
        
        namaText = new JTextField(50);
        namaText.setBounds(150, 80, 150, 20);
        namaText.setFont(new Font(null,Font.PLAIN,18));
        this.add(namaText);
        
        jenisKelaminLabel = new JLabel("Kelamin");
        // pengaturan posisi label : posisi 50,250, lebar 50, tinggi 10
        jenisKelaminLabel.setBounds(50, 120, 150, 20);
        jenisKelaminLabel.setFont(new Font(null,Font.PLAIN,18));
        this.add(jenisKelaminLabel);
        
        lelakiRadioButton = new JRadioButton("Lelaki");
        lelakiRadioButton.setBounds(150, 120, 250, 20);
        lelakiRadioButton.setFont(new Font(null,Font.PLAIN,18));
        this.add(lelakiRadioButton);
        
        perempuanRadioButton = new JRadioButton("perempuan");
        perempuanRadioButton.setBounds(150, 150, 250, 20);
        perempuanRadioButton.setFont(new Font(null,Font.PLAIN,18));
        perempuanRadioButton.setBackground(Color.red);
        this.add(perempuanRadioButton);
        // buat grup button
        ButtonGroup kelaminButtonGroup = new ButtonGroup();
        kelaminButtonGroup.add(lelakiRadioButton);
        kelaminButtonGroup.add(perempuanRadioButton);
        //atur background warna putih
        Container content = this.getContentPane();
        content.setBackground(Color.white);
        
        // tambah action
        namaText.addActionListener(this);
        
        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(150, 200, 100, 30);
        this.add(tambahButton);
        tambahButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==namaText){
            JOptionPane.showMessageDialog(null, namaText.getText());
        }
        if(e.getSource()==tambahButton){
            Pasien baru = new Pasien();
            baru.setNoRM(noRMText.getText());
            baru.setNama(namaText.getText());
            rs.tambahPasien(baru);
            this.dispose();
        }
    }
}
