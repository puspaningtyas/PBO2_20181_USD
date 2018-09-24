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
public class Universitas {
    private String nama;
    
    public static ArrayList<ProgramStudi> daftarProdi
            = new ArrayList<ProgramStudi>();

    public static int cariProgramStudi(String nama){
        for (int i = 0; i < daftarProdi.size(); i++) {
            if(nama.equalsIgnoreCase(daftarProdi.get(i).getNama()))
                return i;
        }
        return -1;
    }
    public Universitas() {
    }

    public Universitas(String nama) {
        this.nama = nama;
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
     * @return the daftarProdi
     */
    public static ArrayList<ProgramStudi> getDaftarProdi() {
        return daftarProdi;
    }

    /**
     * @param aDaftarProdi the daftarProdi to set
     */
    public static void setDaftarProdi(ArrayList<ProgramStudi> aDaftarProdi) {
        daftarProdi = aDaftarProdi;
    }
    
}
