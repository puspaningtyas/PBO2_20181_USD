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
public class TestStream2 {
    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit("Panti Rapih","yogyakarta");
        rs.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < rs.getDaftarPasien().size(); i++) {
            System.out.println(rs.getDaftarPasien().get(i).toString());
           
        }
    }
}
