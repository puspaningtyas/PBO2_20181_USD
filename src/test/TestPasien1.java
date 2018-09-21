/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import model.Pasien;

/**
 *
 * @author admin
 */
public class TestPasien1 {
    public static void main(String[] args) {
        Pasien puspa = new Pasien("Puspa");
        puspa.setTanggalLahir(12);
        puspa.setBulanLahir(1);
        puspa.setTahunLahir(1974);
        System.out.println("Umur = "+puspa.getUsia());
    }
    
}
