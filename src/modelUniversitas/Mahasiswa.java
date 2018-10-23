/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelUniversitas;

import java.io.Serializable;

/**
 *
 * @author user only
 */
public class Mahasiswa implements Serializable{
    private String nim;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
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
    
    public String toString(){
        return nim+"\t"+nama+"\n";
    }
    
    public void toMahasiswa(String mahasiswa){
        String dataMahasiswa[] = mahasiswa.split("\t");
        this.setNim(dataMahasiswa[0]);
        this.setNama(dataMahasiswa[1]);
    } 
}
