/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test21September;

import model.AntrianKlinik;
import model.Klinik;

/**
 *
 * @author user only
 */
public class TestAntrianKlinik2 {
    public static void main(String[] args) {
        AntrianKlinik.buatAntrian(
                21, 
                9, 
                2018, 
                new Klinik("001","anak"));
        
        AntrianKlinik.buatAntrian(
                21, 
                9, 
                2018, 
                new Klinik("002","saraf"));
        
        AntrianKlinik.buatAntrian(
                21, 
                9, 
                2018, 
                new Klinik("001","anak"));
        for (int i = 0; i < AntrianKlinik.daftarAntrian.size(); i++) {
            System.out.println();
        }
    }
    
}
