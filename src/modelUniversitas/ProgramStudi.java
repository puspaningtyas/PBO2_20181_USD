/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUniversitas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user only
 */
public class ProgramStudi {

    private String kode;
    private String nama;

    private ArrayList<CalonMahasiswa> daftarCalonMahasiswa
            = new ArrayList<CalonMahasiswa>();

    public int cariCalonMahasiswa(String noNIK) {
        for (int i = 0; i < daftarCalonMahasiswa.size(); i++) {
            if (noNIK.equalsIgnoreCase(
                    daftarCalonMahasiswa.get(i).getNomorNIK())) {
                return i;
            }
        }
        return -1;
    }

    public void mendaftar(CalonMahasiswa calon) {
        if (cariCalonMahasiswa(calon.getNomorNIK())  == -1) {
            daftarCalonMahasiswa.add(calon);
        } else{
           JOptionPane.showMessageDialog(null, "Calon Sudah Ada");
        }
    }

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
