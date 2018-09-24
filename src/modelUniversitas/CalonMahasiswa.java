/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUniversitas;

/**
 *
 * @author user only
 */
public class CalonMahasiswa {
    private String noDaftar;
    private String nama;

    public CalonMahasiswa() {
    }

    public CalonMahasiswa(String noDaftar, String nama) {
        this.noDaftar = noDaftar;
        this.nama = nama;
    }

    /**
     * @return the noDaftar
     */
    public String getNoDaftar() {
        return noDaftar;
    }

    /**
     * @param noDaftar the noDaftar to set
     */
    public void setNoDaftar(String noDaftar) {
        this.noDaftar = noDaftar;
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
