/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test22Oktober2018;

import modelUniversitas.Mahasiswa;

/**
 *
 * @author user only
 */
public class TestString1 {
    public static void main(String[] args) {
        String email="puspa@usd.ac.id";
        System.out.println("is "+email +" email? "+email.contains("@"));
        String data[] = email.split("@");
        System.out.println("Data ke-0 = "+data[0]);
        System.out.println("Data ke-1 = "+data[1]);
        String pasien ="001\tpuspa\tklaten\n";
        System.out.println("Pasien = "+pasien);
        String dataPasien[] = pasien.split("\t");
        System.out.println("No RM = "+dataPasien[0]
                +",Nama = "+dataPasien[1]
                +",Alamat= "+dataPasien[2]);
        String mahasiswa ="001\tPuspa\n";
        String dataMahasiswa[] = mahasiswa.split("\t");
        System.out.println("NIM : "+dataMahasiswa[0]
                +", Nama : "+dataMahasiswa[1]);
        Mahasiswa mhs = new Mahasiswa();
        mhs.toMahasiswa(mahasiswa);
        System.out.println(mhs.toString());
        String data1=new String("puspa@usd.ac.id");
        String data2=new String("puspa@usd.ac.id");
        
        if(data1==data2){
            System.out.println("Sama persis");
        } else{
            System.out.println("tidak sama");
        }
    }
}
