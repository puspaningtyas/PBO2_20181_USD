/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user only
 */
public class RumahSakit {
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private String nama;
    private String alamat;

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void tambahPasien(Pasien pasien){
        getDaftarPasien().add(pasien);
    }
    
    public Pasien cariPasien(String noRM){
        for (int i = 0; i < getDaftarPasien().size(); i++) {
            if(getDaftarPasien().get(i).getNoRM().equalsIgnoreCase(noRM))
                return getDaftarPasien().get(i);
        }
        return null;
    }

    public void tambahPasienBaru(Pasien test) {
        getDaftarPasien().add(test);
    }

    public void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < getDaftarPasien().size(); i++) {
                String data = getDaftarPasien().get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;
            
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void simpanObjekDaftarPasien(File file) {
    }
    
    public void bacaObjekDaftarPasien(File file) {
    }
    /**
     * @return the daftarPasien
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * @param daftarPasien the daftarPasien to set
     */
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
