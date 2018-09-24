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
    private String nomorNIK;
    private String nama;

    public CalonMahasiswa() {
    }

    public CalonMahasiswa(String noNIK, String nama) {
        this.nomorNIK = noNIK;
        this.nama = nama;
    }

    /**
     * @return the nomorNIK
     */
    public String getNomorNIK() {
        return nomorNIK;
    }

    /**
     * @param noDaftar the nomorNIK to set
     */
    public void setNomorNIK(String noNIK) {
        this.nomorNIK = noNIK;
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
