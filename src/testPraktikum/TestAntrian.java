/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPraktikum;

import model.AntrianKlinik;
import model.Pasien;

/**
 *
 * @author user only
 */
public class TestAntrian {
    public static void main(String[] args) {
        Pasien test1 = new Pasien("puspa");
        Pasien test2 = new Pasien("adi");
        
        AntrianKlinik antri1 = new AntrianKlinik();
        antri1.mendaftar(test1);
        antri1.mendaftar(test2);
        
        for (int i = 0; i < antri1.getDaftarPasien().size(); i++) {
            System.out.println(antri1.getDaftarPasien().get(i).getNama());
        }
    }
}
