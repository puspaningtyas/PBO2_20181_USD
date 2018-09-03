/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user only
 */
public class AntrianKlinik {
    private Date tanggalAntrian;
    private String namaKlinik;
    
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public void mendaftar(Pasien pasien){
        getDaftarPasien().add(pasien);
    }
    
    /**
     * @return the tanggalAntrian
     */
    public Date getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * @param tanggalAntrian the tanggalAntrian to set
     */
    public void setTanggalAntrian(Date tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    /**
     * @return the namaKlinik
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**
     * @param namaKlinik the namaKlinik to set
     */
    public void setNamaKlinik(String namaKlinik) {
        this.namaKlinik = namaKlinik;
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
    
    
    
}
