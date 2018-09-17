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
 * @author admin
 */
public class Pasien {
    
    public static ArrayList<Pasien> daftarPasien= 
            new ArrayList<Pasien>();
    
    public static void tambahPasien(Pasien pasien){
        daftarPasien.add(pasien);
    }
    
    public static Pasien cariPasien(String noRM){
        for (int i = 0; i < daftarPasien.size(); i++) {
            if(daftarPasien.get(i).noRM.equalsIgnoreCase(noRM))
                return daftarPasien.get(i);
        }
        return null;
    }
    
    private String nama;
    private Date tanggalLahir;
    private String alamat;
    private String noRM;
    private String nik;

    public Pasien(String nama) {
        this.nama = nama;
    }
    
    public Pasien(String noRM,String nama) {
        this.nama = nama;
        this.noRM = noRM;
    }

    public Pasien() {
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
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    /**
     * 
     * @param tahun
     * @param bulan
     * @param tanggal 
     */
    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        setTanggalLahir(new Date(tahun-1900,bulan-1,tanggal));
    }
    
    public int getUsia(){
        Date today = new Date();
        return today.getYear() - getTanggalLahir().getYear();
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

    /**
     * @return the noRM
     */
    public String getNoRM() {
        return noRM;
    }

    /**
     * @param noRM the noRM to set
     */
    public void setNoRM(String noRM) {
        this.noRM = noRM;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }
}
