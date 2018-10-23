/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test17oktober;

import java.io.File;
import model.Pasien;
import model.RumahSakit;

/**
 *
 * @author admin
 */
public class TestStream {
    public static void main(String[] args) {
        Pasien test = new Pasien();
        test.setNoRM("001");
        test.setNama("puspa");
        test.setAlamat("klaten");
        
        Pasien test1 = new Pasien();
        test1.setNoRM("002");
        test1.setNama("adi");
        test1.setAlamat("klaten");
        
        System.out.println(test.toString());
        System.out.println(test1.toString());
        
        RumahSakit rs = new RumahSakit("Panti Rapih","Yogyakarta");
        rs.tambahPasienBaru(test);
        rs.tambahPasienBaru(test1);
        
        rs.simpanDaftarPasien(new File("daftar.txt"));
    }
}
