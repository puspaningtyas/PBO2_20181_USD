/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUniversitas;

import java.util.ArrayList;

/**
 *
 * @author user only
 */
public class ProgramStudi {

    private String kode;
    private String nama;
    
    private ArrayList<CalonMahasiswa> daftarCalonMahasiswa=
            new ArrayList<CalonMahasiswa>();

    public ProgramStudi() {
    }

    public ProgramStudi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
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

    
}
