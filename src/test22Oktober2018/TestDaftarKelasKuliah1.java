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
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelUniversitas.KelasKuliah;
import modelUniversitas.Mahasiswa;

/**
 *
 * @author user only
 */
public class TestDaftarKelasKuliah1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            Mahasiswa mhs1 = new Mahasiswa("001","Puspa");
            Mahasiswa mhs2 = new Mahasiswa("002","Adi");
            KelasKuliah kelas = new KelasKuliah("001", "Pbo2");
            kelas.tambahMahasiswa(mhs1);
            kelas.tambahMahasiswa(mhs2);
            System.out.println(kelas.toString());
            File file = new File("kelas.txt");
            fos = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(kelas);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestDaftarKelasKuliah1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestDaftarKelasKuliah1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(TestDaftarKelasKuliah1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
