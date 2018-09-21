/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPraktikum;

import model.Pasien;

/**
 *
 * @author user only
 */
public class TestPasien2 {
    public static void main(String[] args) {
        Pasien test1 = new Pasien("12345","Puspa");
        Pasien test2 = new Pasien("12346","Puspa1");
        Pasien test3 = new Pasien("12347","Puspa2");
        Pasien test4 = new Pasien("12348","Puspa3");
        
        Pasien.tambahPasien(test1);
        Pasien.tambahPasien(test2);
        Pasien.tambahPasien(test3);
        Pasien.tambahPasien(test4);
        
        for (int i = 0; i < Pasien.getDaftarPasien().size(); i++) {
            System.out.println("RM: "+Pasien.getDaftarPasien().get(i).getNoRM()
                    +","+Pasien.getDaftarPasien().get(i).getNama());
        }
        
        System.out.println("Cari = "+Pasien.cariPasien("12345").getNama());
    }
}
