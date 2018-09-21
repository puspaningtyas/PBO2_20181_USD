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
    
    private static ArrayList<Pasien> daftarPasien= 
            new ArrayList<Pasien>();
    
    public static void tambahPasien(Pasien pasien){
        getDaftarPasien().add(pasien);
    }
    
    public static Pasien cariPasien(String noRM){
        for (int i = 0; i < getDaftarPasien().size(); i++) {
            if(getDaftarPasien().get(i).getNoRM().equalsIgnoreCase(noRM))
                return getDaftarPasien().get(i);
        }
        return null;
    }
    
    private String nama;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
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

    
    public int getUsia(){
        Date today = new Date();
        Date tglLahir = new Date(
                getTahunLahir()-1900, // tahun lahir
                getBulanLahir()-1, // bulan lahir
                getTanggalLahir() // tanggal lahir
        );
        return today.getYear() - tglLahir.getYear();
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

    /**
     * @return the daftarPasien
     */
    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    /**
     * @param aDaftarPasien the daftarPasien to set
     */
    public static void setDaftarPasien(ArrayList<Pasien> aDaftarPasien) {
        daftarPasien = aDaftarPasien;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the bulanLahir
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * @param bulanLahir the bulanLahir to set
     */
    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    /**
     * @return the tahunLahir
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * @param tahunLahir the tahunLahir to set
     */
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    /**
     * @return the tanggalLahir
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }
    
    public String toString(){
        return nama+","+alamat;
    }
}
