/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewCanvas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author user only
 */
public class LogoPanel extends JPanel {

    public void paintComponent(Graphics g) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("logo_usd.jpg"));
        } catch (IOException e) {
        }
        g.drawImage(img, 0, 0, this);
    }
}
