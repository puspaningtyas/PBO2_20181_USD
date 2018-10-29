/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCanvas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelCanvas.Bola;

/**
 *
 * @author user only
 */
public class OvalPanelCanvas extends JPanel {

    private Bola bola = new Bola();
    private Bola bola1 = new Bola();
    private ArrayList<Bola> daftarBola = new ArrayList<Bola>();

    public OvalPanelCanvas() {
    }

    public void tambahBola(Bola bola) {
        daftarBola.add(bola);
    }

    @Override
    public void paintComponent(Graphics g) {
//    int width = getWidth();
//    int height = getHeight();
        int width = getBola().getDiameter();
        int height = getBola().getDiameter();
        int centerX = getBola().getPosisiX();
        int centerY = getBola().getPosisiY();
        g.setColor(Color.red);
        g.fillOval(centerX, centerY, width, height);

        width = getBola1().getDiameter();
        height = getBola1().getDiameter();
        centerX = getBola1().getPosisiX();
        centerY = getBola1().getPosisiY();
        g.setColor(Color.red);
        g.fillOval(centerX, centerY, width, height);

        for (int i = 0; i < daftarBola.size(); i++) {
            width = daftarBola.get(i).getDiameter();
            height = daftarBola.get(i).getDiameter();
            centerX = daftarBola.get(i).getPosisiX();
            centerY = daftarBola.get(i).getPosisiY();
            g.setColor(Color.green);
            g.fillOval(centerX, centerY, width, height);

        }
    }

    /**
     * @return the bola
     */
    public Bola getBola() {
        return bola;
    }

    /**
     * @param bola the bola to set
     */
    public void setBola(Bola bola) {
        this.bola = bola;
    }

    /**
     * @return the bola1
     */
    public Bola getBola1() {
        return bola1;
    }

    /**
     * @param bola1 the bola1 to set
     */
    public void setBola1(Bola bola1) {
        this.bola1 = bola1;
    }

}
