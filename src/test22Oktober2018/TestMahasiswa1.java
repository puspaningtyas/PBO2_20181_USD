/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test22Oktober2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelUniversitas.Mahasiswa;

/**
 *
 * @author user only
 */
public class TestMahasiswa1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            Mahasiswa test1 = new Mahasiswa("001","puspa");
            File file = new File("mhs.txt");
            fos = new FileOutputStream(file);
            fos.write(test1.toString().getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestMahasiswa1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestMahasiswa1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestMahasiswa1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
