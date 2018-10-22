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
import modelUniversitas.Mahasiswa;

/**
 *
 * @author user only
 */
public class TestMahasiswa3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("mhs1.txt");
            fis = new FileInputStream(file);
            ObjectInputStream is = new ObjectInputStream(fis);
            Mahasiswa temp = (Mahasiswa) is.readObject();
            System.out.println("Mahasiswa = "+temp.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestMahasiswa3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestMahasiswa3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestMahasiswa3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(TestMahasiswa3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
