/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test29Oktober2018;

import modelCanvas.Bola;
import viewCanvas.BolaDialog;
import viewCanvas.OvalPanelCanvas;

/**
 *
 * @author user only
 */
public class TestBolaDialog {
    public static void main(String[] args) {
        BolaDialog test = new BolaDialog(null,true);
        OvalPanelCanvas canvas = new OvalPanelCanvas();
        Bola bola = new Bola(50, 50, 30);
        Bola testbola = new Bola(50, 100, 30);
        canvas.setBola(bola);
        canvas.setBola1(testbola);
        
        Bola bola1 = new Bola(80, 50, 20);
        Bola bola2 = new Bola(110, 50, 20);
        Bola bola3 = new Bola(140, 50, 20);
        Bola bola4 = new Bola(170, 50, 20);
        
        canvas.tambahBola(bola1);
        canvas.tambahBola(bola2);
        canvas.tambahBola(bola3);
        canvas.tambahBola(bola4);
        
        test.getContentPane().add(canvas);
        test.setSize(500, 300);
        test.setVisible(true);
        
    }
}
