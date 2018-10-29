/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test29Oktober2018;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user only
 */
public class TestCanvas1 {
  public static void main(String args[]) {
    JDialog frame;
    frame = new JDialog();
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new OvalPanelCanvas());
    frame.setSize(500, 300);
    frame.setVisible(true);
  }    
}
class OvalPanelCanvas extends JPanel {
  public OvalPanelCanvas() {
  }
  public void paintComponent(Graphics g) {
//    int width = getWidth();
//    int height = getHeight();
    int width = 25;
    int height = 25;
    int centerX = 100;
    int centerY = 20;
    g.setColor(Color.black);
    g.setColor(Color.red);
    g.fillOval(centerX, centerY, width, height);
  }

}
