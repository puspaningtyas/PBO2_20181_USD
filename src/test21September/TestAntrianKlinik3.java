/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test21September;

import model.AntrianKlinik;
import model.Klinik;
import model.Pasien;
import model.RumahSakit;

/**
 *
 * @author user only
 */
public class TestAntrianKlinik3 {

    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit("Panti Rapih","yogyakarta");
        
        rs.buatAntrianKlinik(
                21,
                9,
                2018,
                new Klinik("001", "anak"));

        rs.buatAntrianKlinik(
                21,
                9,
                2018,
                new Klinik("002", "saraf"));

        rs.buatAntrianKlinik(
                21,
                9,
                2018,
                new Klinik("001", "anak"));
        for (int i = 0; i < rs.getDaftarAntrianKlinik().size(); i++) {
            System.out.println(rs.getDaftarAntrianKlinik().get(i));
        }

        Pasien pasien1 = new Pasien();
        pasien1.setNama("puspa");
        pasien1.setAlamat("klaten");

        Pasien pasien2 = new Pasien();
        pasien2.setNama("adi");
        pasien2.setAlamat("klaten");

        int indeksAntrian = rs.cariAntrianKlinik(21, 9, 2018, new Klinik("001", "anak"));
        if (indeksAntrian > 0) {
            rs.getDaftarAntrianKlinik().get(indeksAntrian).mendaftar(pasien1);
            rs.getDaftarAntrianKlinik().get(indeksAntrian).mendaftar(pasien2);
        }
        for (int i = 0; i < rs.getDaftarAntrianKlinik().get(indeksAntrian).getDaftarPasien().size(); i++) {
            System.out.println(rs.getDaftarAntrianKlinik().get(indeksAntrian).getDaftarPasien().get(i));
        }
    }

}
