/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUniversitas;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author user only
 */
public class KelasKuliah implements Serializable{
    private String kodeKelas;
    private String namaKelas;
    private ArrayList<Mahasiswa> daftarPeserta = new ArrayList<Mahasiswa>();

    public KelasKuliah() {
    }

    public KelasKuliah(String kodeKelas, String namaKelas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
    }

    /**
     * @return the kodeKelas
     */
    public String getKodeKelas() {
        return kodeKelas;
    }

    /**
     * @param kodeKelas the kodeKelas to set
     */
    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    /**
     * @return the namaKelas
     */
    public String getNamaKelas() {
        return namaKelas;
    }

    /**
     * @param namaKelas the namaKelas to set
     */
    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    /**
     * @return the daftarPeserta
     */
    public ArrayList<Mahasiswa> getDaftarPeserta() {
        return daftarPeserta;
    }

    /**
     * @param daftarPeserta the daftarPeserta to set
     */
    public void setDaftarPeserta(ArrayList<Mahasiswa> daftarPeserta) {
        this.daftarPeserta = daftarPeserta;
    }
    
    public String toString(){
        String header = kodeKelas+"\t"+namaKelas+"\n";
        String body ="";
        for (int i = 0; i < daftarPeserta.size(); i++) {
            body=body+daftarPeserta.get(i).toString();
        }
        return header+body;
    }
    public void tambahMahasiswa(Mahasiswa mahasiswa){
        daftarPeserta.add(mahasiswa);
    } 
}
