/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test22Oktober2018;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelUniversitas.KelasKuliah;

/**
 *
 * @author user only
 */
public class TestDaftarKelasKuliah2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("kelas.txt");
            fis = new FileInputStream(file);
            ObjectInputStream is = new ObjectInputStream(fis);
            KelasKuliah kelas =(KelasKuliah) is.readObject();
            System.out.println(kelas.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestDaftarKelasKuliah2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestDaftarKelasKuliah2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestDaftarKelasKuliah2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestDaftarKelasKuliah2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
