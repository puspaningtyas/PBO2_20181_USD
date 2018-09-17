/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testView;

import view.TambahPasienDialog;

/**
 *
 * @author user only
 */
public class TestDialog1 {
    public static void main(String[] args) {
        TambahPasienDialog test = new TambahPasienDialog(null,"ini latihan");
        test.setSize(300, 400);
        test.setVisible(true);
    }
}
